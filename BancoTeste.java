package bancoTeste;
import banco.Conta;
public class BancoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new Conta (10,"Cássia",1,100.00000,50.000); // conta corrente
		Conta conta2 = new Conta (20,"Josias",2,500.000,30.000); // conta poupança
        
	    // Realizando operações com a conta1 (Cássia - conta corrente)

		
		conta1.depositar(200.00);  // Depósito de R$200
	    conta1.sacar(100.00);      // Saque de R$100
	    conta1.consultarSaldo();   // Consultar saldo de João
	    
	    // Realizando operações com a conta2 (Josias - conta poupança)

	    conta2.depositar(150.00);  // Depósito de R$150
	    conta2.sacar(50.00);       // Saque de R$50
	    conta2.consultarSaldo();   // Consultar saldo de Maria
	    
	    conta1.transferir(1000.00, conta2); // Transferindo mil reais de Cássia p/ Josias;

         // Consultando os saldos finais
        conta1.consultarSaldo();  // Consultar saldo de João
        conta2.consultarSaldo();  // Consultar saldo de Maria
}
}

