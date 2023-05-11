package com.bicalho.lista.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicalho.lista.dto.MinimoDTOJogo;
import com.bicalho.lista.entidades.Jogo;
import com.bicalho.lista.repositorios.RepositorioJogo;

//@Component
@Service
public class ServicoJogo {
	
	
	@Autowired  //Injecao de um componente
	private RepositorioJogo repositorio;
	
	public List<MinimoDTOJogo> findAll(){
		List<Jogo> result = repositorio.findAll();
		List<MinimoDTOJogo> lista = result.stream().map(x -> new MinimoDTOJogo(x)).toList();
		return lista;
	}
}
