package br.com.hebrom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.config.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
@PropertySource(value = { "classpath:application.properties" })
@PropertySource(value = { "file:${conf.properties:install/conf.properties}" })
@EnableTransactionManagement
@RestController
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}