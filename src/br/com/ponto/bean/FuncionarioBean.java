package br.com.ponto.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.ponto.entity.Funcionario;
import br.com.ponto.login.UsuarioLogadoBean;

@ManagedBean
public class FuncionarioBean {
	
	@Inject
	UsuarioLogadoBean usuario;

	private Funcionario funcionario = new Funcionario();

	private List<Funcionario> filterFuncionario;

	private List<Funcionario> listaFuncionario;

	private int idEscala, idSite, idGestor, idStatus, idPerfil, idTeamLeader;


}
