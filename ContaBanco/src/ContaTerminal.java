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
				
				System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
			}
		}
	}

}
