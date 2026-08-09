import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		
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



		tab.mostrarTabuleiro();

		while (jogando) {
			
			System.out.println("Vez do" + jogador1.getNome());
			tab.jogar(jogador1);

			System.out.println("Vez do" + jogador2.getNome());
		    tab.jogaraleatorio(jogador2);
			
			
			if	(tab.verificarVitoria(jogador1) ){
				System.out.println("O jogador "+ jogador1.getNome() +" venceu");
				jogando = false;
			}else if(tab.verificarVitoria(jogador2) ){
				System.out.println("O jogador "+ jogador2.getNome() +" venceu");
				jogando = false;
			}{
				contador++;
				if(contador == 9) {
					System.out.println("Deu velha");
					jogando = false;
				}
			}
			contador++;

			System.out.println("================================");
			System.out.println("Tabuleiro Atual");
			tab.mostrarTabuleiro();

			

		}

}
}

