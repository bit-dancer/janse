package cn.bitdancer.janse.service.impl;

import cn.bitdancer.janse.mapper.UserMapper;
import cn.bitdancer.janse.po.User;
import cn.bitdancer.janse.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
