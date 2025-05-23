package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Localidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    @Query(value = "SELECT * FROM localidad WHERE localidad.denominacion LIKE %:filtro%",
            nativeQuery = true)
    List<Localidad> search(@Param("filtro") String filtro);
}
