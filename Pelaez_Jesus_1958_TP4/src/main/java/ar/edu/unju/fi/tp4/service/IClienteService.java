package ar.edu.unju.fi.tp4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Cliente;
@Service
public interface IClienteService {
	
	public void generarTablaClientes();
	public void guardarCliente(Cliente cliente);
	public List<Cliente> obtenerClientes();

}
