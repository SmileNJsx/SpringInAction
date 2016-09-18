package com.shixiao.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spittles")
public class SpittleController
{
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository)
	{
		// TODO Auto-generated constructor stub
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String spilltes(Model model)
	{
		model.addAttribute(
				spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		
		return "spittles";
	}
}
