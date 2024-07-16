package desafio_poo_dio.desafio.dominio;

public abstract class Conteudo {

	protected static final Double XpPadrao = 10d;

	private String titulo;
	private String descricao;

	public abstract Double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
