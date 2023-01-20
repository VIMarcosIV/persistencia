package org.iesch.ad.demo.persistencia.repositorio;

import org.iesch.ad.demo.persistencia.modelo.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

}
