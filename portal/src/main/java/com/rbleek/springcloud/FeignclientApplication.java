package com.rbleek.springcloud;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
@EnableCircuitBreaker
@EnableHystrixDashboard 
@RequestMapping(path = "/shop", produces = APPLICATION_JSON_UTF8_VALUE)
public class FeignclientApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignclientApplication.class);
    @Autowired
    private CatalogClient catalogClient;
 
    public static void main(String[] args) {
        SpringApplication.run(FeignclientApplication.class, args);
    }
 
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        LOGGER.info("feign client called");
        String result = "";
        for(String s : catalogClient.getItems().getCatalog()) {
            result += " - " + s + " \n";
        }
        return result;
    }
}
