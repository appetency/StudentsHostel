package web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Administrator on 2017/1/18.
 */
@Controller
@RequestMapping({"/","/index"})
public class IndexController {
    @RequestMapping(method = GET)
    public String home(Model model) {
        return "Index";
    } /*视图名为home*/
}
