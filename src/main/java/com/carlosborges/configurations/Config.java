package com.carlosborges.configurations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.carlosborges.entities.Address;
import com.carlosborges.entities.Category;
import com.carlosborges.entities.City;
import com.carlosborges.entities.Client;
import com.carlosborges.entities.Product;
import com.carlosborges.entities.State;
import com.carlosborges.entities.enums.TypeClient;
import com.carlosborges.repositories.AddressRepository;
import com.carlosborges.repositories.CategoryRepository;
import com.carlosborges.repositories.CityRepository;
import com.carlosborges.repositories.ClientRepository;
import com.carlosborges.repositories.ProductRepository;
import com.carlosborges.repositories.StateRepository;


@Configuration
public class Config implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		Category cat1 = new Category(null, "Informatica");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1,cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));		
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		State est1 = new State(null, "Minas Gerais");
		State est2 = new State(null, "Sâo Paulo");
		
		City c1 = new City(null, "Uberlândia", est1);
		City c2 = new City(null, "São Paulo", est2);
		City c3 = new City(null, "Campinas", est2);
		
		est1.getCities().addAll(Arrays.asList(c1));
		est2.getCities().addAll(Arrays.asList(c2,c3));
		
		stateRepository.saveAll(Arrays.asList(est1,est2));
		cityRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Client cli1 = new Client(null, "Maria Silva", "maria@gmail.com", "33678912377", TypeClient.PESSOAFISICA);
		
		cli1.getPhones().addAll(Arrays.asList("27363323","93838393"));
		
		Address a1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "3822834", cli1, c1);
		Address a2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "3877712", cli1, c2);
		
		cli1.getAddress().addAll(Arrays.asList(a1, a2));
		
		clientRepository.saveAll(Arrays.asList(cli1));
		addressRepository.saveAll(Arrays.asList(a1, a2));
	}

}
