package com.GS.repository;

import com.GS.model.Dica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DicaRepository extends JpaRepository<Dica, Long> {
}
