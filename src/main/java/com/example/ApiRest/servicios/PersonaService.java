package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>  {

    List<Persona> search(String filtro) throws Exception;



}
