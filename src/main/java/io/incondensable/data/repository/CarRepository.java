package io.incondensable.data.repository;

import io.incondensable.data.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author abbas
 */
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
