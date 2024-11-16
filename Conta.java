package banco;

public class Conta {
	
	private int numero_conta;
	private String nome_proprietario;
	private int tipo_conta;
	private double saldo, limite;
	
	public Conta(int numero_conta, String nome_proprietario, int tipo_conta,double saldo, double limite)
	{
		super();
		this.numero_conta = numero_conta;
		this.nome_proprietario = nome_proprietario;
		this.tipo_conta = tipo_conta;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getNome_proprietario() {
		return nome_proprietario;
	}

	public void setNome_proprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}

	public int getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(int Tipo_conta) {
		this.tipo_conta= tipo_conta;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	public boolean sacar(double valor)
	{
		if (valor<=0) 
		{
			System.out.println("O valor é negativo");
	         return false;
	     }

        if (this.tipo_conta == 1) {  // Conta corrente
            if (valor <= (this.saldo + this.limite))
            {
                this.saldo = this.saldo - valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                return true;
            } 
            else 
            {
                System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
                return false;
            }
        } 
        else if (this.tipo_conta == 2) {  // Conta poupança
            if (valor <= this.saldo) 
            {
            	this.saldo = this.saldo - valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                return true;
            }
            else 
            {
                System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
                return false;
            }
        }
	    this.saldo = this.saldo - valor;
	    return true;
	}
	public void depositar (double valor)
	{
		this.saldo= this.saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	}
	  public boolean transferir(double valor, Conta contaDestino) {
	        if (valor <= 0) 
	        {
	            System.out.println("O valor da transferência deve ser positivo.");
	            return false;
	        }

	        if (this.sacar(valor)) {  // Se o saque for bem-sucedido
	            contaDestino.depositar(valor);
	            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
	            return true;
	        }
	        return false;
	    }
	  public void consultarSaldo() {
	        System.out.println("Saldo atual da conta " + this.numero_conta + ": R$" + String.format("%.2f", this.saldo));
	    }

}


/* Considere um novo projeto para a implementação de parte de um sistema
bancário. Seu programa deve definir uma classe Conta com os seguintes
atributos:
 número da conta, nome do proprietário, tipo de conta (1- conta corrente
e 2- poupança), saldo e limite.
Defina os métodos get e set, conforme seja necessário e conveniente.

Uma conta poderá ter os seguintes métodos: sacar, depositar, consultar o saldo e
transferir um valor entre duas contas. Faça as devidas verificações relacionadas
ao saldo, de acordo com o tipo de conta! */