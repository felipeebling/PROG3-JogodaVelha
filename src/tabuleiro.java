import java.util.Scanner;

public class tabuleiro {
	
	static Scanner e = new Scanner(System.in);

private char[][] tab = new char [3][3];

public char[][] getTab() {
	return tab;
}

public void setTab(char[][] tab) {
	this.tab = tab;
}

public tabuleiro() {
	for	(int i = 0 ; i < 3; i++) {
		for(int k = 0 ; k < 3; k++) {
			tab[i][k] =  '-';
			
		}
	}
}


public void  mostrarTabuleiro() {
	
	for	(int i = 0 ; i < 3; i++) {
		for(int k = 0 ; k < 3; k++) {
			System.out.print(tab[i][k]) ;
		}
		System.out.println();
	}
}

	public boolean VerificarPosicaoTabLivre(int i , int k, jogador j) {
		if(tab[i][k] == '-') {
			tab[i][k] = j.getLetra();
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public boolean VerificarPosicaoTabOcupada(int i , int k) {
		if(tab[i][k] == 'X' || tab[i][k] == 'O' ) {
			return true;
		}else {
			return false;
		}
	
	}
	
	public void jogar(jogador j) {
    boolean jogou = true;
    
    while(jogou) {
	System.out.println("Digite a posição i e k :");
	String jogada = e.next();
	int i = jogada.charAt(0) - '0';
	int k = jogada.charAt(1) - '0';

	
	if(VerificarPosicaoTabLivre(i,k,j)  ) {
    	jogou = false;
    }
    
	}
		 
		
		
		
	}

	public void jogaraleatorio(jogador j) {
		boolean jogou = true;
		
		while(jogou) {
			int i = (int)(Math.random() * 3);
			int k = (int)(Math.random() * 3);
			
			if(VerificarPosicaoTabLivre(i,k,j)  ) {
		    	jogou = false;
		    }
		}
	}


	
	public boolean verificarVitoria(jogador j) {
		char letra = j.getLetra();
		

		for(int p = 0; p < 2; p++) {
			
		for(int i = 0 ; i < 3; i++) {
			if(tab[i][0] == letra && tab[i][1] == letra && tab[i][2] == letra) {
				return true;
			}
			if(tab[0][i] == letra && tab[1][i] == letra && tab[2][i] == letra) {
				return true;
			}
	
		}
		if(tab[0][0] == letra && tab[1][1] == letra && tab[2][2] == letra) {
			return true;
		}
		if	(tab[0][2] == letra && tab[1][1] == letra && tab[2][0] == letra) {
			return true;
		}

		
	}

		return false;
	}
	
	
	
}
