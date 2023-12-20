package com.avslogin.AvsParcel.Repo;

import com.avslogin.AvsParcel.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByEmailIgnoreCaseAndPassword(String emailId, String password);


    Optional<User>  findUserByEmail(String email);

   List<User>findAllByGenderIn(Set<String> gen);
}

