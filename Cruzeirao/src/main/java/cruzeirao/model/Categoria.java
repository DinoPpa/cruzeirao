package cruzeirao.model;

import java.util.*;

import javax.persistence.Entity;

@Entity
public class Categoria {
	private String nome;
	private int nascidosApartirDe;
	private int minJogadores;
	private int maxJogadores;
	private EnumTipoCategoria sexo;
}
