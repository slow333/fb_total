package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restapi")
public class RestApiController {

  // =====================================================================================
  // ############### 0장: Spring boot : 소개 및 기본 설정 #################
  // =====================================================================================
  @GetMapping("/00-intro/01-intro")
  public String restLectureIntro() {
    return "restapi/00-intro/01-intro";
  }

  @GetMapping("/00-intro/02-intro-spring-boot")
  public String restIntroSpringBoot() {
    return "restapi/00-intro/02-intro-spring-boot";
  }

  @GetMapping("/00-intro/03-project-structure")
  public String restProjectStructure() {
    return "restapi/00-intro/03-project-structure";
  }

  @GetMapping("/00-intro/04-sts-setting")
  public String restStsSetting() {
    return "restapi/00-intro/04-sts-setting";
  }

  @GetMapping("/00-intro/05-intellij-setting")
  public String restIntellijSetting() {
    return "restapi/00-intro/05-intellij-setting";
  }

  // =====================================================================================
  //############### 1장 : 프로젝트 구성 및 설계 방식     #################
  // =====================================================================================
  @GetMapping("/01-designProject/01-project-design")
  public String restProjectDesign() {
  return "restapi/01-designProject/01-project-design";
}

  @GetMapping("/01-designProject/02-project-planning")
  public String restPlanning() {
    return "restapi/01-designProject/02-project-planning";
  }

  @GetMapping("/01-designProject/03-oop-design-using-class-diagram")
  public String restDesignOOPClass() {
    return "restapi/01-designProject/03-oop-design-using-class-diagram";
  }

  @GetMapping("/01-designProject/04-oop-design-using-sequence-diagram")
  public String restDesignSequenceDiagram() {
    return "restapi/01-designProject/04-oop-design-using-sequence-diagram";
  }

  @GetMapping("/01-designProject/05-tdd-dev")
  public String restTDD() {
    return "restapi/01-designProject/05-tdd-dev";
  }

  // =====================================================================================
  //############### 2장 : 프로젝트 구성 및 설계 방식       #################
  //############### 3장 : 프로젝트 실제 코딩(TDD)        #################
  // =====================================================================================
  @GetMapping("/03-implement/01-CRUD")
  public String restCRUE() {
    return "restapi/03-implement/01-CRUD";
  }

  @GetMapping("/03-implement/02-refac")
  public String restRefac() {
    return "restapi/03-implement/02-refac";
  }

  @GetMapping("/03-implement/03-artifact-assignment")
  public String restArtifactAssignment() {
    return "restapi/03-implement/03-artifact-assignment";
  }

  @GetMapping("/03-implement/04-user-crud")
  public String restUserCrud() {
    return "restapi/03-implement/04-user-crud";
  }

  @GetMapping("/03-implement/05-paging-sorting")
  public String restPagingSorting() {
    return "restapi/03-implement/05-paging-sorting";
  }

  @GetMapping("/03-implement/06-spec")
  public String restSpec() {
    return "restapi/03-implement/06-spec";
  }

  // =====================================================================================
  //############### 4장 : Spring security         #################
  // =====================================================================================
  @GetMapping("/04-spring-security/01-spring-security-intro")
  public String restSpringSecurityIntro() {
    return "restapi/04-spring-security/01-spring-security-intro";
  }

  @GetMapping("/04-spring-security/02-http-basic-authentication")
  public String restSpringSecurityHTTPBasicAuthentication() {
    return "restapi/04-spring-security/02-http-basic-authentication";
  }

  @GetMapping("/04-spring-security/03-jwt")
  public String restSpringJwt() {
    return "restapi/04-spring-security/03-jwt";
  }

  @GetMapping("/04-spring-security/04-handling-spring-security-exception-using-controller-advice")
  public String restSpringJwtExceptionHandler() {
    return "restapi/04-spring-security/04-handling-spring-security-exception-using-controller-advice";
  }

  @GetMapping("/04-spring-security/05-spring-security-test")
  public String restSpringSecurityTest() {
    return "restapi/04-spring-security/05-spring-security-test";
  }

  @GetMapping("/04-spring-security/06-Restrict-only-their-own-data")
  public String restSpringSecurityRestrictAccessOnlyTheirOwnData() {
    return "restapi/04-spring-security/06-Restrict-only-their-own-data";
  }

  @GetMapping("/04-spring-security/07-password-change-redis")
  public String restPasswordChangeWithRedis() {
    return "restapi/04-spring-security/07-password-change-redis";
  }

  @GetMapping("/04-spring-security/08-cors-setting")
  public String restCorsSetting() {
    return "restapi/04-spring-security/08-cors-setting";
  }

// =====================================================================================
  //############### 5장 : 개발후 적용, 클라우드 사용 등     #################
// =====================================================================================
  @GetMapping("/05-deploy/01-packaging-container")
  public String deploymentPackagingContainer() {
    return "restapi/05-deploy/01-packaging-container";
  }

  @GetMapping("/05-deploy/02-ci-di")
  public String deploymentCIDI() {
    return "restapi/05-deploy/02-ci-di";
  }

  @GetMapping("/05-deploy/03-real-db-connect")
  public String deploymentRealDB() {
    return "restapi/05-deploy/03-real-db-connect";
  }

  //############### 6장 : 성능 모니터링(actuator) with docker #################
  @GetMapping("06-observing/01-spring-actuator")
  public String observingActuator() {
    return "restapi/06-observing/01-spring-actuator";
  }

  @GetMapping("06-observing/02-grafana-prometheus-zipkin-mail")
  public String observingApps() {
    return "restapi/06-observing/02-grafana-prometheus-zipkin-mail";
  }

  // =====================================================================================
  //############### 7장 : RestClient   ##################################
  // =====================================================================================
  @GetMapping("07-restClient/01-openai")
  public String restClientOpenAI() {
    return "restapi/07-restClient/01-openai";
  }


  // =====================================================================================
  //############### 33장 : 프로젝트에서 공통으로 필요한 구성들 #################
  // =====================================================================================
  @GetMapping("/33-common-needs/01-h2db-setting")
  public String commonH2dbSetting() {
    return "restapi/33-common-needs/01-h2db-setting";
  }

  @GetMapping("/33-common-needs/02-postman-why-dto")
  public String commonPostmanAndDto() {
    return "restapi/33-common-needs/02-postman-why-dto";
  }
  @GetMapping("/33-common-needs/03-security-config")
  public String commonSecurityConfig() {
    return "restapi/33-common-needs/03-security-config";
  }
  @GetMapping("/33-common-needs/04-github")
  public String commonGithub() {
    return "restapi/33-common-needs/04-github";
  }

  @GetMapping("/33-common-needs/06-upgrading-spring-boot-version")
  public String commonVersionUpgrade() {
    return "restapi/33-common-needs/06-upgrading-spring-boot-version";
  }
  @GetMapping("/33-common-needs/07-command")
  public String commonCommand() {
    return "restapi/33-common-needs/07-command";
  }
}
