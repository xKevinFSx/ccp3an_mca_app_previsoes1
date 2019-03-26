package br.usjt.Aula1Ex.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String nomeDoDiaDaSemana;
	private double temperaturaMinima;
	private double temperaturaMaxima;
	private int humidadeRelativaAr;
	private String descricao;
	
	public String getNomeDoDiaDaSemana() {
		return nomeDoDiaDaSemana;
	}
	public void setNomeDoDiaDaSemana(String nomeDoDiaDaSemana) {
		this.nomeDoDiaDaSemana = nomeDoDiaDaSemana;
	}
	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public int getHumidadeRelativaAr() {
		return humidadeRelativaAr;
	}
	public void setHumidadeRelativaAr(int humidadeRelativaAr) {
		this.humidadeRelativaAr = humidadeRelativaAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
