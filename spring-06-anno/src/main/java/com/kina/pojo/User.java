package com.kina.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// 等价于<bean id="user" class="com.kina.pojo.User"/>
// @Component 组件
@Component
@Scope("singleton")
public class User {
    // 相当于<bean id = "user" class = "com.kina.pojo.User>
    //       <property name = "name" value = "kina"
    public String name;

    @Value("马越")
    public void setName(String name) {
        this.name = name;
    }
}
