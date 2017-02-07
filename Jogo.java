package p2cg;

public abstract class Jogo {
	
	private String nomeJogo;
	private double precoJogo;
	private int maiorScore;
	private int QtdVezesJogadas;
	private int ZerouJogo;
	
	public Jogo(String nomeJogo, double precoJogo) {
		this.nomeJogo = nomeJogo;
		this.precoJogo = precoJogo;
		this.maiorScore = 0;
		this.QtdVezesJogadas = 0;
		this.ZerouJogo = 0;
	}
	
	public int registraJogada(int score, boolean zeraJogo) {
		if(score > maiorScore)
			maiorScore = score;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
