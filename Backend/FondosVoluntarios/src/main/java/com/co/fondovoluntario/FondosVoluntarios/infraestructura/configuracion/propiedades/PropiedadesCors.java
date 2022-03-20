package com.co.fondovoluntario.FondosVoluntarios.infraestructura.configuracion.propiedades;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "cors")
public class PropiedadesCors {
    private String urlPermitida;
}
