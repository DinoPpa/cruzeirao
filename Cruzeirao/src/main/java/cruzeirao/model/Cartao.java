package cruzeirao.model;

import javax.persistence.*;

@Entity
public class Cartao extends EventoPartida {
	public EnumTipoCartao getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoCartao tipo) {
		this.tipo = tipo;
	}

	private EnumTipoCartao tipo;
}
