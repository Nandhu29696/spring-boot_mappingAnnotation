package com.demo.nandhu.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "project")
@Data
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;

	@Column(name = "projectname")
	private String projectName;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "project")
//	private User user;
}
