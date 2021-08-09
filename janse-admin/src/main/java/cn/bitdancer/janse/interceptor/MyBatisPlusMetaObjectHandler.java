package cn.bitdancer.janse.interceptor;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * <>
 * mybatis-plus时间自动注入插件
 * </>
 * @author hzy
 * @date 2021/7/13
 */
@Component
public class MyBatisPlusMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateAt", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject,"createAt", LocalDateTime.class, LocalDateTime.now());
    }


    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateAt", LocalDateTime.class, LocalDateTime.now());
    }
}
