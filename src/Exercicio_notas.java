import java.util.Locale;
import java.util.Scanner;

public class Exercicio_notas {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
		 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final
		 * que o aluno obteve (com uma casa decimal) no ano juntamente com um texto
		 * explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
		 * mensagem "REPROVADO".
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double nota1, nota2, notaFinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		System.out.printf("Nota final: %.1f\n", notaFinal);
		
		if(notaFinal < 60) {
			System.out.print("Reprovado!!");
		}
		
		sc.close();
		
		
	}
}
