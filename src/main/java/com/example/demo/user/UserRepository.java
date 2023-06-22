package com.example.demo.user;

//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    // @Query(value = "select * from trainees", nativeQuery = true)
    // List<User> findAll();

    // @Modifying
    // @Query(value = "INSERT INTO users (name, email) VALUES (:name, :email)",
    // nativeQuery = true)
    // void saveUser(@Param("name") String name, @Param("email") String email);

    // void save(String name, String email);

}
