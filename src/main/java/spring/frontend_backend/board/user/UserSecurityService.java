package spring.frontend_backend.board.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserSecurityService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Optional<UserInfor> _userInfo = this.userRepository.findByusername(username);
    if (_userInfo.isEmpty()) {
      throw new UsernameNotFoundException("사용자가 없습니다.");
    }
    UserInfor userInfor = _userInfo.get();

    List<GrantedAuthority> authorityList = new ArrayList<>();
    if ("admin".equals(username)) {
      authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
    } else {
      authorityList.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
    }

    return new User(userInfor.getUsername(), userInfor.getPassword(), authorityList);
  }
}
