package com.kina.DiyPointCut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.kina.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=======方法执行前=======");
    }
    @After("execution(* com.kina.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=======在方法执行之后========");
    }
    // 在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.kina.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println(jp.getSignature());
        //  执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
