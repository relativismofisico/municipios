package com.crudMunicipio.crudMunicipio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MunicipioServiceImp  implements MunicipioService{

	@Autowired
	private MunicipioRepositorio repositorio;
	
	@Override
	public List<Municipio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Municipio listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio add(Municipio m) {
		return repositorio.save(m);
	}

	@Override
	public Municipio edit(Municipio m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
