package desafio_poo_dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private Integer cargaHororia;

	public Curso() {

	}

	public Integer getCargaHororia() {
		return cargaHororia;
	}

	public void setCargaHororia(Integer cargaHororia) {
		this.cargaHororia = cargaHororia;
	}

	@Override
	public String toString() {
		return "Curso titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHororia = " + cargaHororia+"h";
	}

	@Override
	public Double calcularXp() {

		return XpPadrao + this.cargaHororia;
	}
	
}
