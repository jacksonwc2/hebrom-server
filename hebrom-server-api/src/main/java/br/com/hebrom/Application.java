package br.com.hebrom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import br.com.hebrom.propertie.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
@PropertySource(value = { "classpath:application.properties" })
@PropertySource(value = { "file:${conf.properties:install/conf.properties}" })
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}