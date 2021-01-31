package com.example.main.controllers;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.dto.SpeciesDTO;
import com.example.main.servicies.SpeciesServicies;

@Controller
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping(path = "api/vf/mutants")
public class SpeciesController {

	private SpeciesServicies speciesServices;

	public SpeciesController(SpeciesServicies speciesServices) {
		this.speciesServices = speciesServices;
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	@Transactional
	public ResponseEntity getAll(){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(speciesServices.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"Error. Registros NO encontrado.\"}");
		}
	}
	
	
	@GetMapping("/{id}")
	@CrossOrigin(origins = "*")
	@Transactional
	public ResponseEntity getOne(@PathVariable int id) {
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(speciesServices.findById(id));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. \"}");
		}
	}	
	
	@PostMapping("/")
	@CrossOrigin("*")
	@Transactional
	public ResponseEntity post(@RequestBody SpeciesDTO dto) {
		
		
		try {
			System.out.println("");
			System.out.println(dto.getName());
			System.out.println("");
			System.out.println(dto.getCadena_adn_0());
			System.out.println(dto.getCadena_adn_1());
			System.out.println(dto.getCadena_adn_2());
			System.out.println(dto.getCadena_adn_3());
			System.out.println(dto.getCadena_adn_4());
			System.out.println(dto.getCadena_adn_5());
			System.out.println(dto.getSpecies_condition());
			System.out.println("");
			
			
			return ResponseEntity.status(HttpStatus.OK).body(speciesServices.save(dto));
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the BODY request, and try again later.\"}");
						
		}
		
	}

	
	
	@PutMapping("/{id}")
	@CrossOrigin("*")
	@Transactional
	public ResponseEntity put(@PathVariable int id, @RequestBody SpeciesDTO dto) {
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(speciesServices.update(id, dto));
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body
					("{\"message\": \"Error. Please check the ID or BODY request, and try again later.\"}");			
		}	
	}
	
	
	@DeleteMapping("/{id}")
	@CrossOrigin("*")
	@Transactional
	public ResponseEntity delete(@PathVariable int id) {
		
		try {
			System.out.println("Se recibio id:" +id);
			speciesServices.delete(id);
			return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"Registro eliminado\"}");
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the ID or BODY request, and try again later.\"}");			
		}
	}
	
}
