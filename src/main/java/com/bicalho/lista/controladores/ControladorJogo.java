package com.bicalho.lista.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bicalho.lista.dto.MinimoDTOJogo;
import com.bicalho.lista.servicos.ServicoJogo;

//Porta de entrada da API (do back-end) ; implenta a API
@RestController
@RequestMapping(value = "/jogos")
public class ControladorJogo {

	@Autowired
	private ServicoJogo servico;
	
	@GetMapping
	public List<MinimoDTOJogo> findAll(){
		List<MinimoDTOJogo> lista = servico.findAll();
		return lista;
		
	}
}
