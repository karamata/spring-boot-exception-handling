package info.phuphan.springboot.exceptionhandling.bird;

import org.springframework.data.repository.CrudRepository;

public interface BirdRepository extends CrudRepository<Bird, Long> {
}
