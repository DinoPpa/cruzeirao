package cruzeirao.beans;

import java.util.List;

import javax.faces.bean.*;

import cruzeirao.model.*;
import cruzeirao.service.*;

@ManagedBean
@SessionScoped
public class InscricaoEquipeManagedBean {
	private InscricaoEquipe inscricaoEquipe = new InscricaoEquipe();
	private InscricaoService service = new InscricaoService();
	private CategoriaService categoriaService = new CategoriaService();
	private CampeonatoService campeonatoService= new CampeonatoService();
	private EquipeService equipeService= new EquipeService();
	private Jogador jogador = new Jogador();
	private ComissaoTecnica comissao = new ComissaoTecnica();
	private String cpfJogador;
	private String cpfComissao;
	
	public String getBuscaCPFJogador(){
		return cpfJogador;
	}
	
	public void setBuscaCPFJogador(String cpf){
		this.cpfJogador = cpf;
	}
	
	public String getBuscaCPFComissao(){
		return cpfComissao;
	}
	
	public void setBuscaCPFComissao(String cpf){
		this.cpfComissao = cpf;
	}
	
	public void adicionarJogador(){
		inscricaoEquipe.addInscrito(jogador);
		jogador = new Jogador();		
	}
	
	public void removerInscrito(UsuarioInscricao inscrito){
		inscricaoEquipe.removeInscrito(inscrito);
	}
	
	public void adicionarComissao(){
		inscricaoEquipe.addInscrito(comissao);
		comissao = new ComissaoTecnica();
	}
	
	public void salvar(){
		service.salvar(inscricaoEquipe);
		inscricaoEquipe = new InscricaoEquipe();
	}
	
	public List<Equipe> listarEquipes(String usuario){
		return service.listarEquipes(usuario);
	}
	
	public void buscarJogador(){
		try{
			Usuario usu = service.obterUsuarioPorCpf(cpfJogador);
	
			jogador = new Jogador();
			jogador.setUsuario(usu);
		}
		catch(Exception ex){
			String msg = ex.getMessage();
			msg.length();
		}
	}
	
	public void buscarComissao(){
		Usuario usu = service.obterUsuarioPorCpf(cpfComissao);
		
		comissao = new ComissaoTecnica();
		comissao.setUsuario(usu);
	}

	public InscricaoEquipe getInscricaoEquipe() {
		return inscricaoEquipe;
	}

	public void setInscricaoEquipe(InscricaoEquipe inscricaoEquipe) {
		this.inscricaoEquipe = inscricaoEquipe;
	}
	
	public Categoria getCategoria(){
		if(inscricaoEquipe.getCategoriaCampeonato() != null){
			return inscricaoEquipe.getCategoriaCampeonato().getCategoria() ;
		}
		return null;
	}
	
	public void setCategoria(Categoria categoria){
		if(inscricaoEquipe.getCategoriaCampeonato() == null){
			inscricaoEquipe.setCategoriaCampeonato(new CategoriaCampeonato());
		}
		
		inscricaoEquipe.getCategoriaCampeonato().setCategoria(categoria);
	}

	public Campeonato getCampeonato(){
		if(inscricaoEquipe.getCategoriaCampeonato() != null){
			return inscricaoEquipe.getCategoriaCampeonato().getCampeonato();
		}
		return null;
	}
	public void setCampeonato(Campeonato campeonato){
		if(inscricaoEquipe.getCategoriaCampeonato() == null){
			inscricaoEquipe.setCategoriaCampeonato(new CategoriaCampeonato());
		}
		
		inscricaoEquipe.getCategoriaCampeonato().setCampeonato(campeonato);
	}
	
	public List<Equipe> getEquipes(){
		return equipeService.listar();
	}
	
	public List<Campeonato> getCampeonatos(){
		return campeonatoService.listar();
	}
	
	public List<Categoria> getCategorias(){
		return categoriaService.listar();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public ComissaoTecnica getComissao() {
		return comissao;
	}

	public void setComissao(ComissaoTecnica comissao) {
		this.comissao = comissao;
	}
}
