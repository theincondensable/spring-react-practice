package io.incondensable.data.repository;

import io.incondensable.data.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author abbas
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
