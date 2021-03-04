package br.uesc.portalacad.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotNull

@Validated
@Component
@ConfigurationProperties("project")
class ProjectProperties {

    @NotNull
    var mail: MailProps? = null
}