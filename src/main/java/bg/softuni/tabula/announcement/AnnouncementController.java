package bg.softuni.tabula.announcement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnnouncementController {

  @GetMapping("/announcements")
  public String announcement(Model model) {
    model.addAttribute("active", "announcements");
    return "announcement/announcements";
  }
}
