import java.util.Scanner;

public class Calculadora {
	//public static double valor1 = 0;
	//public static double valor2 = 0;
	//public static double soma, subtracao, divisao, multiplicacao;

	public static void mostrarMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
		System.out.println("6 - Sair");		
	}
	
	public static void somar(double valorA, double valorB) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valorA + " e " + valorB);
		soma = valorA + valorB;
		//System.out.println("O resultado foi " + soma + "!\n\n");
		exibirResultado(soma);
	}
	
	public static void subtrair(double valorA, double valorB) {
		//double subtracao;
		System.out.println("\n\nRealizando a subtra��o entre " + valorA + " e " + valorB);
		//subtracao = valorA - valorB;
		//System.out.println("O resultado foi " + subtracao + "!\n\n");
		exibirResultado(valorA - valorB);
	}
	
	public static void dividir(double valorA, double valorB) {
		double divisao;
		System.out.println("\n\nRealizando a divis�o entre " + valorA + " e " + valorB);
		divisao = valorA / valorB;
		System.out.println("O resultado foi " + divisao + "!\n\n");
	}
	
	public static void multiplicar(double valorA, double valorB) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplica��o entre " + valorA + " e " + valorB);
		multiplicacao = valorA * valorB;
		System.out.println("O resultado foi " + multiplicacao + "!\n\n");
	}
	
	public static void exibirResultado (double resultado) {
		System.out.println("O resultado foi "+ resultado + "!\n");
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		//double soma, subtracao, divisao, multiplicacao;*/
		int opcao = 0;
		
		while (opcao!=6) {
			mostrarMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				break;
			case 2:
				somar(valor1, valor2);
				break;
			case 3:
				subtrair(valor1, valor2); 
				break;
			case 4:
				dividir(valor1, valor2);
				break;
			case 5:
				multiplicar(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
