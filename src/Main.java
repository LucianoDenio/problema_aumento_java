import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			porcentagem = 20;
			aumento = salario/100 *20;
			novoSalario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f %n", novoSalario);
			System.out.printf("Aumento = R$ %.2f %n", aumento);
			System.out.println("Porcentagem = " + porcentagem + "%");	
		}
		else if(salario <= 3000) {
			porcentagem = 15;
			aumento = salario/100 *15;
			novoSalario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f %n", novoSalario);
			System.out.printf("Aumento = R$ %.2f %n", aumento);
			System.out.println("Porcentagem = " + porcentagem + "%");	
		}
		else if(salario <= 8000) {
			porcentagem = 10;
			aumento = salario/100 *10;
			novoSalario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f %n", novoSalario);
			System.out.printf("Aumento = R$ %.2f %n", aumento);
			System.out.println("Porcentagem = " + porcentagem + "%");
		}
		else {
			porcentagem = 5;
			aumento = salario/100 *5;
			novoSalario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f %n", novoSalario);
			System.out.printf("Aumento = R$ %.2f %n", aumento);
			System.out.println("Porcentagem = " + porcentagem + "%");
		}
		
		sc.close();
	}
}