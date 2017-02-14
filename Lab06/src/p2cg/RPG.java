package p2cg;

public class RPG extends Jogo {

	public RPG(String nomeJogo, double precoJogo) {
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

	@Override
	public boolean registraJogadax2p(String nomeJogo, int score, boolean zeraJogo) {
		
		
	}
	
	
	
	
}
