package org.iesch.ad.demo.persistencia.controlador;

import org.iesch.ad.demo.persistencia.modelo.Actor;
import org.iesch.ad.demo.persistencia.servicio.ActorServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorControlador {
    @Autowired
    ActorServicios actorServicios;

    @GetMapping("api/actor")
    public List<Actor> obtenerTodos() {
        return actorServicios.buscaTodosLosActores();
    }

    @GetMapping("api/actor/{dni}")
    public Actor buscaPorDNI(@PathVariable String dni) {
        return actorServicios.buscaPorId(dni);
    }

    @PostMapping("api/actor")
    public Actor insertarActor(@RequestBody Actor actor) {
        Actor actorSalvado = actorServicios.guardaActor(actor);
        return actorSalvado;
    }

}
