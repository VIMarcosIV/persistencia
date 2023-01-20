package org.iesch.ad.demo.persistencia.controlador;

import org.iesch.ad.demo.persistencia.modelo.Actor;
import org.iesch.ad.demo.persistencia.modelo.Pelicula;
import org.iesch.ad.demo.persistencia.servicio.PeliculasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeliculasControlador {

    @Autowired
    PeliculasServicios peliculasServicios;

    @GetMapping("api/peliculas")
    public List<Pelicula> obtenerTodas() {

        return peliculasServicios.buscaTodasLasPeliculas();

    }

    @GetMapping("api/peliculas/{id}")
    public Pelicula buscaPorID(@PathVariable Long id) {
        return peliculasServicios.buscaPorId(id);
    }

    @PostMapping("api/peliculas")
    public Pelicula insertarPeliculas(@RequestBody Pelicula pelicula) {
        Pelicula peliculaSalvada = peliculasServicios.guardaPelicula(pelicula);
        return peliculaSalvada;
    }

}
