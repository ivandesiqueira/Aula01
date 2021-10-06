import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {

		System.out.println("Programa Educado FIAP!");
		System.out.println("Por favor, digite o seu nome: ");

		Scanner leitor = new Scanner(System.in);

		String nome;

		nome = leitor.next();
		System.out.println("Boa noite, " + nome);
		leitor.close();

	}

}
