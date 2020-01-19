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
		return "WEB-INF/index.jsp";
	}

	@RequestMapping(path = "showVeg.do")
	public String showVeg(Integer vid, Model model) {
		Vegetable veg = dao.findById(vid);
		model.addAttribute("veg", veg);
		return "WEB-INF/vegetable/show.jsp";

	}
	@RequestMapping(path = "listVeg.do")
	public String listVeg(Integer vid, Model model) {
		if(vid != null) {
			Vegetable veg = dao.findById(vid);
			model.addAttribute("veg", veg);
			return "WEB-INF/vegetable/listVeg.jsp";
		}else {
			List<Vegetable> vegs = new ArrayList<>();
			vegs = dao.findAll();
			model.addAttribute("vegs", vegs);
			return "WEB-INF/vegetable/listVeg.jsp";
		}
	}

	@RequestMapping(path = "create.do", method = RequestMethod.POST)
	public String createVeg(Vegetable vegetable, Model model) {
		vegetable = dao.create(vegetable);
		model.addAttribute("vegetable", vegetable);
		return "WEB-INF/index.jsp";

	}

	@RequestMapping(path = "createNewPage.do", method = RequestMethod.GET)
	public String goCreateVeg() {
		return "WEB-INF/create.jsp";
	}

	@RequestMapping(path = "edit.do")
	public String goModifyVeg(@RequestParam("vid") Integer id, Vegetable veg, Model model) {
		Vegetable veg1 = dao.findById(id);

		model.addAttribute("veg", veg1);
		return "WEB-INF/modify.jsp";
	}

	@RequestMapping(path = "modify.do")
	public String modifyVeg(@RequestParam("vid") Integer id, Vegetable veg, Model model) {
//		Vegetable veg1 = dao.findById(vid);
		veg = dao.update(id, veg);
		if(veg == null) {
			return "WEB-INF/error.jsp";
		}else {
		model.addAttribute("veg", veg);
		return "WEB-INF/index.jsp";
		}
	}

	@RequestMapping(path = "delete.do", method = RequestMethod.GET)
	public String deleteVeg(@RequestParam("vid") int id) {
		dao.delete(id);
		return "WEB-INF/index.jsp";
	}

}
