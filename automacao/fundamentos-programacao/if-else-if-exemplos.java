public class Exemplo {
	public static void main(String args[]) {
		int num = -5;
		if (num > 0) {
			System.out.println("O número é maior que zero");
		} else if (num < 0) {
			System.out.println("O número é menor que zero");
		} else {
			System.out.println("O número é igual a zero.");
		}

		int operacao = 2;
		if (operacao == 1) {
			System.out.println("Executando a operação 1");
		} else if (operacao == 2) {
			System.out.println("Executando a operação 2");
		} else if (operacao == 3) {
			System.out.println("Executando a operação 3");
		} else {
			System.out.println("Operação inválida.");
		}
	}
}
