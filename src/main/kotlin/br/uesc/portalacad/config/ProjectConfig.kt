package br.uesc.portalacad.config

import br.uesc.portalacad.service.StartupService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
@EnableJpaRepositories(basePackages = ["br.uesc.portalacad.repository", "br.uesc.portalacad.auth.repository"])
@EntityScan(basePackages = ["br.uesc.portalacad.domain", "br.uesc.portalacad.auth.domain"])
class ProjectConfig @Autowired constructor(
    private val startupService: StartupService
) : WebMvcConfigurer {

    @Bean
    @Profile("dev")
    fun instantiateDevDatabase() {
        startupService.instantiateDevDatabase()
    }
}