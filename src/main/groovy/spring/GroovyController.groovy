package spring



/**
 * Created by ama on 2015/3/17.
 */

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GroovyController {

    @RequestMapping("/gv")
    def gv(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "groovy";
    }
}
