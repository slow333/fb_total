package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class SpringBoardController {

  // ==============================================================================
  //########## 1번째 장: basic project setting #################
  // ==============================================================================
  @GetMapping("/01-basics/00-sbb-index")
  public String sbbIndex() {
    return "spring/01-basics/00-sbb-index";
  }

  @GetMapping("/01-basics/00-project-architecture")
  public String projectArchitecture() {
    return "spring/01-basics/00-project-architecture";
  }

  @GetMapping("/01-basics/01-Controller")
  public String controllerSetting() {
    return "spring/01-basics/01-Controller";
  }

  @GetMapping("/01-basics/02-JPA-db")
  public String jpaDb() {
    return "spring/01-basics/02-JPA-db";
  }

  @GetMapping("/01-basics/03-entity-db-mapping")
  public String entityDbMapping() {
    return "spring/01-basics/03-entity-db-mapping";
  }

  @GetMapping("/01-basics/04-repository-basic")
  public String repositoryBasic() {
    return "spring/01-basics/04-repository-basic";
  }

  @GetMapping("/01-basics/05-repository-crud")
  public String repositoryCrud() {
    return "spring/01-basics/05-repository-crud";
  }

  @GetMapping("/01-basics/06-domain-categorize")
  public String domainCateorize() {
    return "spring/01-basics/06-domain-categorize";
  }

  @GetMapping("/01-basics/07-templates")
  public String setTemplates() {
    return "spring/01-basics/07-templates";
  }

  // ==============================================================================
  //########## 2번째 장: board base pages #################
  // ==============================================================================
  @GetMapping("/02-board-basic-page/01-question-list")
  public String questionListNote() {
    return "spring/02-board-basic-page/01-question-list";
  }

  @GetMapping("//02-board-basic-page/02-service-intro")
  public String serviceIntro() {
    return "spring//02-board-basic-page/02-service-intro";
  }

  @GetMapping("/02-board-basic-page/03-question-detail")
  public String questionDetail() {
    return "spring/02-board-basic-page/03-question-detail";
  }

  @GetMapping("/02-board-basic-page/04-thymeleaf-style")
  public String thymeleafStyle() {
    return "spring/02-board-basic-page/04-thymeleaf-style";
  }

  @GetMapping("/02-board-basic-page/05-question-create")
  public String questionCreate() {
    return "spring/02-board-basic-page/05-question-create";
  }

  @GetMapping("/02-board-basic-page/06-validation")
  public String questionValidate() {
    return "spring/02-board-basic-page/06-validation";
  }

  // ==============================================================================
  //########## 3번째 장: advanced #################
  // ==============================================================================
  @GetMapping("/03-board-advanced/01-nav-bar")
  public String navBar() {
    return "spring/03-board-advanced/01-nav-bar";
  }

  @GetMapping("/03-board-advanced/02-paging")
  public String paging() {
    return "spring/03-board-advanced/02-paging";
  }

  @GetMapping("/03-board-advanced/03-board-detail")
  public String boardDetail() {
    return "spring/03-board-advanced/03-board-detail";
  }

  @GetMapping("/03-board-advanced/04-spring-security")
  public String aboutSpringSecurity() {
    return "spring/03-board-advanced/04-spring-security";
  }

  @GetMapping("/03-board-advanced/05-user-subscribe")
  public String userSubscribe() {
    return "spring/03-board-advanced/05-user-subscribe";
  }

  @GetMapping("/03-board-advanced/06-login-logout")
  public String loginAndLogout() {
    return "spring/03-board-advanced/06-login-logout";
  }

  // ==============================================================================
  //########## 4번째 장 : 수정,삭제, 사용자 추가 등 #################
  // ==============================================================================
  @GetMapping("/04-board-more/01-add-author")
  public String addAuthor() {
    return "spring/04-board-more/01-add-author";
  }

  @GetMapping("/04-board-more/02-edit-delete")
  public String editDelete() {
    return "spring/04-board-more/02-edit-delete";
  }

  @GetMapping("/04-board-more/03-like")
  public String addLike() {
    return "spring/04-board-more/03-like";
  }

  @GetMapping("/04-board-more/04-anchor")
  public String addAnchor() {
    return "spring/04-board-more/04-anchor";
  }

  @GetMapping("/04-board-more/05-markdown")
  public String addMarkdown() {
    return "spring/04-board-more/05-markdown";
  }

  @GetMapping("/04-board-more/06-search")
  public String addSearch() {
    return "spring/04-board-more/06-search";
  }

  // ==============================================================================
  //########## 5번째 장 : rest aip #################
  // ==============================================================================
  @GetMapping("/05-restapi/00-rest-spring-27-setting")
  public String restApiBasicsSetting() {
    return "spring/05-restapi/00-rest-spring-27-setting";
  }

  @GetMapping("/05-restapi/01-project-basic")
  public String restApiBasicsProjectBasic() {
    return "spring/05-restapi/01-project-basic";
  }

  @GetMapping("/05-restapi/02-get-api")
  public String restApiBasicsGetApi() {
    return "spring/05-restapi/02-get-api";
  }

  @GetMapping("/05-restapi/03-post-api")
  public String restApiBasicsPostApi() {
    return "spring/05-restapi/03-post-api";
  }

  @GetMapping("/05-restapi/04-put-delete-api")
  public String restApiBasicsPutDeleteApi() {
    return "spring/05-restapi/04-put-delete-api";
  }

  @GetMapping("/05-restapi/05-jpa-entity-dao-dto")
  public String restApiBasicsJpaEntity() {
    return "spring/05-restapi/05-jpa-entity-dao-dto";
  }
  @GetMapping("/05-restapi/06-logback")
  public String restApiBasicsLogback() {
    return "spring/05-restapi/06-logback";
  }

  @GetMapping("/05-restapi/07-validation")
  public String restApiMoreValid() {
    return "spring/05-restapi/07-validation";
  }

  @GetMapping("/05-restapi/08-rest-error-handler")
  public String restApiMoreErrorHandler() {
    return "spring/05-restapi/08-rest-error-handler";
  }

  // ==============================================================================
  //########## 6번째 장: JSP #################
  // ==============================================================================
  @GetMapping("/06-JSP/01-settings")
  public String setJSP() {
    return "spring/06-JSP/01-settings";
  }

  @GetMapping("/06-JSP/02-start-jsp")
  public String startJSP() {
    return "spring/06-JSP/02-start-jsp";
  }

  @GetMapping("/06-JSP/03-method-scriptlit")
  public String jspMethodScript() {
    return "spring/06-JSP/03-method-scriptlit";
  }
}
