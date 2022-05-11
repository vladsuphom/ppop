package design.hustlelikeaboss.customr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by quanjin on 6/20/17.
 */
@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {
        return "index";
    }
}
