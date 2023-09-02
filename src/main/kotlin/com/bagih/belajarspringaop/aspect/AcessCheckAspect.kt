package com.bagih.belajarspringaop.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration

@Aspect
@Configuration
class AccessCheckAspect {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    fun before(joinPoint: JoinPoint){
        logger.info("intercepted call before execution: {}", joinPoint)
    }
}