package p2cg;

public class Luta extends Jogo {

	public Luta(String nomeJogo, double precoJogo) {
		super(nomeJogo, precoJogo);
	
	}

	@Override
	public boolean registraJogada(int score, boolean zeraJogo) {
		
		if(score > maiorScore) {
			maiorScore = score;
		}
		if (zeraJogo == true) {
			return true;
		}
		return false;
	}
	
	
	
	
}
