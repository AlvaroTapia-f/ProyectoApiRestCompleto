package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Autor;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long> {

    List<Autor> search(String filtro) throws Exception;

}
