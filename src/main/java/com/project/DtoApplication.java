package com.project;

import com.project.model.Locaton;
import com.project.model.User;
import com.project.repository.LocationRepo;
import com.project.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtoApplication implements CommandLineRunner {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private LocationRepo locationRepo;


	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("zahir");
		user.setLastName("islam");

		Locaton locaton = new Locaton();
		locaton.setLongitude(8.0);
		locaton.setLatitude(7.0);
	}
}
