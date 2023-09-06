package com.bagih.belajarspringaop.aspect

import org.aspectj.lang.annotation.Pointcut

class JointPointConfig {
    @Pointcut("execution(* com.bagih.belajarspringaop.model.*.*(..))")
    fun modelLayerPointCut(){}

    @Pointcut("execution(* com.bagih.belajarspringaop.service.*.*(..))")
    fun serviceLayerPointCut(){}

    @Pointcut("com.bagih.belajarspringaop.aspect.modelLayerPointCut() || " + "com.bagih.belajarspringaop.aspect.serviceLayerPointCut()")
    fun allLayerPointCut(){}

    @Pointcut("bean(movie*)")
    fun movieBeanPointCut(){}
}