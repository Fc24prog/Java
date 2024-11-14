package modelo;

public class Data1411 {

private int dia;
    private int mes;
    private int ano;

    public int getDia()
    {
    return dia;
    }
    public void setDia(int dia)
    {
   
    this.dia = dia;
    }
    public int getMes()
    {
    return mes;
    }
    public void setMes(int mes)
    {
    this.mes = mes;
     }
    public int getAno()
    {
    return ano;
    }
    public void setAno(int ano)
    {
    this.ano = ano;
     }
   
    public Data1411(int dia, int mes, int ano)
    {
    super();
    this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean comparaData(int d, int m, int a)
    {
    if (d==this.dia && m==this.mes && a==this.ano)
    return true;
        return false;
        }

   public String toString()
   {
  return ("\n" + dia + "/ " + mes + "/" + ano);
   }}


// data é o mesmo do exemplo passado, foi usado nesse exemplo.
// Data faz parte de funcionario, pessoa.
