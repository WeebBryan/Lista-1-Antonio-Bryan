import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.println("Insira o valor para A: ");
		a = scan.nextInt();

		System.out.println("Insira o valor para B: ");
		b = scan.nextInt();

		System.out.println("Questao 1:");
		if (a > 10) {
			System.out.println("A > 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 2:");

		boolean afirmativa = false;
		if (a < 10) {
			System.out.println("A < 10");
			afirmativa = true;
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
			afirmativa = true;
		}
		if (afirmativa == false)
			System.out.println("numero nao valido");

		System.out.println("Questao 3:");

		if (a == 10) {
			System.out.println("A == 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (b == 10) {
			System.out.println("B == 10");
		}

		System.out.println("Questao 4:");

		if (a > 10 || a + b == 20) {
			System.out.println("numero valido");
		} else if (a == b) {
			System.out.println("A = B; A e B sao diferentes de 10; A e menor que 10");
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 5:");

		if (a > 10 || a + b == 20) {
			System.out.println("numero valido");
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 6:");

		if (a > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if (a + b == 20) {
			System.out.println("A = B == 20");
		} else {
			System.out.println("A + B != 20");
		}

		System.out.println("Questao 7:");

		if (a > 10) {
			if (a + b == 20) {
				System.out.println("numeros validos");
			}
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 8:");

		if (a < 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("numero nao valido");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 9:");

		if (a > 10 && a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("numero nao valido");
		}

		System.out.println("Questao 10:");

		if (a > 10) {
			System.out.println("numero menor que 10");
		}
		if (a + b != 20) {
			System.out.println("numero diferente de 20");
		}

		System.out.println("Questao 11:");

		if (a < 10) {
			if (a + b == 20) {
				System.out.println("A + B == 20");
			}
			if (a < 10 && a + b != 20) {
				System.out.println("numero nao valido");
			}

		}

		System.out.println("Questao 12:");

		boolean entrada = false;
		if (a > 10) {
			System.out.println("A > 10");
			entrada = true;
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
			entrada = true;
		}
		if (entrada == false)
			System.out.println("numeros nao validos");

		System.out.println("Sejam bem-vindos disciplina de Tecnicas de Programacao.");

		System.out.println("Questao 13:");

		boolean imput = false;
		if (a > 10) {
			System.out.println("A > 10");
			imput = true;
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
			imput = true;
		}
		if (imput == false)
			System.out.println("numeros nao validos");
	}
}