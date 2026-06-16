package exemplo_git;

public class Main {
	public static void main(String args[])
	{
		
		Conta conta = new Conta();
		conta.saldo = 500;
		conta.depositar(500.00);
		System.out.println(conta.saldo);
		
		Conta.metodo("Pantaleao");
	}

}
