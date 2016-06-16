package ee.politsei.portal.controller;

import ee.politsei.portal.service.DatabaseInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PortalController {

    @Autowired
    DatabaseInitializer initializer;

    @RequestMapping("/")
    public String doIndex(Map<String, Object> model) {
        return "index";
    }

    @RequestMapping("/reset")
    public String reset(Map<String, Object> model) {
        initializer.populateDatabase();
        return "reset";
    }

}
