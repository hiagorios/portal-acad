package br.uesc.portalacad.service

import br.uesc.portalacad.config.properties.ProjectProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StartupService @Autowired constructor(
    private val properties: ProjectProperties
) {

    fun instantiateDevDatabase() {

    }
}