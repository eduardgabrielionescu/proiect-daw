package eduardproiect.eduardproiect2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

//import eduardproiect.eduardproiect2.domain.Phone;
//import eduardproiect.eduardproiect2.domain.PhoneRepository;
import eduardproiect.eduardproiect2.web.PhoneController;

@SpringBootTest
class Eduardproiect2ApplicationTests {

	//@Autowired
	//private TestEntityManager entityManager;

	@Autowired
	private PhoneController controller;

	//@Autowired
	//private PhoneRepository repository;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	/*@Test
	public void saveCar() {
		Phone phone = new Phone("Samsung", "S20", "White", "0712459872", 2017, 860);
		entityManager.persistAndFlush(phone);
		assertThat(phone.getId()).isNotNull();
	}

	@Test
	public void deleteCars() {
		entityManager.persistAndFlush(new Phone("Samsung", "S20", "White", "0712459872", 2017, 860));
		entityManager.persistAndFlush(new Phone("Apple", "X", "Silver", "0754861958", 2018, 4300));
		repository.deleteAll();
		assertThat(repository.findAll()).isEmpty();
	}
*/
}
