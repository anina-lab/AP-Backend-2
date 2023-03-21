package com.portfolio.aml.repository;

import com.portfolio.aml.entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer>{
    public Optional<Proyecto> findByTituloPr(String tituloPr);
    public boolean existsByTituloPr(String tituloPr);
}