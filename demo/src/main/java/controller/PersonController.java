package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@RequestMapping("/welcome")
	public String getHelloWorld() {
		return ps.getHelloWorld();
	}

	@RequestMapping("/getAll")
	public Hashtable<String, Person> getAll(){
		return ps.getAll();
	}
	
	@RequestMapping("{id}")
	public String getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}
}
