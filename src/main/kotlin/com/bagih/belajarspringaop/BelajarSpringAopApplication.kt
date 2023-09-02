package com.bagih.belajarspringaop

import com.bagih.belajarspringaop.aspect.AccessCheckAspect
import com.bagih.belajarspringaop.service.FilteringTechnique1
import com.bagih.belajarspringaop.service.FilteringTechnique2
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(AccessCheckAspect::class)
class BelajarSpringAopApplication(
	val filteringTechnique1: FilteringTechnique1,
	val filteringTechnique2: FilteringTechnique2
): ApplicationRunner{
	val log: Logger = LoggerFactory.getLogger(this::class.java)

	override fun run(args: ApplicationArguments?) {
		log.info("filter 1: ${filteringTechnique1.collaborativeFiltering()}")
		log.info("filter 2: ${filteringTechnique2.contentBasedFiltering()}")
	}

}

fun main(args: Array<String>) {
	runApplication<BelajarSpringAopApplication>(*args)
}
