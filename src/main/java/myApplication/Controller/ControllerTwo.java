package myApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myApplication.Entity2.Entity2;
import myApplication.Repository.RepositoryTwo;

@RestController
@RequestMapping("/App")
public class ControllerTwo {
	
	@Autowired
	private RepositoryTwo repositoryTwo;
	
	
	@PostMapping("/post")
	public Entity2 save(@RequestBody Entity2 entity2) {
		return repositoryTwo.save(entity2);
	}

}
