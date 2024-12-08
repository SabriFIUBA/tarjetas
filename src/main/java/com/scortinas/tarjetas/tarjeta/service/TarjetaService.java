package com.scortinas.tarjetas.tarjeta.service;


import com.scortinas.tarjetas.tarjeta.domain.Tarjeta;
import com.scortinas.tarjetas.tarjeta.repository.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaService {

    @Autowired
    private TarjetaRepository repository;

    public List<Tarjeta> getAllTarjetas() {
        return repository.findAll();
    }

    public Tarjeta addTarjeta(String name) {
        Tarjeta Tarjeta = new Tarjeta(name);
        return repository.save(Tarjeta);
    }

    public void deleteTarjeta(Long id) {
        repository.deleteById(id);
    }

    public Tarjeta updateTarjeta(Long id, String newName) {
        return repository.findById(id).map(Tarjeta -> {
            Tarjeta.setName(newName);
            return repository.save(Tarjeta);
        }).orElseThrow(() -> new RuntimeException("Tarjeta not found with ID: " + id));
    }
}

