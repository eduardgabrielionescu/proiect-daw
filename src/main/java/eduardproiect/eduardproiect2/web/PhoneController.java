package eduardproiect.eduardproiect2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eduardproiect.eduardproiect2.domain.Phone;
import eduardproiect.eduardproiect2.domain.PhoneRepository;

@RestController
public class PhoneController {

	@Autowired
	private PhoneRepository repository;

	@RequestMapping("/phones")
	public Iterable<Phone> getPhones() {
		// De implementat

		return repository.findAll();

	}
}
