package br.com.tiacademy.equipamentos.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Registro implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data_s;
	private LocalDate data_e;
	private int situacao;
	//private Long equip_id;
	//private Long usuario_id;
	
	@ManyToOne
	@JoinColumn(name="equip_id", referencedColumnName = "id")
	private Equipamento equipamento;
	
	@ManyToOne
	@JoinColumn(name="usuario_id", referencedColumnName = "id")
	private Usuario usuario;

}
