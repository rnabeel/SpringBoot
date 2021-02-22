package dao;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import model.Person;


public class FakePersonDataAccessService implements PersonDao {
	
	private static List<Person> DB = new ArrayList<>();
	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		
		return 1;
	}


}
