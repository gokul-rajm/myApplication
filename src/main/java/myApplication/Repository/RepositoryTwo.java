package myApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myApplication.Entity2.Entity2;

public interface RepositoryTwo extends JpaRepository<Entity2, Integer> {

}
