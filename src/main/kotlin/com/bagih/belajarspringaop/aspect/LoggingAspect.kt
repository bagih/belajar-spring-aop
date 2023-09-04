package com.bagih.belajarspringaop.aspect

import lombok.extern.slf4j.Slf4j
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Aspect
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import java.util.Objects

@Aspect
@Configuration
class LoggingAspect {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @AfterReturning(value = "execution(* com.bagih.belajarspringaop.service.*.*(..))", returning = "result")
    fun logAfterExecution(joinPoint: JoinPoint, result: Objects){
        logger.info("{} returning with: {}", joinPoint, result)
    }

    @AfterThrowing(value = "execution(* com.bagih.belajarspringaop.service.*.*(..))", throwing = "exception")
    fun logAfterException(joinPoint: JoinPoint, exception: Objects){
        logger.info("exception in {} returned with: {}", joinPoint, exception)
    }

    @After(value = "execution(* com.bagih.belajarspringaop.service*.*(..))")
    fun logAfterMethod(joinPoint: JoinPoint) {
        logger.info("After: {}", joinPoint)
    }
}