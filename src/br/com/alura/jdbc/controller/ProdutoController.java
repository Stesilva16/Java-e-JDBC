package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		try {
			this.produtoDAO.deletar(id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void salvar(Produto produto) {
		try {
			this.produtoDAO.salvarComCategoria(produto);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> listar() {
		try {
			return this.produtoDAO.listar();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void alterar(String nome, String descricao, Integer id) {
		try {
			this.produtoDAO.alterar(nome, descricao, id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
