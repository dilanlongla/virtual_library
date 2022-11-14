package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
}
