package spring.frontend_backend.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

   @Override
   public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**");
   }
}
/** 또는 다음같이 설정
 public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
       return new WebMvcConfigurer() {
          public void addCorsMappings(CorsRegistry registry) {
             registry.addMapping("/**");
             //                    .allowedOrigins("*")
             //                    .allowedMethods("GET","POST","PUT","DELETE","OPTIONS","HEAD","PATCH")
             //                    .allowedHeaders("*");
          }
       };
    }
} */


