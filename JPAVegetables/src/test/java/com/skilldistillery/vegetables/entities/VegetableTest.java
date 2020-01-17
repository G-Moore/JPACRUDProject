package com.skilldistillery.vegetables.entities;

import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VegetableTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Vegetable vegetable;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Vegetable");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		vegetable = em.find(Vegetable.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
