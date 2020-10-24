package com.vivid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class VividApplication {

	/*
Problem: Find the Celebrity
- In a team of N people, a celebrity is known by everyone but he/she doesn't know anybody.
*/

	public static void main(String[] args) {
		SpringApplication.run(VividApplication.class, args);

		Person nelson = new Person("nelson");
		Person john = new Person("john");
		Person tom = new Person("tom");
		Person brian = new Person("brian");
		final List<Person> persons = new ArrayList<>();
		persons.add(nelson);
		persons.add(john);
		persons.add(tom);
		persons.add(brian);

		Team team = new Team();
		team.setMembers(persons);

		team.setCelebrity(tom);
		System.out.println("team:"+ team);
		team.setCelebrity(john);
		System.out.println("team:"+ team);

	}

}
