package com.masai.Dao;

import com.masai.Q1.Person;
import com.masai.Q1.Trainer;

public interface Dao {
		
	public void addGym(Gym gym);
	
	public void registerPerson(Person person, gym_id)throws GymException
	
	 public registerTrainer(Trainer trainer)
	
	public assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException

	List<Person> getAllthePersonByGymName(String gym_name)throws GymExcpetion
}
