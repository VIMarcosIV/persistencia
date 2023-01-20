package org.iesch.ad.demo.persistencia.servicio;

import org.iesch.ad.demo.persistencia.modelo.Actor;
import org.iesch.ad.demo.persistencia.modelo.Pelicula;
import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PeliculasServicios {

    @Autowired
    PeliculaRepositorio peliculaRepositorio;

    public List<Pelicula> buscaTodasLasPeliculas() {
        return peliculaRepositorio.findAll();
    }

    public Pelicula buscaPorId(Long id) {
        Optional<Pelicula> peliculaOptional = peliculaRepositorio.findById(id);
        if(peliculaOptional.isPresent()){
            return peliculaOptional.get();
        }else{
            return null;
        }
    }
}
