package com.example.main.servicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.main.dto.SpeciesDTO;
import com.example.main.entities.Species;
import com.example.main.repositories.SpeciesRepository;


@Service
public class SpeciesServicies {

	private SpeciesRepository speciesRepository;
	
	public SpeciesServicies(SpeciesRepository speciesRepository) {
		this.speciesRepository = speciesRepository;
	}

	boolean isMutantHuman;
	int contadorTotal;
	
	int contador_1;
    int contador_2;
    int contador_3;

	public boolean isMutant (String [] dna){
		
			isMutantHuman = false;
		
			contadorTotal = 0; 
			
			contador_1 = 0;
		    contador_2 = 0;
		    contador_3 = 0;

	        String cadena_vertical = "";
	        String cadena_vertical_1 = "";
	        String cadena_vertical_2 = "";
	        String cadena_vertical_3 = "";
	        String cadena_vertical_4 = "";
	        String cadena_vertical_5 = "";
	
	        String cadena_oblicua = "";
	        String cadena_oblicua_1 = "";
	        String cadena_oblicua_2 = "";
	        String cadena_oblicua_3 = "";
	        String cadena_oblicua_4 = "";
	        String cadena_oblicua_5 = "";
	        String cadena_oblicua_6 = "";
	        String cadena_oblicua_7 = "";
	        String cadena_oblicua_8 = "";
	        String cadena_oblicua_9 = "";
	        
	        String dna_vertical [] = new String[6];
	        String dna_oblicuo [] = new String[5];
	        String dna_oblicuo_1 [] = new String[5];
	
	        // zona de calculo
	            // --- Horizontal
	
	            
	        for (int i = 0; i < 6; i++) {
	            
	            if (dna[i].contains("AAAA") || dna[i].contains("CCCC") || dna[i].contains("GGGG") || dna[i].contains("TTTT") ) {
	                contador_1++;
	            }
	                
	        }
	        
	            // --- Vertical
	            
	        for (int i = 0; i < 6; i++) {
	            
	            cadena_vertical += dna[i].charAt(0);
	            cadena_vertical_1 += dna[i].charAt(1);
	            cadena_vertical_2 += dna[i].charAt(2);  
	            cadena_vertical_3 += dna[i].charAt(3);  
	            cadena_vertical_4 += dna[i].charAt(4);     
	            cadena_vertical_5 += dna[i].charAt(5);
	            
	        } 
	        
	        
	        for (int i = 0; i < 6; i++) {
	                        
	            switch (i){
	                    case 0: dna_vertical[i] = cadena_vertical;
	                        break;
	                    case 1: dna_vertical[i] = cadena_vertical_1;
	                        break;
	                    case 2: dna_vertical[i] = cadena_vertical_2;
	                        break;
	                    case 3: dna_vertical[i] = cadena_vertical_3;
	                        break;
	                    case 4: dna_vertical[i] = cadena_vertical_4;
	                        break;
	                    case 5: dna_vertical[i] = cadena_vertical_5;
	                        break; 
	                    default:throw new AssertionError();    
	                }
	            
	            if (dna_vertical[i].contains("AAAA") || dna_vertical[i].contains("CCCC") || dna_vertical[i].contains("GGGG") || dna_vertical[i].contains("TTTT") ) {
	                contador_2++;
	            }
	        }
	        
	            // --- Oblicuo
	        
	        
	        for (int i = 0; i < 6; i++) {
	            
	            cadena_oblicua += dna[0].charAt(0);
	            cadena_oblicua += dna[1].charAt(1);
	            cadena_oblicua += dna[2].charAt(2);
	            cadena_oblicua += dna[3].charAt(3);
	            cadena_oblicua += dna[4].charAt(4);
	            cadena_oblicua += dna[5].charAt(5);
	            
	            cadena_oblicua_1 += dna[1].charAt(0);
	            cadena_oblicua_1 += dna[2].charAt(1);
	            cadena_oblicua_1 += dna[3].charAt(2);
	            cadena_oblicua_1 += dna[4].charAt(3);
	            cadena_oblicua_1 += dna[5].charAt(4);
	            
	            cadena_oblicua_2 += dna[2].charAt(0);
	            cadena_oblicua_2 += dna[3].charAt(1);
	            cadena_oblicua_2 += dna[4].charAt(2);
	            cadena_oblicua_2 += dna[5].charAt(3);
	            
	            cadena_oblicua_3 += dna[0].charAt(1);
	            cadena_oblicua_3 += dna[1].charAt(2);
	            cadena_oblicua_3 += dna[2].charAt(3);
	            cadena_oblicua_3 += dna[3].charAt(4);
	            cadena_oblicua_3 += dna[4].charAt(5);
	            
	            cadena_oblicua_4 += dna[0].charAt(2);
	            cadena_oblicua_4 += dna[1].charAt(3);
	            cadena_oblicua_4 += dna[2].charAt(4);
	            cadena_oblicua_4 += dna[3].charAt(5);  
	            
	            
	            cadena_oblicua_5 += dna[0].charAt(5);
	            cadena_oblicua_5 += dna[1].charAt(4);
	            cadena_oblicua_5 += dna[2].charAt(3);
	            cadena_oblicua_5 += dna[3].charAt(2);
	            cadena_oblicua_5 += dna[4].charAt(1);
	            cadena_oblicua_5 += dna[5].charAt(0);
	            
	            cadena_oblicua_6 += dna[1].charAt(4);
	            cadena_oblicua_6 += dna[2].charAt(3);
	            cadena_oblicua_6 += dna[3].charAt(2);
	            cadena_oblicua_6 += dna[4].charAt(1);
	            cadena_oblicua_6 += dna[5].charAt(0);
	            
	            cadena_oblicua_7 += dna[2].charAt(3);
	            cadena_oblicua_7 += dna[3].charAt(2);
	            cadena_oblicua_7 += dna[4].charAt(1);
	            cadena_oblicua_7 += dna[5].charAt(0);
	            
	            cadena_oblicua_8 += dna[0].charAt(5);
	            cadena_oblicua_8 += dna[1].charAt(4);
	            cadena_oblicua_8 += dna[2].charAt(3);
	            cadena_oblicua_8 += dna[3].charAt(2);
	            cadena_oblicua_8 += dna[4].charAt(1);
	            
	            cadena_oblicua_9 += dna[0].charAt(5);
	            cadena_oblicua_9 += dna[1].charAt(4);
	            cadena_oblicua_9 += dna[2].charAt(3);
	            cadena_oblicua_9 += dna[3].charAt(2);  
	        }
	        
	        for (int i = 0; i < 6-1; i++) {
	                        
	            switch (i){
	                    case 0: dna_oblicuo[i] = cadena_oblicua;
	                            dna_oblicuo_1[i] = cadena_oblicua_5;
	                        break;
	                    case 1: dna_oblicuo[i] = cadena_oblicua_1;
	                            dna_oblicuo_1[i] = cadena_oblicua_6;
	                        break;
	                    case 2: dna_oblicuo[i] = cadena_oblicua_2;
	                            dna_oblicuo_1[i] = cadena_oblicua_7;
	                        break;
	                    case 3: dna_oblicuo[i] = cadena_oblicua_3;
	                            dna_oblicuo_1[i] = cadena_oblicua_8;
	                        break;
	                    case 4: dna_oblicuo[i] = cadena_oblicua_4;
	                            dna_oblicuo_1[i] = cadena_oblicua_9;
	                        break;
	                    default:throw new AssertionError();    
	                }
	            
	            if ((dna_oblicuo[i].contains("AAAA") || dna_oblicuo[i].contains("CCCC") || dna_oblicuo[i].contains("GGGG") || dna_oblicuo[i].contains("TTTT")) ||
	                (dna_oblicuo_1[i].contains("AAAA") || dna_oblicuo_1[i].contains("CCCC") || dna_oblicuo_1[i].contains("GGGG") || dna_oblicuo_1[i].contains("TTTT")) ){
	                contador_3++;
	            }
	        }
	        
	        contadorTotal = contador_1 + contador_2 + contador_3;
	        
	        if (contadorTotal > 1) {
	                isMutantHuman = true;
	        }
	
	        return isMutantHuman;
	    }
	
	
	public int getCnt_Human() {
	    return speciesRepository.countByHuman(); 
	}
	
	public int getCnt_Mutant() {
	    return speciesRepository.countByMutant(); 
	}
	
	public double getPercentage() {
		double mutant_per = 0;
		mutant_per = (speciesRepository.countByMutant() * 100 ) / (speciesRepository.countByMutant() + speciesRepository.countByHuman());
	    return mutant_per; 
	}

	@Transactional
	public List<SpeciesDTO> findAll() throws Exception {
		
		
		List<Species> entities_species = speciesRepository.findAll();
		
		
		List<SpeciesDTO> dtos_human_mutant = new ArrayList<>();

		try {
		
			for (Species i : entities_species) {
				
				// cargo de la entidad al Dto
				SpeciesDTO unDto = new SpeciesDTO();
				
				unDto.setId(i.getId());
				unDto.setName(i.getName());
				unDto.setCadena_adn_0(i.getCadena_adn_0());
				unDto.setCadena_adn_1(i.getCadena_adn_1());
				unDto.setCadena_adn_2(i.getCadena_adn_2());
				unDto.setCadena_adn_3(i.getCadena_adn_3());
				unDto.setCadena_adn_4(i.getCadena_adn_4());
				unDto.setCadena_adn_5(i.getCadena_adn_5());
				unDto.setSpecies_condition(i.getSpecies_condition());
				
				getCnt_Human();
		        getCnt_Mutant();
		        getPercentage();
		        
		        unDto.setCant_human(getCnt_Human());
		        unDto.setCant_mutant(getCnt_Mutant());
		        unDto.setMutant_percentage(getPercentage());
		        
				
				// Cargo a cada elemento el dto
				dtos_human_mutant.add(unDto);			
			}
			
			return dtos_human_mutant;
		
			
		} catch (Exception e) {
			throw new Exception();
		}
		
	}
	
	@Transactional
	public SpeciesDTO findById(int id) throws Exception {
		
		 //se usa para atrapar un null
		 Optional<Species> entityOptionalS = speciesRepository.findById(id);
		 
		
		 // dto auxiliar 
		 SpeciesDTO unDto = new SpeciesDTO();
		 
		 
		try {
				// Lo convierto a entidad
				Species entityS = entityOptionalS.get();	
					
				unDto.setId(entityS.getId());
				unDto.setName(entityS.getName());
				unDto.setCadena_adn_0(entityS.getCadena_adn_0());
				unDto.setCadena_adn_1(entityS.getCadena_adn_1());
				unDto.setCadena_adn_2(entityS.getCadena_adn_2());
				unDto.setCadena_adn_3(entityS.getCadena_adn_3());
				unDto.setCadena_adn_4(entityS.getCadena_adn_4());
				unDto.setCadena_adn_5(entityS.getCadena_adn_5());
				unDto.setSpecies_condition(entityS.getSpecies_condition());
				
				getCnt_Human();
		        getCnt_Mutant();
		        getPercentage();
		        
		        unDto.setCant_human(getCnt_Human());
		        unDto.setCant_mutant(getCnt_Mutant());
		        unDto.setMutant_percentage(getPercentage());
					
				return unDto ;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}	

	
	@Transactional
	public SpeciesDTO save (SpeciesDTO dto) throws Exception {
		
		SpeciesDTO speciesDTO = new SpeciesDTO();
		
		speciesDTO.setDna(dto.getDna());
		
		
		isMutant(dto.getDna());
		
		System.out.println("La cantidad de secuencias repetidas en horizontal es: " + contador_1);
        System.out.println("La cantidad de secuencias repetidas en vertical es: " + contador_2);
        System.out.println("La cantidad de secuencias repetidas en diagonal es: " + contador_3);
        System.out.println("");
        
        
        System.out.println("Las secuencias repetidas aparecen " + contadorTotal + " veces.");
        System.out.println("");
        
        Species hM = new Species();
        
        hM.setName(dto.getName());
		
		hM.setCadena_adn_0(dto.getCadena_adn_0());
		hM.setCadena_adn_1(dto.getCadena_adn_1());
		hM.setCadena_adn_2(dto.getCadena_adn_2());
		hM.setCadena_adn_3(dto.getCadena_adn_3());
		hM.setCadena_adn_4(dto.getCadena_adn_4());
		hM.setCadena_adn_5(dto.getCadena_adn_5());
		

        if (isMutantHuman) {
        	
			System.out.println("");
			System.out.println(dto.getName() + ": " + "Eres un Mutante.");
			System.out.println("");
			
			
			dto.setSpecies_condition("Mutant");
			hM.setSpecies_condition(dto.getSpecies_condition());
			
			
        }else {
        	System.out.println("");
			System.out.println(dto.getName() + ": " + "Felicidades NO eres un mutante.");
			System.out.println("");
			
			dto.setSpecies_condition("Human");
			hM.setSpecies_condition(dto.getSpecies_condition());
        	
        }
        
		try {
		
			hM = speciesRepository.save(hM);
			dto.setId(hM.getId());
			
			 	getCnt_Human();
		        getCnt_Mutant();
		        getPercentage();
		        
		        dto.setCant_human(getCnt_Human());
		        dto.setCant_mutant(getCnt_Mutant());
		        dto.setMutant_percentage(getPercentage());
		        
		        speciesDTO.setCant_human(dto.getCant_human());
		        speciesDTO.setCant_mutant(dto.getCant_mutant());
		        speciesDTO.setMutant_percentage(dto.getMutant_percentage());
			
			System.out.println("");
			System.out.println("Cantidad de Humans: " + dto.getCant_human());
			System.out.println("Cantidad de Mutants: " + dto.getCant_mutant());
			System.out.println("Porcentaje de Mutants: " + dto.getMutant_percentage());
			System.out.println("");

		} catch (Exception e) {
			throw new Exception();
		}

		return dto;
	}


	@Transactional
	public SpeciesDTO update (int id, SpeciesDTO dto) throws Exception {
		
		Optional<Species> entityOptionalS = speciesRepository.findById(id);
		
		try {
			
			Species entity_species = entityOptionalS.get();
			
				entity_species.setId(id);
				entity_species.setName(dto.getName());
				entity_species.setCadena_adn_0(dto.getCadena_adn_0());
				entity_species.setCadena_adn_1(dto.getCadena_adn_1());
				entity_species.setCadena_adn_2(dto.getCadena_adn_2());
				entity_species.setCadena_adn_3(dto.getCadena_adn_3());
				entity_species.setCadena_adn_4(dto.getCadena_adn_4());
				entity_species.setCadena_adn_5(dto.getCadena_adn_5());
	
				SpeciesDTO speciesDTO = new SpeciesDTO();
				
				speciesDTO.setDna(dto.getDna());
				
				
				isMutant(dto.getDna());
				
				
				if (isMutantHuman) {
		        	
					System.out.println("");
					System.out.println(dto.getName() + ": " + "Ahora, eres un Mutante.");
					System.out.println("");
					
					
					dto.setSpecies_condition("Mutant");
					entity_species.setSpecies_condition(dto.getSpecies_condition());
					
					
		        }else {
		        	System.out.println("");
					System.out.println(dto.getName() + ": " + "Felicidades, ahora NO eres un mutante.");
					System.out.println("");
					
					dto.setSpecies_condition("Human");
					entity_species.setSpecies_condition(dto.getSpecies_condition());
		        	
		        }
				
					speciesRepository.save(entity_species);	
					
					dto.setId(entity_species.getId());	
					
					getCnt_Human();
			        getCnt_Mutant();
			        getPercentage();
			        
			        dto.setCant_human(getCnt_Human());
			        dto.setCant_mutant(getCnt_Mutant());
					dto.setMutant_percentage(getPercentage());
					
					entity_species.setCant_human(dto.getCant_human());
					entity_species.setCant_mutant(dto.getCant_mutant());
					entity_species.setMutant_percentage(dto.getMutant_percentage());
					
					
					System.out.println("");
					System.out.println("Cantidad de Humans: " + dto.getCant_human());
					System.out.println("Cantidad de Mutants: " + dto.getCant_mutant());
					System.out.println("Porcentaje de Mutants: " + dto.getMutant_percentage());
					System.out.println("");
					
				return dto;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}

	
	@Transactional
	public boolean delete(int id) throws Exception {
		
		try {	
			if (speciesRepository.existsById(id)) {
				
				speciesRepository.deleteById(id);
				
				getCnt_Human();
		        getCnt_Mutant();
		        getPercentage();
				
				System.out.println("");
				System.out.println("Cantidad de Humans: " + getCnt_Human());
				System.out.println("Cantidad de Mutants: " + getCnt_Mutant());
				System.out.println("Porcentaje de Mutants: " + getPercentage());
				System.out.println("");
				
				return true;				
			}		
			else {
				throw new Exception();			
			}
			
		} catch (Exception e) {
			throw new Exception();			
		}
		
	}
	
	
}
