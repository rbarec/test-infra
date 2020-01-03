package rest01.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Person> getPersons(){
		List<Person> x = new ArrayList<>();
		x.add(new Person("Keanu Reeves"));
		x.add(new Person("Donald Trump"));
		return x;
	}
	
}
