package nl.gettoworktogether.security_with_jwt.repository;

import nl.gettoworktogether.security_with_jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
