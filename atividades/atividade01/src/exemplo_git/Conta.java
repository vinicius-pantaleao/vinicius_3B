package exemplo_git;

public class Conta {
	
	public double saldo;
	
	public void depositar(Double valor)
	{
		this.saldo += valor;		
	}
	
	public static void metodo(String nome)
	{
		System.out.println(nome);
	}

}
