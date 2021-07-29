package cn.bitdancer.janse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author D.Yang
 * @date 2021/7/26
 */
@RestController
public class UserController {

    @GetMapping("users")
    public String users() {
        return "Hello Janse!";
    }

}
