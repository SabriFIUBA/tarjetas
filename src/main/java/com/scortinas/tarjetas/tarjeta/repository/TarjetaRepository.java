package com.scortinas.tarjetas.tarjeta.repository;

import com.scortinas.tarjetas.tarjeta.domain.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
    // Métodos personalizados (si los necesitas) pueden ir aquí
}
