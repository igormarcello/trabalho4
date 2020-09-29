package br.com.prog3.trabalho4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.trabalho4.domain.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
	

}
