package p2cg;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nomeUsuario;
	private String login;
	private double dinheiroAtual;
	List<Jogo> jogosComprados;
	private int x2p = 0;
	
	public Usuario(String login, String nomeUsuario) {
		this.login = login;
		this.nomeUsuario = nomeUsuario;
		this.dinheiroAtual = 0;
		jogosComprados = new ArrayList<Jogo>();
	}
	
	public void adicionaDinheiro(double dinheiro) {
		dinheiroAtual += dinheiro;
	}
	
	public Jogo pesquisaJogo(String nome) {
		for(Jogo jogo: jogosComprados) {
			if(nome.equals(jogo.getNomeJogo())) {
				return jogo;
			}
		}
		return null;
	}
	
	public boolean compraJogo(String nome) {
		if (pesquisaJogo(nome) == null) {
			if(dinheiroAtual >= pesquisaJogo(nome).getPrecoJogo()) {
				dinheiroAtual -= pesquisaJogo(nome).getPrecoJogo();
				jogosComprados.add(pesquisaJogo(nome));
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
}
