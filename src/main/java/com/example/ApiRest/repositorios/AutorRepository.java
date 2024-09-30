package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
