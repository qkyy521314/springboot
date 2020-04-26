package com.example.message.gateway.aop;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 *      1.service方法
 *      2.打印入参
 *      3.打印异常信息
 */
@Component
@Aspect
@Slf4j
public class ServiceAop {

    //切入点
    @Pointcut("execution(public * com.example.message.gateway.service.impl..*.*(..))")
    public void point() {
    }

    /**
     * 在切点之前织入
     * @param joinPoint
     * @throws Throwable
     */
    @Before("point()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 打印调用 service 的全路径以及执行方法
        log.info("   Class Method   : {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        // 打印请求入参
        log.info("   Request Args   : {}", new Gson().toJson(joinPoint.getArgs()));
    }

    /**
     * 环绕
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("point()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = proceedingJoinPoint.proceed();
        // 打印出参
        log.info("   Response Args  : {}", new Gson().toJson(result));
        return result;
    }

    /**
     * 在切点之后织入
     * @throws Throwable
     */
    @After("point()")
    public void doAfter() throws Throwable {
        // 每个请求之间空一行
        log.info("");
    }

}