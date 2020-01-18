package com.skilldistillery.vegetables.data;

import java.util.List;

import com.skilldistillery.vegetables.entities.Vegetable;

public interface VegetableDAO {

	List<Vegetable> findAll();

	Vegetable findById(Integer vid);

	Vegetable create(Vegetable vegetable);

	Vegetable update(int id, Vegetable vegetable);

	boolean delete(int id);

	
}
