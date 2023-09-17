package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.RegistroFrequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroFrequenciaRepository extends JpaRepository<RegistroFrequencia, Long> {
}