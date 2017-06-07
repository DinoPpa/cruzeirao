package cruzeirao.model;

import javax.persistence.*;

@Entity
public class EventoPartida  implements EntityModel{
	@Override public long getId() {
		return id;
	}

	@Override public void setId(long id){
		this.id = id;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public DadosPartida getPartida() {
		return partida;
	}

	public void setPartida(DadosPartida partida) {
		this.partida = partida;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Jogador jogador;
	
	@ManyToOne
	private DadosPartida partida;
	
	private int tempo;
}
