package cruzeirao.model;

import javax.persistence.*;

@Entity
public class Gol extends EventoPartida {
	public boolean isDecisaoNosPenaltes() {
		return decisaoNosPenaltes;
	}

	public void setDecisaoNosPenaltes(boolean decisaoNosPenaltes) {
		this.decisaoNosPenaltes = decisaoNosPenaltes;
	}

	private boolean decisaoNosPenaltes;
}
