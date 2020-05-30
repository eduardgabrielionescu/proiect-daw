package eduardproiect.eduardproiect2.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PhoneRepository extends CrudRepository<Phone, Long> {

//Fetch phones by brand
	List<Phone> findByBrand(String brand);

//Fetch phones by color
	List<Phone> findByColor(String color);

//Fetch phones by year List<Phone> findByYear(int year);
	List<Phone> findByYear(int year);

//Fetch phones by brand and model
	List<Phone> findByBrandAndModel(String brand, String model);

//Fetch phones by brand or color
	List<Phone> findByBrandOrColor(String brand, String color);

//Fetch phones by brand and sort by year
	List<Phone> findByBrandOrderByYearAsc(String brand);

//Fetch phones by brand using SQL
	@Query("select c from Phone c where c.brand like %?1")
	List<Phone> findByBrandEndsWith(String brand);

}
