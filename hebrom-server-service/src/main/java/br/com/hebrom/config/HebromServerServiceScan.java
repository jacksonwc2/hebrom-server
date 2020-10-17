package br.com.hebrom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(lazyInit = true, basePackages = { "br.com.sysmo.service" })
@EnableAspectJAutoProxy
@Configuration
public class HebromServerServiceScan {

}
