package hello;
import entities.PersonnesEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Controller
public class IndexController {


   @RequestMapping("/")
    public String login() {
        return "login";
    }





    @RequestMapping("/index1")
    //@ResponseBody
    public String index1(ModelMap model) {



        model.addAttribute("t","test") ;
        return "index1";
    }

   /* @Autowired(required = true)
    private PersonneRepository personDao;*/

}
