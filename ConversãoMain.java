import exemploMetodoStac.ConversaoUnidades;


class ConversãoMain
{
	public static void main(String[] args){
		
		System.out.println("100km correspondem a: " + ConversaoUnidades.kmMetro(100) + "metros.");
		
		System.out.println("10m correspondem a: " + ConversaoUnidades.metroCentimetro(10) + "centímetros.");
}
}