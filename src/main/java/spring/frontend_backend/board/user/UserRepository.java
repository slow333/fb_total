package spring.frontend_backend.board.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfor, Integer> {

  Optional<UserInfor> findByusername(String username);
}
