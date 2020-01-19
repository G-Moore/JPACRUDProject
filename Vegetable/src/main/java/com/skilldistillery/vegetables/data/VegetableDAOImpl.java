package com.skilldistillery.vegetables.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.vegetables.entities.Vegetable;
@Service
@Transactional
public class VegetableDAOImpl implements VegetableDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Vegetable> findAll() {
		String jpql = "SELECT vegetable FROM Vegetable vegetable";
		List<Vegetable> results = em.createQuery(jpql, Vegetable.class).getResultList();
		return results;
	}

	@Override
	public Vegetable findById(Integer vid) {
		return em.find(Vegetable.class, vid);		
	}
	
	@Override
	public Vegetable create(Vegetable vegetable) {

		em.persist(vegetable);

		em.flush();

		return vegetable;
	}
	@Override
	public Vegetable update(Integer id, Vegetable vegetable) {
		
		Vegetable vegetableToBeChangedFromDB = em.find(Vegetable.class, id);
		
		vegetableToBeChangedFromDB.setCalories(vegetable.getCalories());
		vegetableToBeChangedFromDB.setCarbs(vegetable.getCarbs());
		vegetableToBeChangedFromDB.setFat(vegetable.getCarbs());
		vegetableToBeChangedFromDB.setFiber(vegetable.getFiber());
		vegetableToBeChangedFromDB.setGrams(vegetable.getGrams());
		vegetableToBeChangedFromDB.setName(vegetable.getName());
		vegetableToBeChangedFromDB.setProtein(vegetable.getProtein());
		vegetableToBeChangedFromDB.setType(vegetable.getType());
		
		em.flush();
		
		return vegetableToBeChangedFromDB;
	}

	@Override
	public boolean delete(Integer id) {
		
		Vegetable vegetable = em.find(Vegetable.class, id);
		em.remove(vegetable);
		
		boolean status = !em.contains(vegetable);
		
		return status;
	}


	
}
