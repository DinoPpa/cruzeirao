package cruzeirao.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Equipe implements EntityModel
{
	@Override public long getId() {
		return id;
	}

	@Override public void setId(long id){
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBrasao() {
		return brasao;
	}

	public void setBrasao(String brasao) {
		this.brasao = brasao;
	}

	public List<Diretor> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private Date dataFundacao;
	private String cidade;
	private String brasao;
	
	@ManyToMany(mappedBy="equipes")
	private List<Diretor> diretores;
}