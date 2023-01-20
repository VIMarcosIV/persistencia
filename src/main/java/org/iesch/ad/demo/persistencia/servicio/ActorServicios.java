package org.iesch.ad.demo.persistencia.servicio;

import org.iesch.ad.demo.persistencia.modelo.Actor;
import org.iesch.ad.demo.persistencia.repositorio.ActorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServicios {
    @Autowired
    ActorRepositorio actorRepositorio;

    public List<Actor> buscaTodosLosActores() {
        return actorRepositorio.findAll();
    }

    public Actor buscaPorId(String dni) {
        Optional<Actor> actorOptional = actorRepositorio.findById(dni);
        if (actorOptional.isPresent()) {
            return actorOptional.get();
        } else {
            return null;
        }
    }

    public Actor guardaActor(Actor actor) {
        return actorRepositorio.save(actor);
    }
}
