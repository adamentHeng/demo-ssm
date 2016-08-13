package com.hand.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hand.dao.CategoryMapper;
import com.hand.entity.Category;
import com.hand.entity.CategoryExample;
import com.hand.util.ResponseUtils;

@Controller
@RequestMapping("/category")
public class CategoryAction {
	@Autowired
	private CategoryMapper categoryMapper;
	
	@RequestMapping("/listAll")
	public void listAll(HttpServletRequest request, HttpServletResponse response){
		CategoryExample categoryExample = new CategoryExample();
		categoryExample.createCriteria().andCategoryIdLessThan((byte) 5);
		List<Category> categories = categoryMapper.selectByExample(categoryExample);
		String json = new Gson().toJson(categories);
		ResponseUtils.renderJson(response, json);
	}
}
