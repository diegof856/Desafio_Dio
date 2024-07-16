package desafio_poo_dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate datafinal = dataInicial.plusDays(45);
	private Set<Dev> devInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	public Set<Dev> getDevInscritos() {
		return devInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataInicial, datafinal, descricao, devInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(datafinal, other.datafinal) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devInscritos, other.devInscritos) && Objects.equals(nome, other.nome);
	}
	

}
