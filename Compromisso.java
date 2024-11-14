package Model;

public class Compromisso {
	
	private Data dt;
    private Hora horario;
    private String descricao;

   public Compromisso(int dia, int mes, int ano, int h, int m, int s, String desc )
   {
	   dt = new Data(dia,mes,ano);
       horario = new Hora (h,m,s);
       descricao = desc;
    }
   public Compromisso (Data dt, Hora horario, String descricao)
 {
	   this.dt=dt;
       this.horario=horario;
       this.descricao=descricao;

}
  public Compromisso (int d, int m,int a, String descricao)
{
      dt= new Data (d,m,a);
      horario = new Hora (0,0,0);
      this.descricao=descricao;
}
  public String getDescricao()
  {
	  return descricao;
  }
   public void setDescricao(String descricao)
   {
      this.descricao = descricao;
   }
   public String toString()
  {
    return ("Compromisso: \n Descrição:" +descricao + "\nData:" + dt  +
"\nHorario" + horario);
  }  }

 /* composição - fazer parte de algo */
