package com.jfeat;


import com.jfeat.crud.plus.META;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot方式启动类
 *
 * @author Admin
 * @Date 2017/5/21 12:06
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
@EnableFeignClients
public class AmApplication extends WebMvcConfigurerAdapter {

    // protected final static Logger log = LoggerFactory.getLogger(AmApplication.class);

    public static void main(String[] args) {
        META.enabledEav(true);
        SpringApplication.run(AmApplication.class, args);
        log.info("UAAS-APP running success!");
    }
}
