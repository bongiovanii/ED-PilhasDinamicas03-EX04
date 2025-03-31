package view;

import java.util.Scanner;

import br.edu.fateczl.pilha.PilhaInt;
import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		NPRController npr = new NPRController();
		Scanner sc = new Scanner(System.in);
		PilhaInt p = new PilhaInt();
		
		int opc = 0;

		while (opc != 3) {
			System.out.println("Calculadora RPN \n1-Inserir Números\n2-Inserir Operação\n3-Sair");
			opc = sc.nextInt();
			switch (opc) {

			case 1:
				System.out.println("Insira o valor: ");
				int valor = sc.nextInt();
				npr.insereValor(p,valor);
				break;
			case 2:
				System.out.println("Insira a operação: ");
				String operacao = sc.next();
				npr.npr(p,operacao);
				break;
			case 3:
				System.out.println("Fim do programa");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		}

	}

}
