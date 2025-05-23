package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

    List<Autor> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%")
    List<Autor> search(@Param("filtro") String filtro);


}
