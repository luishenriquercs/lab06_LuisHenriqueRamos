package p2cg;

import java.util.List;

public abstract class Jogo {
	
	private String nomeJogo;
	private double precoJogo;
	protected int maiorScore = 0;
	private int QtdVezesJogadas = 0;
	private int ZerouJogo = 0;
	private List<Jogabilidade> tipos;
	
	public Jogo(String nomeJogo, double precoJogo) {
		this.nomeJogo = nomeJogo;
		this.precoJogo = precoJogo;
	}

	public abstract boolean registraJogada(int score, boolean zeraJogo);
	public abstract boolean registraJogadax2p(String nomeJogo, int score, boolean zeraJogo);

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
