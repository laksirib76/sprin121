package t121.t121;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/Hello")
@RestController
public class HelloController {
    public String hello(){
        return "Hello welcome";
    }
}
