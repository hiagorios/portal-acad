package br.uesc.portalacad.config.properties

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class MailProps {
    @NotBlank
    var host: String? = null

    @NotBlank
    var username: String? = null

    @NotNull
    var port: Int? = null

    @NotBlank
    var password: String? = null

    @NotNull
    var tls: Boolean? = null

    @NotNull
    var ssl: Boolean? = null
}