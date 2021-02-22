package dao;

import java.util.UUID;

import model.Person;

public interface PersonDao {
	
	int insertPerson(UUID id, Person person);
	
	//default is for incase if UUID is not given so that default will generate the UUID randomly
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		
		return insertPerson(id,person);
	}
	
	//Next create a class that will implement this interface

}
