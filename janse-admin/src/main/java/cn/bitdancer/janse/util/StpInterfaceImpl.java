package cn.bitdancer.janse.util;

import cn.bitdancer.janse.po.Role;
import cn.bitdancer.janse.service.RoleService;
import cn.dev33.satoken.stp.StpInterface;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 自定义权限验证接口扩展
 * @author: hzy
 * @date: 2021/8/9
 */
@Component
@AllArgsConstructor
public class StpInterfaceImpl implements StpInterface {
    private final RoleService roleService;

    @Override
    public List<String> getPermissionList(Object o, String s) {
        return null;
    }

    /**
     * 返回一个账号所拥有的角色标识集合 (权限与角色可分开校验)
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        List<Role> roles = roleService.list(new QueryWrapper<Role>().eq("holder_name", loginId.toString()));
        List<String> roleList = new ArrayList<>(roles.size());
        for (Role role : roles) {
            roleList.add(role.getRole().toString());
        }
        return roleList;
    }
}
