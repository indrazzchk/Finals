package service;

import org.springframework.stereotype.Service;
import model.Person;
import java.util.Hashtable;

@Service
public class PersonService {
	Hashtable<String, Person> persons=null;
	Person p=null,q=null;
    public PersonService() {
    	persons = new Hashtable<String, Person>();
    	p=new Person();
    	p.setName("Indrashis");
    	p.setPassword("Indrashis");
    	persons.put("Indrashis", p);
    	
    	persons = new Hashtable<String, Person>();
    	q=new Person();
    	q.setName("Suman");
    	q.setPassword("Suman");
    	persons.put("Suman", q);
    }
    
    public String getPerson(String id) {
    	if (persons.containsKey(id)) {
    		return persons.get(id).getName();
    	}
    	else {
    		return "Sorry no such person registered !";
    	}
    }
    
    public Hashtable<String, Person> getAll(){
    	return persons;
    }
    
    public String getHelloWorld() {
    	return "Hello World !";
    } 
}
