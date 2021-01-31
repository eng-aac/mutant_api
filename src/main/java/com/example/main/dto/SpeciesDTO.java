package com.example.main.dto;

import javax.persistence.Transient;

public class SpeciesDTO {

	private int id;
	private String name;
    private String cadena_adn_0;
    private String cadena_adn_1;
    private String cadena_adn_2;
    private String cadena_adn_3;
    private String cadena_adn_4;
    private String cadena_adn_5;
    
    private String species_condition;
    
    private String [] dna = new String [6];
    

    private int cant_human;
    private int cant_mutant;
    private double mutant_percentage;

    
	public SpeciesDTO() {
	}

	public SpeciesDTO(int id, String name, String cadena_adn_0, String cadena_adn_1, String cadena_adn_2,
			String cadena_adn_3, String cadena_adn_4, String cadena_adn_5, String species_condition, String[] dna, int cant_human, int cant_mutant, double mutant_percentage) {
		this.id = id;
		this.name = name;
		this.cadena_adn_0 = cadena_adn_0;
		this.cadena_adn_1 = cadena_adn_1;
		this.cadena_adn_2 = cadena_adn_2;
		this.cadena_adn_3 = cadena_adn_3;
		this.cadena_adn_4 = cadena_adn_4;
		this.cadena_adn_5 = cadena_adn_5;
		this.species_condition = species_condition;
		this.dna = dna;
		
		this.cant_human = cant_human;
		this.cant_mutant = cant_mutant;
		this.mutant_percentage = mutant_percentage;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}

	public String getCadena_adn_0() {
		return cadena_adn_0;
	}

	public void setCadena_adn_0(String cadena_adn_0) {
		this.cadena_adn_0 = cadena_adn_0;
	}

	public String getCadena_adn_1() {
		return cadena_adn_1;
	}

	public void setCadena_adn_1(String cadena_adn_1) {
		this.cadena_adn_1 = cadena_adn_1;
	}

	public String getCadena_adn_2() {
		return cadena_adn_2;
	}

	public void setCadena_adn_2(String cadena_adn_2) {
		this.cadena_adn_2 = cadena_adn_2;
	}

	public String getCadena_adn_3() {
		return cadena_adn_3;
	}

	public void setCadena_adn_3(String cadena_adn_3) {
		this.cadena_adn_3 = cadena_adn_3;
	}

	public String getCadena_adn_4() {
		return cadena_adn_4;
	}

	public void setCadena_adn_4(String cadena_adn_4) {
		this.cadena_adn_4 = cadena_adn_4;
	}

	public String getCadena_adn_5() {
		return cadena_adn_5;
	}

	public void setCadena_adn_5(String cadena_adn_5) {
		this.cadena_adn_5 = cadena_adn_5;
	}


	public String[] getDna() {
		
		for (int i = 0; i < 6; i++) {
			  switch (i){
			          case 0: dna[i] = cadena_adn_0;
			              break;
			          case 1: dna[i] = cadena_adn_1;
			              break;
			          case 2: dna[i] = cadena_adn_2;
			              break;
			          case 3: dna[i] = cadena_adn_3;
			              break;
			          case 4: dna[i] = cadena_adn_4;
			              break;
			          case 5: dna[i] = cadena_adn_5;
			              break; 
			          default:throw new AssertionError();    
			      }
			}
		
		
		return dna;
	}


	public void setDna(String[] dna) {
		this.dna = dna;
	}


	public String getSpecies_condition() {
		return species_condition;
	}


	public void setSpecies_condition(String species_condition) {
		this.species_condition = species_condition;
	}

	public int getCant_human() {
		return cant_human;
	}

	public void setCant_human(int cant_human) {
		this.cant_human = cant_human;
	}

	public int getCant_mutant() {
		return cant_mutant;
	}

	public void setCant_mutant(int cant_mutant) {
		this.cant_mutant = cant_mutant;
	}

	public double getMutant_percentage() {
		return mutant_percentage;
	}

	public void setMutant_percentage(double mutant_percentage) {
		this.mutant_percentage = mutant_percentage;
	}

}
