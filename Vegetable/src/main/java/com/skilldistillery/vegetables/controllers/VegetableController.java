package com.skilldistillery.vegetables.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.vegetables.data.VegetableDAO;
import com.skilldistillery.vegetables.entities.Vegetable;

@Controller
public class VegetableController {

	@Autowired
	private VegetableDAO dao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Vegetable> vegs = new ArrayList<>();
		vegs = dao.findAll();
		model.addAttribute("vegs", vegs);
		return "WEB-INF/index.jsp";
	}

	@RequestMapping(path = "getVeg.do")
	public String showVeg(@RequestParam Integer vid, Model model) {
//		Vegetable veg = new Vegetable();
		Vegetable veg = dao.findById(vid);
		model.addAttribute("veg", veg);
		return "WEB-INF/vegetable/show.jsp";

	}

	@RequestMapping(path = "create.do", method = RequestMethod.POST)
	public String createVeg(Vegetable vegetable, Model model) {
		vegetable = dao.create(vegetable);
		model.addAttribute("vegetable", vegetable);
		return "WEB-INF/create.jsp";

	}

	@RequestMapping(path = "create.do", method = RequestMethod.GET)
	public String goCreateVeg() {
		return "WEB-INF/create.jsp";
	}

	@RequestMapping(path = "modify.do", method = RequestMethod.GET)
	public String goModifyVeg() {
		return "WEB-INF/modify.jsp";
	}

	@RequestMapping(path = "modify.do", method = RequestMethod.POST)
	public String modifyVeg(Integer id, Vegetable vegetable, Model model) {
		vegetable.setId(id);
		vegetable = dao.update(id, vegetable);
		model.addAttribute("vegetable", vegetable);
		return "WEB-INF/modify.jsp";

	}

	@RequestMapping(path = "delete.do", method = RequestMethod.GET)
	public String goDeleteVeg(@RequestParam("VegId") int id) {
		dao.delete(id);
		return "WEB-INF/index.jsp";
	}

}
