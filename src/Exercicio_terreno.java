import java.util.Locale;
import java.util.Scanner;

public class Exercicio_terreno {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.print("Digite a largura do terreno:");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado do terreno:");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		//System.out.printf(" %.1f%n", largura);
		//System.out.printf("Digite a largura do terreno: %.1f%n", comprimento);
		//System.out.printf("Digite a largura do terreno: %.2f%n", metroQuadrado);
		System.out.printf("Área =  %.2f\n", area);
		System.out.printf("Preço =  %.2f\n", preco);
		
		sc.close();
		
		
		
		
		

	}
}
