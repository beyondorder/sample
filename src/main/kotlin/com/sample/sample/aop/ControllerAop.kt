package com.sample.sample.aop

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Aspect
@Component
class ControllerAop {

    private val log = LoggerFactory.getLogger(javaClass)

    @Around("execution(* com.sample.sample..*(..))")
    fun doLog(joinPoint: ProceedingJoinPoint):Any{
        log.info("[log] {}", joinPoint.signature)
        return joinPoint.proceed()
    }

}