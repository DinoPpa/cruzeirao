package cruzeirao.model;

import java.util.*;

public class Jogador extends UsuarioInscricao{
	private Date dataNascimento;
	private EnumSexo sexo;
	private int numeroCamisa;
	
	private int partidasSuspenso;
	
	private List<Gol> gols;
	private List<Falta> faltas;
	private List<Cartao> cartoes;
	private List<Partida> partidasJogadas;
}