package estadia_componente_reutilizavel;

import java.util.Scanner;

public class testa_estadia {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		Calculo_Estadia calculo = new Calculo_Estadia();
		String nome;
		int noite, quantidade;
		double valorLigacao;
		double valorRefeicao;
		double imposto;
		double estadia;
		System.out.println("Digite nome do hóspede: ");
		nome=in.nextLine();
		pessoa.setNome(nome);
		System.out.println("Digite a quantidade de ligacoes: ");
		quantidade = in.nextInt();
		while (quantidade >0) {
		System.out.println("Digite no valor da ligacao: ");
		valorLigacao = in.nextDouble();
		calculo.valorTotalLigacao(valorLigacao);
		quantidade--;
		}
		System.out.println("Digite a quantidade de refeicoes: ");
		quantidade = in.nextInt();
		while (quantidade > 0) {
		System.out.println("Digite o valor da refeicao: ");
		valorRefeicao = in.nextDouble();
		calculo.valorTotalRefeicao(valorRefeicao);
		quantidade --;
		}
		System.out.println("\nDigite número de noites do hóspede: ");
		noite = in.nextInt();
		calculo.setNoites(noite);
		System.out.println("\nDigite o valor do imposto: ");
		imposto = in.nextDouble();
		calculo.setImposto(imposto);
		System.out.println("\nDigite o valor da estadia: ");
		estadia = in.nextDouble();
		calculo.setEstadia(estadia);
		
		System.out.printf("\nO valor da estadia do hospede %s é %.2f", pessoa.getNome(), calculo.calcular());
	}



}
