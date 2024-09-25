package com.spring.jpa.JPAEnitity.MainEntities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Productnew")
public class Product {
	
	@Id
	private long pid;
	
	@Column(name="name")
	private String productname;
	
	@ManyToMany(mappedBy="products",fetch=FetchType.EAGER)
	private List<category> categories = new ArrayList<>();

}
