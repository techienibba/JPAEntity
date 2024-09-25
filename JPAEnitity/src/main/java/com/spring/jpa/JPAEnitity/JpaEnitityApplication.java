package com.spring.jpa.JPAEnitity;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jpa.JPAEnitity.MainEntities.Address;
import com.spring.jpa.JPAEnitity.MainEntities.Laptop;
import com.spring.jpa.JPAEnitity.MainEntities.Product;
import com.spring.jpa.JPAEnitity.MainEntities.Student;
import com.spring.jpa.JPAEnitity.MainEntities.category;
import com.spring.jpa.JPAEnitity.Repository.CategoryRepo;
import com.spring.jpa.JPAEnitity.Repository.ProductRepo;
import com.spring.jpa.JPAEnitity.Repository.StudentRepo;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JpaEnitityApplication implements CommandLineRunner  {
	
	@Autowired
	private StudentRepo studrepo;
	
	@Autowired
	private ProductRepo prodrepo;
	
	@Autowired
	private CategoryRepo categoryrepo;
	
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(JpaEnitityApplication.class);
	

	
	
	public static void main(String[] args) {
		
		
	
		
	
		
		
		
		
		
		
		SpringApplication.run(JpaEnitityApplication.class, args);
		
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	/*	
		Student stud = new Student();
		stud.setFirstname("Javed");
		stud.setLastname("Akram");
		
		
		Laptop laptop = new Laptop();
		laptop.setLaptopmodel("NewModel");
		laptop.setStudent(stud);
		
		
		stud.setLaptop(laptop);
		
		
		
		
		
		//System.out.println("The Students laptop is"+""+newstud.getLaptop().getLaptopmodel()+""+"And student assigned to laptop is"+""+laptop.getStudent().getFirstname());
		
		Address a1 = new Address();
		//a1.setAddressId(1);
		a1.setStreetname("First Street");
		a1.setStudent(stud);
		
		Address a2 = new Address();
		//a2.setAddressId(2);
		a2.setStreetname("Second Address");
		a2.setStudent(stud);
		
		List<Address> fulllist = new ArrayList<>();
		fulllist.add(a1);
		fulllist.add(a2);
		stud.setAddresslist(fulllist);
		
		Student newstud=studrepo.save(stud);
		
		logger.info("The Address list of student is" + newstud.getAddresslist().get(0).getStreetname()+"and"+newstud.getAddresslist().get(1).getStreetname() + "The Student attached to the AddressList is "+fulllist.get(0).getStudent().getFirstname()+"and"+fulllist.get(1).getStudent().getLastname());
		
		*/

		Product p1 = new Product();
		p1.setPid(1);
		p1.setProductname("Prodone");
		
		
		Product p2 = new Product();
		p2.setPid(2);
		p2.setProductname("Prodtwo");
		
		Product p3 = new Product();
		p3.setPid(3);
		p3.setProductname("Prodthree");
	
	
		
		category c1 = new category();
		c1.setCid(1);
		c1.setName("categoryone");
		
		category c2 = new category();
		c2.setCid(2);
		c2.setName("categorytwo");
		
		c1.setProducts(List.of(p1,p2));
		c2.setProducts(List.of(p2,p3));
		
		categoryrepo.save(c1);
		categoryrepo.save(c2); 
	
		/*
		List<Product> category1products=c1.getProducts();
		category1products.add(p1);
		category1products.add(p2);
		
		List<Product> category2products=c2.getProducts();
		category2products.add(p2);
		category2products.add(p3);
		*/
		
		
		category c3=categoryrepo.findById((long) 1).get();
		category c4=categoryrepo.findById((long) 2).get();
		
		
		logger.info("The size of products of category one are" + c3.getProducts().size() + "and"+ ""+"The size of products of category two are" +c4.getProducts().size());
		
		
		
		
	}
	
	
	
	
	

}
