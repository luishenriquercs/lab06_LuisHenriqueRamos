package p2cg;

import java.util.List;

public abstract class Jogo {
	
	private String nomeJogo;
	private double precoJogo;
	private int maiorScore;
	private int QtdVezesJogadas;
	private int ZerouJogo;
	private List<Jogabilidade> tipos;
	
	public Jogo(String nomeJogo, double precoJogo) {
		this.nomeJogo = nomeJogo;
		this.precoJogo = precoJogo;
		this.maiorScore = 0;
		this.QtdVezesJogadas = 0;
		this.ZerouJogo = 0;
	}

	
	public boolean registraJogada(int score, boolean zeraJogo) {
		if(score > maiorScore) {
			maiorScore = score;
			return true;
		}
		return false;
	}


	public String getNomeJogo() {
		return nomeJogo;
	}


	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}


	public double getPrecoJogo() {
		return precoJogo;
	}


	public void setPrecoJogo(double precoJogo) {
		this.precoJogo = precoJogo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
