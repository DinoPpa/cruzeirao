package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class DadosPartida implements EntityModel {
	@Override public long getId() {
		return id;
	}

	@Override public void setId(long id){
		this.id = id;
	}

	public List<Gol> getGolsMandante() {
		return golsMandante;
	}

	public void setGolsMandante(List<Gol> golsMandante) {
		this.golsMandante = golsMandante;
	}

	public List<Gol> getGolsVisitante() {
		return golsVisitante;
	}

	public void setGolsVisitante(List<Gol> golsVisitante) {
		this.golsVisitante = golsVisitante;
	}

	public List<Gol> getGolsPenalteMandante() {
		return golsPenalteMandante;
	}

	public void setGolsPenalteMandante(List<Gol> golsPenalteMandante) {
		this.golsPenalteMandante = golsPenalteMandante;
	}

	public List<Gol> getGolsPenalteVisitante() {
		return golsPenalteVisitante;
	}

	public void setGolsPenalteVisitante(List<Gol> golsPenalteVisitante) {
		this.golsPenalteVisitante = golsPenalteVisitante;
	}

	public List<Falta> getFaltasMandante() {
		return faltasMandante;
	}

	public void setFaltasMandante(List<Falta> faltasMandante) {
		this.faltasMandante = faltasMandante;
	}

	public List<Falta> getFaltasVisitante() {
		return faltasVisitante;
	}

	public void setFaltasVisitante(List<Falta> faltasVisitante) {
		this.faltasVisitante = faltasVisitante;
	}

	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}

	public void setCartoesMandante(List<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}

	public List<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}

	public void setCartoesVisitante(List<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}

	public String getRelatoJuiz() {
		return relatoJuiz;
	}

	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@OneToMany(mappedBy="partida")
	private List<Gol> golsMandante;
	
	@OneToMany(mappedBy="partida")
	private List<Gol> golsVisitante;
	
	@OneToMany(mappedBy="partida")
	private List<Gol> golsPenalteMandante;
	
	@OneToMany(mappedBy="partida")
	private List<Gol> golsPenalteVisitante;
	
	@OneToMany(mappedBy="partida")	
	private List<Falta> faltasMandante;
	
	@OneToMany(mappedBy="partida")
	private List<Falta> faltasVisitante;
	
	@OneToMany(mappedBy="partida")
	private List<Cartao> cartoesMandante;
	
	@OneToMany(mappedBy="partida")
	private List<Cartao> cartoesVisitante;
	
	private String relatoJuiz;
}
