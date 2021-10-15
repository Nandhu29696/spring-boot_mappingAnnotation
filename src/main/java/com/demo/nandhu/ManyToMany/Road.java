package com.demo.nandhu.ManyToMany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "road")
@Data
public class Road {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "roadname")
	private String roadname;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Vehicle> vehicles = new HashSet<>();

}
