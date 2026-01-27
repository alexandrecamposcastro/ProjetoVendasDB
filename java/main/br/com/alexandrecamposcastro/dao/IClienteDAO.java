 
package br.com.alexandrecamposcastro.dao;

import br.com.alexandrecamposcastro.domain.Cliente;

 
public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
}
