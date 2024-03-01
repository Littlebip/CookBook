package com.GLNT.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient {
	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "kcal_per_gram", nullable = false)
	private double kcalPerGram;

	@OneToMany
	@JoinColumn(name = "ingredient_id")
	private List<RecipeIngredient> recipeIngredients;

	// constructors
	public Ingredient() {
		super();
	}

	public Ingredient(String name, double kcalPerGram) {
		super();
		this.name = name;
		this.kcalPerGram = kcalPerGram;
	}

	public Ingredient(int id, String name, double kcalPerGram) {
		super();
		this.id = id;
		this.name = name;
		this.kcalPerGram = kcalPerGram;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getKcalPerGram() {
		return kcalPerGram;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKcalPerGram(double kcalPerGram) {
		this.kcalPerGram = kcalPerGram;
	}

	// toString
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", kcalPerGram=" + kcalPerGram + "]";
	}
}
