import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			{
			
				int Numero;
				String Agencia;
				String Nome;
				float Saldo;
				
				System.out.println("Informe o numero da conta: ");
				Numero = sc.nextInt();
				
				System.out.println("Informe o numero da Agencia: ");
				Agencia = sc.next();
				
				System.out.println("Informe o valor do Saldo: ");
				Saldo = sc.nextFloat();
				
				System.out.println("Informe o Nome do Cliente: ");
				Nome = sc.next();
				
				System.out.println("Ol� " + Nome + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " j� est� dispon�vel para saque");
			}
		}
	}

}
