package br.com.projactivity.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projactivity.entidade.Cadastro;
import br.com.projactivity.util.Conexao;

public class CadastroDB {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public CadastroDB() {
		connection = Conexao.getConnection();
	}
	
	public boolean inserir(Cadastro cadastro) throws SQLException {
		
		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO PECA (nome, peso, valor, tipo, datacadastro) values (?, ?)");
			
			stmt.setString(1, cadastro.getNome());
			stmt.setDouble(2, cadastro.getPeso());
			stmt.setDouble(3, cadastro.getValor());
			stmt.setString(4, cadastro.getTipo());
			stmt.setString(5, cadastro.getDatacadastro());
			
			stmt.execute();
			return true;
			
			
		}catch(SQLException e) {
			System.err.println(e.toString());
		}finally {
			
			connection.close();
		}
		return false;
		
		
	}
	
	public boolean alterar(Cadastro cadastro) throws SQLException{
		
		try {
			
			PreparedStatement stmt = this.connection
					.prepareStatement("UPDATE PECA SET nome = ?, peso = ?, "
							+ "valor = ?, tipo = ?, datacadastro = ? WHERE id ?");
			
			stmt.setString(1, cadastro.getNome());
			stmt.setDouble(2, cadastro.getPeso());
			stmt.setDouble(3, cadastro.getValor());
			stmt.setString(4, cadastro.getTipo());
			stmt.setString(5, cadastro.getDatacadastro());
			stmt.setInt(6, cadastro.getId());
			
			stmt.execute();
			return true;
			
		}catch (SQLException e) {
			
			System.err.println(e.toString());
		}finally {
			
			connection.close();
		}
		return false;
	}
	
	public List<Cadastro> getAll(){
		
		List<Cadastro> lst Cadastro = new ArrayList<>();
		
		
	}
	
}
