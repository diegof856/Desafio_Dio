package desafio_poo_dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate data;

	public Mentoria() {

	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", data = " + data.format(this.formatter);
	}

	@Override
	public Double calcularXp() {

		return XpPadrao + 20d;
	}

}
