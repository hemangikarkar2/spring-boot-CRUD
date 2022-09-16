package com.example.crud.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.crud.springbootcrud.Service.RegisterService;
import com.example.crud.springbootcrud.VO.RegisterVO;


@Controller

public class RegisterController {

	
	@Autowired
	RegisterService registerService;

	@GetMapping(value = "/")
	public ModelAndView Load() {
		return new ModelAndView("register", "data", new RegisterVO());
	}

	@PostMapping(value = "insert")
	public ModelAndView Insert(@ModelAttribute RegisterVO registerVO, @RequestParam int id) {

		registerVO.setStatus(true);
		this.registerService.insert(registerVO);

		return new ModelAndView("redirect:/");
	}

}