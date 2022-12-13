package com.zied.film.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zied.film.entities.User;
import com.zied.film.repos.UserRepository;
import com.zied.film.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {

	@Autowired
	UserRepository userRep;
	
	@Autowired
	UserService userService;

	@RequestMapping(path = "all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}
	
	

}
