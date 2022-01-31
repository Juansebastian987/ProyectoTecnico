package com.proyecto.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cliente")
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	private int id;
	
	private String name;
	
	private double checkout;
	
	private Date fechaIngreso;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cl_pk", referencedColumnName = "id")
	private List<Acompañante> acompañantes;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sr_pk", referencedColumnName = "id")
	private List<Servicio> servicios;
}
