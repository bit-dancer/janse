package cn.bitdancer.janse.api;

import cn.bitdancer.janse.po.User;
import cn.bitdancer.janse.service.UserService;
import cn.bitdancer.janse.util.CommonResult;
import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @GetMapping("users")
    public String users() {
        return "Hello Janse!";
    }

    @PostMapping("/login")
    public CommonResult login(@RequestParam String userName, @RequestParam String password) {
        User user = userService.getOne(new QueryWrapper<User>().eq("user_name", userName));
        if(ObjectUtils.isEmpty(user)){
            return CommonResult.ok("用户不存在").setData(user);
        }else {
            user = userService.getOne(new QueryWrapper<User>()
                .eq("user_name", userName).eq("password", SaSecureUtil.sha256(password)));
            if(ObjectUtils.isEmpty(user)){
                return CommonResult.ok("用户名或密码错误").setData(user);
            }else {
                StpUtil.login(user.getUserName());
                SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
                return CommonResult.ok("登录成功").setData("data", user).setData("token", tokenInfo);
            }
        }
    }

    @PostMapping("/register")
    public CommonResult register(@RequestBody User user){

        if(!ObjectUtils.isEmpty(userService.getOne(new QueryWrapper<User>().eq("user_name", user.getUserName())))){
            return CommonResult.ok("用户已存在").setData(false);
        }
        user.setPassword(SaSecureUtil.sha256(user.getPassword()));
        if(userService.save(user)){
            return CommonResult.ok("注册成功").setData(true);
        }else {
            return CommonResult.ok("注册失败").setData(false);
        }
    }

    @GetMapping("/logout")
    public void logout(){
        StpUtil.logout();
    }

    @SaCheckLogin
    @GetMapping("/userInfo/{id}")
    public CommonResult getUserList(@PathVariable Integer id){
        return CommonResult.ok().setData(userService.getById(id));
    }

    @SaCheckRole("admin")
    @GetMapping("/userList")
    public CommonResult userList(){
        return CommonResult.ok().setData(userService.list());
    }
}
