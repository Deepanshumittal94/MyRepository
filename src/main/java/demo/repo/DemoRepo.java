package demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import demo.model.DemoModel;

@EnableJpaRepositories
public interface DemoRepo extends CrudRepository<DemoModel, String>{

	Optional<DemoModel> findByEmailId(String email);
	List<DemoModel> findByEmailIdIn(List<String> mail);
}
