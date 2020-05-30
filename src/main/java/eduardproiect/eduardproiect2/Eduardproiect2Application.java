package eduardproiect.eduardproiect2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import eduardproiect.eduardproiect2.domain.Owner;
import eduardproiect.eduardproiect2.domain.OwnerRepository;
import eduardproiect.eduardproiect2.domain.Phone;
import eduardproiect.eduardproiect2.domain.PhoneRepository;
import eduardproiect.eduardproiect2.domain.User;
import eduardproiect.eduardproiect2.domain.UserRepository;

@SpringBootApplication
public class Eduardproiect2Application extends SpringBootServletInitializer {
	@Autowired
	PhoneRepository phoneRepository;

	@Autowired
	OwnerRepository ownerRepository;

	@Autowired
	UserRepository userRepository;

	private static final Logger logger = LoggerFactory.getLogger(Eduardproiect2Application.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Eduardproiect2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Eduardproiect2Application.class, args);

		logger.info("\n\n... Hello Spring Boot...");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			// Place your code here
			logger.info("\n\n... Completam BD...");

			Owner owner1 = new Owner("John", "Johnson");
			Owner owner2 = new Owner("Mary", "Robinson");

			ownerRepository.save(owner1);
			ownerRepository.save(owner2);

			phoneRepository.save(new Phone("Samsung", "S10", "Red", "0798561423", 2017, 3500, owner1));
			phoneRepository.save(new Phone("Google", "Pixel 3", "White", "0723459862", 2018, 2900, owner2));
			phoneRepository.save(new Phone("Apple", "X", "Silver", "0754861958", 2018, 4300, owner2));

			// username: user password: user
			userRepository
					.save(new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			// username: admin password: admin
			userRepository
					.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN"));
		};
	}
}
