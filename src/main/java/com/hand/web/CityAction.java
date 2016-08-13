package com.hand.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.dao.CityMapper;
import com.hand.entity.Category;
import com.hand.entity.CategoryExample;
import com.hand.entity.City;

@Controller
@RequestMapping("/city")
public class CityAction {
	@Autowired
	private CityMapper cityMapper;
	
	@RequestMapping("/listAll")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response){
		City cities = cityMapper.selectByPrimaryKey(null);
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("cities", cities);
		return mav;
	}
}
