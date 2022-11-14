package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@Data
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String about;
	
}
