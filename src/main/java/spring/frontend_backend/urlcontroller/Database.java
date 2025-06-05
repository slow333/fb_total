package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/database")
public class Database {
  // ==============================================
  // ############## 1장: w3-Mysql #################
  // ==============================================
  @GetMapping("/01-mysql/00-mysql-basic")
  public String w3MysqlBasic() {
    return "database/01-mysql/00-mysql-basic";
  }

  @GetMapping("/01-mysql/01-db-table-handle")
  public String w3Create() {
    return "database/01-mysql/01-db-table-handle";
  }

  @GetMapping("/01-mysql/02-constraints")
  public String w3constraints() {
    return "database/01-mysql/02-constraints";
  }

  @GetMapping("/01-mysql/03-select")
  public String w3select() {
    return "database/01-mysql/03-select";
  }

  @GetMapping("/01-mysql/04-view-insert-update-delete")
  public String w3InsertUpdateDelete() {
    return "database/01-mysql/04-view-insert-update-delete";
  }
  
  @GetMapping("/01-mysql/05-select-search-like-in-between")
  public String w3LikeWildcard() {
    return "database/01-mysql/05-select-search-like-in-between";
  }

  @GetMapping("/01-mysql/06-aggregate")
  public String w3Aggregate() {
    return "database/01-mysql/06-aggregate";
  }

  @GetMapping("/01-mysql/07-join")
  public String w3Join() {
    return "database/01-mysql/07-join";
  }

  @GetMapping("/01-mysql/08-group-by-having")
  public String w3GroupByHaving() {
    return "database/01-mysql/08-group-by-having";
  }

  @GetMapping("/01-mysql/09-function-and-etc")
  public String functionsAndEtc() {
    return "database/01-mysql/09-function-and-etc";
  }
    @GetMapping("/01-mysql/10-procedure-trigger")
  public String functionsProcedureTrigger() {
    return "database/01-mysql/10-procedure-trigger";
  }
  
  // =====================================================================================
  // ############### 2장: PostgreSQL #################
  // =====================================================================================
  @GetMapping("/02-psql/01-installation")
  public String psqlInstallation() {
    return "database/02-psql/01-installation";
  }

  @GetMapping("/02-psql/02-psql-basic-crud")
  public String psqlBasicCRUD() {
    return "database/02-psql/02-psql-basic-crud";
  }
}
