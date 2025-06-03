package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class HtmlController {
// ========================== 01- document ====================================
  @GetMapping("/01-document/01-browser-env")
  public String docBrowserEvn() {
    return "html/01-document/01-browser-env";
  }

  @GetMapping("/01-document/02-dom-search")
  public String docDomSearch() {
    return "html/01-document/02-dom-search";
  }
  @GetMapping("/01-document/03-dom-query")
  public String docDomQuery() {
    return "html/01-document/03-dom-query";
  }

  @GetMapping("/01-document/04-node-property")
  public String docNodeProperty() {
    return "html/01-document/04-node-property";
  }

  @GetMapping("/01-document/05-dom-attribute")
  public String docComeAttribue() {
    return "html/01-document/05-dom-attribute";
  }

  @GetMapping("/01-document/06-dom-change")
  public String docDomChange() {
    return "html/01-document/06-dom-change";
  }

  @GetMapping("/01-document/07-style-class")
  public String docStyleClass() {
    return "html/01-document/07-style-class";
  }

  @GetMapping("/01-document/08-elem-size-scroll")
  public String docElemSizeScroll() {
    return "html/01-document/08-elem-size-scroll";
  }

  @GetMapping("/01-document/09-browser-size")
  public String docBrowserSize() {
    return "html/01-document/09-browser-size";
  }

  @GetMapping("/01-document/10-position")
  public String docPosition() {
    return "html/01-document/10-position";
  }

  // ========================== 02 event ========================================
  @GetMapping("/02-event/01-browser-event")
  public String eventBrowserEvent() {
    return "html/02-event/01-browser-event";
  }
  @GetMapping("/02-event/02-event-bubbling")
  public String eventBubbling() {
    return "html/02-event/02-event-bubbling";
  }

  // ========================= 03 UI event ==================================
  @GetMapping("/03-UI-event/01-mouse-event")
  public String uIEventMouse() {
    return "html/03-UI-event/01-mouse-event";
  }
  @GetMapping("/03-UI-event/02-drag-drop-mouseevent")
  public String uIEventDragDrop() {
    return "html/03-UI-event/02-drag-drop-mouseevent";
  }
  @GetMapping("/03-UI-event/03-keydown-up")
  public String uIEventKeydown() {
    return "html/03-UI-event/03-keydown-up";
  }
  @GetMapping("/03-UI-event/04-scroll")
  public String uIEventScroll() {
    return "html/03-UI-event/04-scroll";
  }

  // =========================== 04 form ==================================
  @GetMapping("/04-form/01-property-method")
  public String formPropertyMethod() {
    return "html/04-form/01-property-method";
  }
  @GetMapping("/04-form/02-focus-blur")
  public String formFocus() {
    return "html/04-form/02-focus-blur";
  }
  @GetMapping("/04-form/03-event-change-input")
  public String formEventChangeInput() {
    return "html/04-form/03-event-change-input";
  }
  @GetMapping("/04-form/04-submit")
  public String formSubmit() {
    return "html/04-form/04-submit";
  }

  // ==================== 05 Ect ===============================
  @GetMapping("/05-etc/01-media")
  public String etcMedia() {
    return "html/05-etc/01-media";
  }
  @GetMapping("/05-etc/01-todo-list")
  public String etcTodoList() {
    return "html/05-etc/01-todo-list";
  }

  // ===================== 06 html basic ===========================
  @GetMapping("/06-html-basic/01-flex")
  public String htmlBasicFlex() {
    return "html/06-html-basic/01-flex";
  }
  @GetMapping("/06-html-basic/02-css-grid")
  public String htmlBasicCssGrid() {
    return "html/06-html-basic/02-css-grid";
  }

  @GetMapping("/06-html-basic/03-color-map")
  public String htmlBasicColorMap() {
    return "html/06-html-basic/03-color-map";
  }

}
