package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/js")
public class JsController {
  // ==============================================================================
  //########## javascript #################
  // ==============================================================================
  @GetMapping("/01-intro/01-start")
  public String jsIntroStart() {
    return "js/01-intro/01-start";
  }

  @GetMapping("/01-intro/02-docs-env")
  public String jsIntroDocs() {
    return "js/01-intro/02-docs-env";
  }

  // ==============================================================================
  //02-기본
  // ==============================================================================
  @GetMapping("/02-basic/01-basic")
  public String jsBasicStart() {
    return "js/02-basic/01-basic";
  }

  @GetMapping("/02-basic/02-data-type")
  public String jsBasicDtaType() {
    return "js/02-basic/02-data-type";
  }

  @GetMapping("/02-basic/03-basic-object")
  public String jsBasicBasicObject() {
    return "js/02-basic/03-basic-object";
  }

  @GetMapping("/02-basic/04-type-transform")
  public String jsBasicTypeTransform() {
    return "js/02-basic/04-type-transform";
  }
  @GetMapping("/02-basic/05-handle-string")
  public String jsBasicHandleString() {
    return "js/02-basic/05-handle-string";
  }
  @GetMapping("/02-basic/06-handle-array")
  public String jsBasicHandleArray() {
    return "js/02-basic/06-handle-array";
  }
  @GetMapping("/02-basic/07-iterable")
  public String jsBasicIterable() {
    return "js/02-basic/07-iterable";
  }
  @GetMapping("/02-basic/08-map-set")
  public String jsBasicMapSet() {
    return "js/02-basic/08-map-set";
  }
  @GetMapping("/02-basic/09-destructuring-assignment")
  public String jsBasicDestructuringAssignment() {
    return "js/02-basic/09-destructuring-assignment";
  }
  @GetMapping("/02-basic/10-date")
  public String jsBasicDate() {
    return "js/02-basic/10-date";
  }
  @GetMapping("/02-basic/11-json")
  public String jsBasicJson() {
    return "js/02-basic/11-json";
  }

  // ==============================================================================
  //  03-함수 심화학습
  // ==============================================================================
  @GetMapping("/03-adv/01-recursion-stack")
  public String jsAdvRecursionStack() {
    return "js/03-adv/01-recursion-stack";
  }
  @GetMapping("/03-adv/02-rest-param-spread-syntax")
  public String jsAdvRestParam() {
    return "js/03-adv/02-rest-param-spread-syntax";
  }
  @GetMapping("/03-adv/03-lexical")
  public String jsAdvLexical() {
    return "js/03-adv/03-lexical";
  }
  @GetMapping("/03-adv/04-setTimeout-Interval")
  public String jsAdvSetTimeout() {
    return "js/03-adv/04-setTimeout-Interval";
  }
  @GetMapping("/03-adv/05-call-apply")
  public String jsAdvCallApply() {
    return "js/03-adv/05-call-apply";
  }
  @GetMapping("/03-adv/06-bind")
  public String jsAdvBind() {
    return "js/03-adv/06-bind";
  }
  @GetMapping("/03-adv/07-arrow-func")
  public String jsAdvArrowFunc() {
    return "js/03-adv/07-arrow-func";
  }
  @GetMapping("/03-adv/08-try-catch")
  public String jsAdvTrayCatch() {
    return "js/03-adv/08-try-catch";
  }

  // ==============================================================================
  // 04-콜백 프라미스
  // ==============================================================================
  @GetMapping("/04-callback/01-callback")
  public String jsCallbackCallback() {
    return "js/04-callback/01-callback";
  }
  @GetMapping("/04-callback/02-promise")
  public String jsCallbackPromise() {
    return "js/04-callback/02-promise";
  }
  @GetMapping("/04-callback/03-promise-chaining")
  public String jsCallbackPromiseChaining() {
    return "js/04-callback/03-promise-chaining";
  }
  @GetMapping("/04-callback/04-promise-api")
  public String jsCallbackPromiseApi() {
    return "js/04-callback/04-promise-api";
  }
  @GetMapping("/04-callback/05-async-await")
  public String jsCallbackAsync() {
    return "js/04-callback/05-async-await";
  }

  // ==============================================================================
  // 05-module
  // ==============================================================================
  @GetMapping("/05-yield-module-etc/01-generator")
  public String jsModuleGenerator() {
    return "js/05-yield-module-etc/01-generator";
  }
  @GetMapping("/05-yield-module-etc/02-async-generator")
  public String jsModuleAsyncGenerator() {
    return "js/05-yield-module-etc/02-async-generator";
  }
  @GetMapping("/05-yield-module-etc/03-module")
  public String jsModuleModule() {
    return "js/05-yield-module-etc/03-module";
  }
  @GetMapping("/05-yield-module-etc/04-proxy")
  public String jsModuleProxy() {
    return "js/05-yield-module-etc/04-proxy";
  }
  @GetMapping("/05-yield-module-etc/05-currying")
  public String jsModuleCurry() {
    return "js/05-yield-module-etc/05-currying";
  }
  @GetMapping("/05-yield-module-etc/06-bigint")
  public String jsModuleBig() {
    return "js/05-yield-module-etc/06-bigint";
  }

  // ==============================================================================
  //06-Object
  // ==============================================================================
  @GetMapping("/06-object/01-js-object-intro")
  public String jsObjectIntro() {
    return "js/06-object/01-js-object-intro";
  }

  @GetMapping("/06-object/02-js-object-prototype")
  public String jsObjectPrototype() {
    return "js/06-object/02-js-object-prototype";
  }
  @GetMapping("/06-object/03-js-inheritance")
  public String jsObjectInheritance() {
    return "js/06-object/03-js-inheritance";
  }
  @GetMapping("/06-object/04-js-json")
  public String jsObjectJson() {
    return "js/06-object/04-js-json";
  }
  @GetMapping("/06-object/04-js-json2")
  public String jsObjectJson2() {
    return "js/06-object/04-js-json2";
  }

  // ==============================================================================
  //07-async
  // ==============================================================================
  @GetMapping("/07-async/01-js-async-intro")
  public String jsAsyncIntro() {
    return "js/07-async/01-js-async-intro";
  }
  @GetMapping("/07-async/02-js-async-eventHandler")
  public String jsAsyncEventHandler() {
    return "js/07-async/02-js-async-eventHandler";
  }
  @GetMapping("/07-async/03-js-promises")
  public String jsAsyncJsPromiese() {
    return "js/07-async/03-js-promises";
  }
  @GetMapping("/07-async/04-js-promises-ex")
  public String jsAsyncPromisesEx() {
    return "js/07-async/04-js-promises-ex";
  }
  @GetMapping("/07-async/05-promises-multiple")
  public String jsAsyncPromiesMultiple() {
    return "js/07-async/05-promises-multiple";
  }
  @GetMapping("/07-async/06-js-custom-promises")
  public String jsAsyncCustomPromiese() {
    return "js/07-async/06-js-custom-promises";
  }
  @GetMapping("/07-async/07-js-promise-api")
  public String jsAsyncPromisesApi() {
    return "js/07-async/07-js-promise-api";
  }
  @GetMapping("/07-async/08-js-worker")
  public String jsAsyncJsWorker() {
    return "js/07-async/08-js-worker";
  }

  // ==============================================================================
  //08-network request
  // ==============================================================================
  @GetMapping("/08-net-req/01-fetch")
  public String jsNetFetch() {
    return "js/08-net-req/01-fetch";
  }
  @GetMapping("/08-net-req/02-formData-fetch")
  public String jsNetFormData() {
    return "js/08-net-req/02-formData-fetch";
  }
  @GetMapping("/08-net-req/03-fetch-Abort")
  public String jsNetFetchAbort() {
    return "js/08-net-req/03-fetch-Abort";
  }
  @GetMapping("/08-net-req/04-cors")
  public String jsNetCors() {
    return "js/08-net-req/04-cors";
  }
  @GetMapping("/08-net-req/05-url-object")
  public String jsNetUrlObject() {
    return "js/08-net-req/05-url-object";
  }
  @GetMapping("/08-net-req/06-XMLHttpRequest")
  public String jsNetHMLHttpRequest() {
    return "js/08-net-req/06-XMLHttpRequest";
  }
  @GetMapping("/08-net-req/07-WebSocket")
  public String jsNetWebsocket() {
    return "js/08-net-req/07-WebSocket";
  }

}
