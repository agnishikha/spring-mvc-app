package com.agnishikha.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.agnishikha.domain.User;
import com.agnishikha.service.GetUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {


	@Autowired
	private GetUsersService getUsersService;


    @RequestMapping(value="/home")
    public ModelAndView home(HttpServletResponse response) throws IOException{

        return new ModelAndView("home");
    }
	@RequestMapping(value="/users"  , produces = { "application/json" })
	public @ResponseBody List<User> test(HttpServletResponse response) throws IOException{

		return getUsersService.getUsers();
	}
}
