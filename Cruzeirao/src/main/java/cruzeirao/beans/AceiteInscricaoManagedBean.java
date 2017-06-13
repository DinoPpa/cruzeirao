package cruzeirao.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.model.InscricaoEquipe;
import cruzeirao.model.Usuario;
import cruzeirao.model.UsuarioInscricao;
import cruzeirao.service.InscricaoService;
import cruzeirao.service.UsuarioService;

@ManagedBean
@SessionScoped
public class AceiteInscricaoManagedBean {
	private UsuarioService service = new UsuarioService();
	private InscricaoService inscricaoService = new InscricaoService();
	private List<UsuarioInscricao> inscricoes;
	private UsuarioInscricao inscricao;
	private String cpf;
	
	public String getBuscaCPFJogador(){
		return cpf;
	}
	
	public void setBuscaCPFJogador(String cpf){
		this.cpf = cpf;
	}

	public void buscaEquipes(){
		Usuario usua = inscricaoService.obterUsuarioPorCpf(cpf);
		
		inscricoes = service.listarInscricoes(usua.getLogin());
	}

	public List<UsuarioInscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<UsuarioInscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public UsuarioInscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(UsuarioInscricao inscricao) {
		this.inscricao = inscricao;
	}
	
	public void aceitar(){
		inscricao.setAceiteUsuario(true);
		service.aceiteInscricao(inscricao.getId());
	}
}
