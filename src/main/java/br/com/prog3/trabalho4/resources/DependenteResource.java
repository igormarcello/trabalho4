package br.com.prog3.trabalho4.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.trabalho4.domain.Dependente;
import br.com.prog3.trabalho4.service.DependenteService;

@RestController
@RequestMapping("/api/v1/dependentes")
public class DependenteResource {
	@Autowired
	private DependenteService dependenteService;

	@GetMapping
	public ResponseEntity<List<Dependente>> findAll() {
		List<Dependente> dependente = dependenteService.findAll();
		if (dependente == null || dependente.isEmpty()) {
			return new ResponseEntity<List<Dependente>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Dependente>>(dependente, HttpStatus.OK);
	}

	@PostMapping
	public Dependente create(@RequestBody Dependente dependente) {
		return dependenteService.save(dependente);
	}

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<?> findById(@PathVariable Long id) {
		return dependenteService.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Dependente> update(@PathVariable("id") Long id, @RequestBody Dependente dependente) {

		return dependenteService.findById(id).map(record -> {
			record.setGrauParentesco(dependente.getGrauParentesco());
			record.setNome(dependente.getNome());
			record.setEmpregado(dependente.getEmpregado());
			Dependente updated = dependenteService.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return dependenteService.findById(id).map(record -> {
			dependenteService.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
