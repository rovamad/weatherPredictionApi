package com.rovamad.weather.settings;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sura.meteored")
@Getter @Setter
public class PropertiesConfigs {

	private String endpoint;
	private String lang;
	private String apiKey;
}
