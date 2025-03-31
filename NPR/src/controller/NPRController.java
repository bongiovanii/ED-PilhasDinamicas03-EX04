package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class NPRController {

	private int countPop = 0;
	

	public NPRController() {
		// TODO Auto-generated constructor stub
	}

	public void insereValor(PilhaInt p ,int valor) {
		p.push(valor);
		countPop++;
		
		System.out.println("Valor:" + valor);

	}

	public int npr(PilhaInt p, String op) {
		
		int resultado = 0;

		switch (op) {

		case "+":
			if (countPop >= 2) {
				try {
					
					int pop1 = p.pop();
					int pop2 = p.pop();
					resultado = pop1 + pop2;
					System.out.println("soma: "+ resultado);
					p.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				throw new Error("Não possui o minimo de dois valores");
			}

			break;

		case "-":
			if (countPop >= 2) {
				try {
					int pop1 = p.pop();
					int pop2 = p.pop();
					resultado = pop2 - pop1;
					System.out.println("subtração: "+ resultado);

					p.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				throw new Error("Não possui o minimo de dois valores");
			}

			break;

		case "*":
			if (countPop >= 2) {
				try {
					int pop1 = p.pop();
					int pop2 = p.pop();
					resultado = pop1 * pop2;
					System.out.println("multiplicação: "+ resultado);

					p.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				throw new Error("Não possui o minimo de dois valores");
			}
			break;

		case "/":
			if (countPop >= 2) {
				try {
					int pop1 = p.pop();
					int pop2 = p.pop();
					resultado = pop2 / pop1;
					System.out.println("divisão: "+ resultado);

					p.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				throw new Error("Não possui o minimo de dois valores");
			}
			break;

		default:
			throw new Error("Não é uma operação válida");

		}
		return resultado;

	}

}
