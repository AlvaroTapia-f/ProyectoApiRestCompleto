package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

//Repositorio Genérico
@NoRepositoryBean //Es una clase que no se va instanciar
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
