package cn.bitdancer.janse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Start Application
 *
 * @author D.Yang
 * @date 2021/7/23
 */
@SpringBootApplication
@MapperScan("cn.bitdancer.janse.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
