package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
