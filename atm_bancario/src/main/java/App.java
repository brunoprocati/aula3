

import br.com.atm.connection.JDBCConnection;
import br.com.atm.dao.PessoaDAO;
import br.com.atm.model.Pessoa;

public class App {
	public static void main (String[] args) { 
		Pessoa pessoa = new Pessoa("Marquinhos","1234567890",null);
		pessoa.setPessoaId(2);
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.atualizar(pessoa);
		
		
	}

}
