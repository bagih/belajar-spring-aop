package com.bagih.belajarspringaop.aspect

import lombok.extern.slf4j.Slf4j
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import java.util.Objects
import kotlin.jvm.Throws

@Aspect
@Configuration
class ExecutionTimeAspect {

    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @Around("execution(* com.bagih.belajarspringaop..*.*(..))")
    @Throws(Throwable::class)
    fun calculateExecutionTime(joinPoint: ProceedingJoinPoint): Any{
        val startTime: Long = System.currentTimeMillis()
        val returnValue: Any = joinPoint.proceed()
        val timeTaken: Long = System.currentTimeMillis() - startTime

        logger.info("time taken by $joinPoint to complete exectution is: $timeTaken")
        return returnValue
    }
}