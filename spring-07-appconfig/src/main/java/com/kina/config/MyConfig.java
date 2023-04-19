package com.kina.config;

import com.kina.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

// @Configuration 代表这是一个配置类，就和我们之前看到的beans.xml是一样的
@Configuration
@ComponentScan("com.kina.pojo")
@Import(MyConfig2.class)
//  这个也会spring容器托管，注册到容器中，因为他本来就是一个@conponent
public class MyConfig {
    // 注册一个bean，就相当于我们之前写的一个bean标签，这
    // 个方法的名字就相当于bean标签中的id属性，方法的返回值就相当于class属性
    @Bean
    public User getUser() {
        // 就是返回要注入到bean中的对象
        return new User();
    }
}
