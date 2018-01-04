package com.krima.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.krima.model.Car;
import com.krima.model.Gender;
import com.krima.model.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person1=new Person("Abderrahim", "KRIMA", 31, Arrays.asList("akrima1988@hotmail.com","stayak1@free.fr"), Gender.MALE, Arrays.asList(new Car("Toyota", "Yaris"),new Car("Toyota", "Corolla")));
		Person person2=new Person("Hassan", "CHAIB", 45, Arrays.asList("hass125@gmail.com"), Gender.MALE, Arrays.asList(new Car("Toyota", "Rav4"),new Car("Toyota", "LandCruser")));
		Person person3=new Person("Sara", "YAZIDI", 39, Arrays.asList("sarayazidi@yahoo.com","sara1977@free.fr"), Gender.FEMALE, Arrays.asList(new Car("Honda", "civic"),new Car("Honda", "Crv7")));
		Person person4=new Person("Amina", "ZERAOUI", 23, Arrays.asList("youss88@hotmail.com","yziraoui@free.fr"), Gender.FEMALE, Arrays.asList(new Car("Honda", "Patrio"),new Car("Nissan", "Quachqai")));
		Person person5=new Person("Soufiane", "ELMADAD", 19, Arrays.asList("sofmadad@hotmail.com","sofMad55@yahoo.fr"), Gender.MALE, Arrays.asList(new Car("Nissan", "Versa"),new Car("Nissan", "Patfinder")));
		
		List<Person> persons=Arrays.asList(person1,person2,person3,person4,person5);
		
		System.out.println("*************** Print all persons *****************");
		persons.stream().forEach(System.out::println);
		
		System.out.println("*************** Print All persons whom gender is Mal  *****************");
		persons.stream().filter(p->p.getGender().equals(Gender.MALE)).forEach(System.out::println);
		
		System.out.println("*************** Print All persons that have Toyota brand's car  *****************"); 		
		persons.stream()
					.filter(person->person.getCars().stream()
														.anyMatch(car->car.getBrande().equals("Toyota")))
					.forEach(System.out::println);
		
		System.out.println("*************** Print person with max and min age  *****************");
		Optional<Person> maxAge = persons.stream().max(Comparator.comparing(p-> p.getAge()));
		Optional<Person> minAge = persons.stream().min(Comparator.comparing(p-> p.getAge()));
		System.out.println(maxAge.get());
		System.out.println(minAge.get());
		
		System.out.println("*************** Print person with average age  *****************");
		persons.stream().filter(pers->pers.getAge().equals(persons.stream().collect(Collectors.averagingInt(p->p.getAge())).intValue())).forEach(System.out::println);
		
		System.out.println("*************** Print all persons witch ages are gratter than average age  *****************");
		persons.stream().filter(pers->pers.getAge() > persons.stream().collect(Collectors.averagingInt(p->p.getAge())).intValue()).forEach(System.out::println);
		
		System.out.println("*************** Print all persons witch ages are gratter than average age  *****************");
		persons.stream().filter(pers->pers.getAge() > persons.stream().collect(Collectors.averagingInt(p->p.getAge())).intValue()).forEach(System.out::println);
		
	}

}
