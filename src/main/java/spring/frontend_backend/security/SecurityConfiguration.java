package spring.frontend_backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.net.http.HttpRequest;

@Configuration
public class SecurityConfiguration {

   @Bean
   SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http
        .authorizeHttpRequests(request -> request
             .requestMatchers(HttpMethod.GET, "/**").permitAll()
             .requestMatchers(new AntPathRequestMatcher("/board/**")).permitAll()
             .requestMatchers(new AntPathRequestMatcher("/masool/**")).permitAll()
             .requestMatchers(new AntPathRequestMatcher("/swagger-ui/**")).permitAll()
             .requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll()
        )
              .csrf(AbstractHttpConfigurer::disable)
              .cors(Customizer.withDefaults())
              .httpBasic(AbstractHttpConfigurer::disable)
              .headers(header -> header
                      .frameOptions(Customizer.withDefaults()).disable())
              .formLogin((formLogin) ->  formLogin
                      .loginPage("/board/login")
                      .defaultSuccessUrl("/board/question/question_list"))
              .logout(logout -> logout
                      .logoutRequestMatcher(new AntPathRequestMatcher("/board/logout"))
                      .logoutSuccessUrl("/")
                      .invalidateHttpSession(true))
      ;
     return http.build();
   }

   @Bean
   PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
   }

   @Bean
   AuthenticationManager authenticationManager(
           AuthenticationConfiguration authenticationConfiguration) throws Exception{
      return authenticationConfiguration.getAuthenticationManager();
   }
}
