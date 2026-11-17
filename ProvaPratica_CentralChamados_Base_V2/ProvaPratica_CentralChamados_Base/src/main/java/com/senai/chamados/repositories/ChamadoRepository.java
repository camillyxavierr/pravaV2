package com.senai.chamados.repositories;
import com.senai.chamados.models.ChamadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<ChamadoEntity,Long> {


}
