package com.demo.nandhu.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customername")
	private String customername;

	@Column(name = "customermail")
	private String customermail;

	//One to many
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "customer")
//	@JoinColumn(name="customer_id")
	private List<Items> items = new ArrayList<>();
}
