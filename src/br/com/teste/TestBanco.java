package br.com.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.ponto.dao.DAO;
import br.com.ponto.entity.Escala;
import br.com.ponto.entity.Funcionario;
import br.com.ponto.entity.Gestor;

public class TestBanco {

	public void adicionaGestor() {
		Gestor gestor = new Gestor();
		gestor.setNome("Antonio de Souza");

		new DAO<Gestor>(Gestor.class).adiciona(gestor);
	}

	public void adicionaEscala() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		try {
			Escala escala1 = new Escala();
			escala1.setDescricao("Escala das seis");
			escala1.setEntrada(sdf.parse("06:00:00"));
			escala1.setSaida(sdf.parse("11:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala1);

			Escala escala2 = new Escala();
			escala2.setDescricao("Escala das sete");
			escala2.setEntrada(sdf.parse("07:00:00"));
			escala2.setSaida(sdf.parse("16:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala2);

			Escala escala3 = new Escala();
			escala3.setDescricao("Escala das oito");
			escala3.setEntrada(sdf.parse("08:00:00"));
			escala3.setSaida(sdf.parse("17:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala3);

			Escala escala4 = new Escala();
			escala4.setDescricao("Escala das nove");
			escala4.setEntrada(sdf.parse("09:00:00"));
			escala4.setSaida(sdf.parse("18:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala4);

			Escala escala5 = new Escala();
			escala5.setDescricao("Escala das dez");
			escala5.setEntrada(sdf.parse("10:00:00"));
			escala5.setSaida(sdf.parse("19:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala5);

			Escala escala6 = new Escala();
			escala6.setDescricao("Escala das onze");
			escala6.setEntrada(sdf.parse("11:00:00"));
			escala6.setSaida(sdf.parse("20:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala6);

			Escala escala7 = new Escala();
			escala7.setDescricao("Escala das doze");
			escala7.setEntrada(sdf.parse("12:00:00"));
			escala7.setSaida(sdf.parse("21:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala7);

			Escala escala8 = new Escala();
			escala8.setDescricao("Escala das treze");
			escala8.setEntrada(sdf.parse("13:00:00"));
			escala8.setSaida(sdf.parse("22:00:00"));
			new DAO<Escala>(Escala.class).adiciona(escala8);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

public void adicionaFuncionario(){
		
		
		Gestor gestor = new Gestor();
		gestor = new DAO<Gestor>(Gestor.class).buscaPorId(1);
		
		Escala escala = new Escala();
		escala = new DAO<Escala>(Escala.class).buscaPorId(1);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Alyson de Souza Dias");
		funcionario.setCpf("38181522842");
		funcionario.setMatricula("60026975");
		funcionario.setGestor(gestor);
		funcionario.setStatus(1);
		funcionario.setEscala(escala);
		
		new DAO<Funcionario>(Funcionario.class).adiciona(funcionario);
		
	}

	public void atualizaSenha(){
		Funcionario f = new DAO<Funcionario>(Funcionario.class).buscaPorId(1);
		f.setSenha("123");
		f.setPerfil(1);
		
		new DAO<Funcionario>(Funcionario.class).atualiza(f);
	}

	public static void main(String[] args) {
		TestBanco tb = new TestBanco();
		
		//tb.adicionaGestor();
		//tb.adicionaEscala();
		//tb.adicionaFuncionario();
		
		tb.atualizaSenha();
	}
}
