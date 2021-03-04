package br.uesc.portalacad.config.properties

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class MailProperties {

    @NotBlank
    lateinit var host: String

    @NotBlank
    lateinit var username: String

    @NotNull
    var port: Int = 587

    @NotBlank
    lateinit var password: String

    @NotNull
    var tls: Boolean = false

    @NotNull
    var ssl: Boolean = false
}