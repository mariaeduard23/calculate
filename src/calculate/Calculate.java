package calculate;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
			System.out.println("Qual operacao deseja realizar?");
		String opcao = teclado.next();
			
			System.out.println("Digite os primeiro valor: ");
		double x = teclado.nextDouble();
			System.out.println("Digite o segundo valor:");
		double y = teclado.nextDouble();
		
			
		
		if(opcao.equals("somar")) {
			System.out.println("Resultado: " + sum(x, y));
		}else if (opcao.equals("substrair")) {
			System.out.println("Resultado: " + minus(x, y));
		}else if (opcao.equals("multiplicar")) {
			System.out.println("Resultado: " + mul(x, y));
		}else if (opcao.equals("dividir")) {
			System.out.println("Resultado: " + div(x, y));
		}else if (opcao.equals("raiz")) {
			System.out.println("Resultado: " + raiz(x, y));
		}else if (opcao.equals("potencia")) {
			System.out.println("Resultado: " + poten(x, y));
		}else {
			System.out.println("Nenhuma instrucao definida.");
			
		}
		
		
		
		
	}
	
	static double sum(double x, double y) {
		return x + y;
	}
	
	static double minus(double x, double y) {
		return x - y;
		
	}
	
	static double mul(double x, double y) {
		return x * y;
	}
	
	static double div(double x, double y) {
		return x / y;
	}
	
	static double raiz(double x, double y) {
		return Math.sqrt(x);
	}
	
	static double poten(double x, double y) {
		return Math.pow(x, y);
	}
	
	
	
	
	
	
	
}
