package com.skilldistillery.vegetables.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vegetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private Float fat;
	private Float grams;
	private Float calories;
	private Float protein;
	private Float carbs;
	private Float fiber;
	
	
	public Vegetable() {
		super();
	}
	public Vegetable(int id, String name, String type, Float fat, Float grams, Float calories, Float protein,
			Float carbs, Float fiber) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.fat = fat;
		this.grams = grams;
		this.calories = calories;
		this.protein = protein;
		this.carbs = carbs;
		this.fiber = fiber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getFat() {
		return fat;
	}
	public void setFat(Float fat) {
		this.fat = fat;
	}
	public Float getGrams() {
		return grams;
	}
	public void setGrams(Float grams) {
		this.grams = grams;
	}
	public Float getCalories() {
		return calories;
	}
	public void setCalories(Float calories) {
		this.calories = calories;
	}
	public Float getProtein() {
		return protein;
	}
	public void setProtein(Float protein) {
		this.protein = protein;
	}
	public Float getCarbs() {
		return carbs;
	}
	public void setCarbs(Float carbs) {
		this.carbs = carbs;
	}
	public Float getFiber() {
		return fiber;
	}
	public void setFiber(Float fiber) {
		this.fiber = fiber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calories == null) ? 0 : calories.hashCode());
		result = prime * result + ((carbs == null) ? 0 : carbs.hashCode());
		result = prime * result + ((fat == null) ? 0 : fat.hashCode());
		result = prime * result + ((fiber == null) ? 0 : fiber.hashCode());
		result = prime * result + ((grams == null) ? 0 : grams.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((protein == null) ? 0 : protein.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (calories == null) {
			if (other.calories != null)
				return false;
		} else if (!calories.equals(other.calories))
			return false;
		if (carbs == null) {
			if (other.carbs != null)
				return false;
		} else if (!carbs.equals(other.carbs))
			return false;
		if (fat == null) {
			if (other.fat != null)
				return false;
		} else if (!fat.equals(other.fat))
			return false;
		if (fiber == null) {
			if (other.fiber != null)
				return false;
		} else if (!fiber.equals(other.fiber))
			return false;
		if (grams == null) {
			if (other.grams != null)
				return false;
		} else if (!grams.equals(other.grams))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (protein == null) {
			if (other.protein != null)
				return false;
		} else if (!protein.equals(other.protein))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vegetable [id=" + id + ", name=" + name + ", type=" + type + ", fat=" + fat + ", grams=" + grams
				+ ", calories=" + calories + ", protein=" + protein + ", carbs=" + carbs + ", fiber=" + fiber + "]";
	}
	
}