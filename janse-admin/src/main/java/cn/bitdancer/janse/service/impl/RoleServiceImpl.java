package cn.bitdancer.janse.service.impl;

import cn.bitdancer.janse.mapper.RoleMapper;
import cn.bitdancer.janse.po.Role;
import cn.bitdancer.janse.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
