package cn.eleven.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 开启Eureka服务
 */
@SpringBootApplication
@EnableEurekaServer
public class Application8100 {

    public static void main(String[] args) {
        SpringApplication.run(Application8100.class, args);
    }

}
