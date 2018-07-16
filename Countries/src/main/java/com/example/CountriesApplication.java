package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Country;
import com.example.repositories.CountryRepository;

@SpringBootApplication
public class CountriesApplication {

	public CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		countryRepository.save(new Country("Earth","World"));
//		countryRepository.save(new Country("China","Peking"));
//		countryRepository.save(new Country("Germany","Berlin"));
//		countryRepository.save(new Country("Usa","Wahington DC"));
//		countryRepository.save(new Country("Russia","Moscow"));
//		countryRepository.save(new Country("Namibia","WindHoek"));
//		countryRepository.save(new Country("India","New Delhi"));
//		countryRepository.save(new Country("North Korea","Pyongyang"));
//		countryRepository.save(new Country("Kenya","Nairobi"));
//		countryRepository.save(new Country("Canada","Ottawa"));
//		countryRepository.save(new Country("Jamaica","Kingston"));
//		countryRepository.save(new Country("Brazil","Brasilia"));
//		countryRepository.save(new Country("Egypt","Cairo"));
//		
//		
//	}
	
	
	
	
	
	
	
	
}
