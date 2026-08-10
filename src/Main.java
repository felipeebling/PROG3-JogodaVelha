import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static char[][] copiarMatriz(char[][] matriz) {

		char[][] copia = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				copia[i][j] = matriz[i][j];
			}
		}

		return copia;
	}

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		Stack<char[][]> pilha = new Stack<char[][]>();
		tabuleiro tab = new tabuleiro();

		jogador jogador1 = new jogador();

		boolean jogando = true;
		int contador = 0;

		System.out.println("Digite o nome do jogador 1");
		jogador1.setNome(e.nextLine());

		jogador1.setLetra('O');

		jogador jogador2 = new jogador();
		System.out.println("Digite o nome do jogador 2");
		jogador2.setNome(e.nextLine());
		jogador2.setLetra('X');

		System.out.println("================================");
		System.out.println("Tabuleiro Inicial");

		tab.mostrarTabuleiro();

		while (jogando) {

			pilha.add(tab.getTab());

			System.out.println("Vez do " + jogador1.getNome());
			tab.jogar(jogador1);

			System.out.println("Vez do " + jogador2.getNome());
			tab.jogaraleatorio(jogador2);

			if (tab.verificarVitoria(jogador1)) {
				System.out.println("O jogador " + jogador1.getNome() + " venceu");
				jogando = false;
			} else if (tab.verificarVitoria(jogador2)) {
				System.out.println("O jogador " + jogador2.getNome() + " venceu");
				jogando = false;
			}
			{
				contador++;
				if (contador == 9) {
					System.out.println("Deu velha");
					jogando = false;
				}
			}
			contador++;

			System.out.println("================================");
			System.out.println("Tabuleiro Atual");
			tab.mostrarTabuleiro();

			System.out.println("Deseja voltar a jogada anterior? S/N ");
			String resposta = e.next();

			if (resposta.equals("S") || resposta.equals("s")) {

				tab.setTab(pilha.pop());

				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("Tabuleiro conheceu a viagem no tempo!!");
				contador--;
				tab.mostrarTabuleiro();
				System.out.println();
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

			}

		}
	}

}