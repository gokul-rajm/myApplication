package myApplication.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import myApplication.Entity.EntityClass;
import myApplication.Repository.RepositoryClass;

@RestController
@RequestMapping("/Application")
public class ControllerClass {
	
	@Autowired
	RepositoryClass repositoryClass;
	
	@PostMapping("/MyApp")
	public EntityClass saveDetails(@Valid @RequestBody EntityClass entityClass) {
		return repositoryClass.save(entityClass);
	}
	
	@GetMapping("/MyApp/{id}")
	public Optional<EntityClass> getById(@PathVariable("id") int id) {
		return repositoryClass.findById(id);
	}
	
	@GetMapping("/MyApp")
	public List<EntityClass> getAllDetails() {
		return repositoryClass.findAll();
	}
	
	@PutMapping("/MyApp/{id}")
	public EntityClass updateDetail(@RequestBody EntityClass entityClass) {
		//entityClass.setName(entityClass.getName());
		return repositoryClass.save(entityClass);
	}
	
	@DeleteMapping("/MyApp/{id}")
	public void deleteDetails(@PathVariable("id") int id) {
		repositoryClass.deleteById(id);
		
	}
}