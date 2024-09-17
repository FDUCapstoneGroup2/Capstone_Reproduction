package edu.capstone.repository;

import edu.capstone.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>
{

    Iterable<User> findByName(String name);

    Iterable<User> findByEmail(String email);

}
