
public class jogador {

	private String nome;
	private char letra;

	public jogador() {

	};

	public jogador(char l, String no) {
		this.letra = l;
		this.nome = no;
	};

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
