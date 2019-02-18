package com.platzi.ereservation.negocio.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

@Service
@Transactional(readOnly = true)
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Transactional
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Transactional
	public Cliente update(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Transactional
	public void delete(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente findByIdentificacion(String identificacionCli) {
		return clienteRepository.findByIdentificacion(identificacionCli);

	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	

}
