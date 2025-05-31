package spring.frontend_backend.security;//package spring.frontend_backend.sbb.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig27 {
//  @Bean
//  PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//  // security 5.7
//  @Bean
//  CorsConfigurationSource corsConfigurationSource() {
//    CorsConfiguration configuration = new CorsConfiguration();
//    configuration.setAllowedOrigins(
//            Arrays.asList("http://127.0.0.1:8080", "http://localhost:8080"));
//    configuration.setAllowedMethods(Arrays.asList("GET","POST"));
////    configuration.setAllowedHeaders(Arrays.asList("*"));
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    source.registerCorsConfiguration("/**", configuration);
//    return source;
//  }
//
//  @Bean
//  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    http
//// by default uses a Bean by the name of corsConfigurationSource
//        .cors(withDefaults())
////            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
//        .csrf().disable()
//        .authorizeRequests()
//        .antMatchers("/hello").permitAll()
//        .antMatchers("/","/**").permitAll()
//        .antMatchers("/rest/v1/test/**").denyAll()
//        .anyRequest().authenticated()
//    ;
//    return http.build();
//  }
//
//  @Bean
//  AuthenticationManager authenticationManager(
//          AuthenticationConfiguration authenticationConfiguration)
//          throws Exception{
//    return authenticationConfiguration.getAuthenticationManager();
//  }
//}
//
///* security 6.4 설정
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//  CorsConfigurationSource corsConf() {
//    return request -> {
//      CorsConfiguration config = new CorsConfiguration();
//      config.setAllowedHeaders(Collections.singletonList("*"));
//      config.setAllowedMethods(Collections.singletonList("*"));
//      config.setAllowedOrigins(Arrays.asList("http://localhost:8888","http://127.0.0.1:8888"));
//      config.setMaxAge(3600L);
//      config.setAllowCredentials(true);
//
//      return config;
//    };
//  }
//
//  @Bean
//  SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//    httpSecurity
//            .httpBasic(HttpBasicConfigurer::disable)
//            .cors(corsConfigurer ->
//                    corsConfigurer.configurationSource(corsConf()))
//            .csrf(AbstractHttpConfigurer::disable)
//            .headers(httpSecurityHeadersConfigurer ->
//                    httpSecurityHeadersConfigurer
//                            .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))
//            .authorizeHttpRequests(auth -> {
//              auth
//                      .requestMatchers("/**").permitAll()
//                      .requestMatchers("/login").permitAll()
//                      .requestMatchers("/h2-console").permitAll()
//            });
//    return httpSecurity.build();
//  }
//}
//*/