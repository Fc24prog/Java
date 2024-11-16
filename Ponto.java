package Exemplo;

public class Ponto {
	
	private int x;
    private int y ;
    public Ponto(int x, int y)
    {
    	super();
        this.x = x;
        this.y = y;
    }
     public void setX(int x)
   {
    this.x = x;
   
   }
     public int getX()
    {
    return x;
    }
     public int getY()
     {
    	 
    	 return y;
     }
     public void setY(int y)
     {
    	 this.y = y; 
    	 
     }
      
     public String toString() 
     {
    	 return ("Dados do ponto\n Coordenada x: "+ this.x +"\nCoordenada y: " + this.y);
    	 }
    
     public boolean eIgual(Ponto p2)
     {
    	 if(this.x==p2.getX()&& this.y==p2.getY())
    		 return true;
         return false;
         
         
     }}
     
     
     
     