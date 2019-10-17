package cn.eleven.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka 客户端，可以加下列注解，也可以不加，会自动注册到eureka服务中心
 * {@link EnableEurekaClient} 仅支持eureka
 * {@link EnableDiscoveryClient} 支持范围更广
 * @description:
 * @date:        2019-10-15
 * @author:      十一
 */
@SpringBootApplication
public class Application8081 {

    public static void main(String[] args) {
        SpringApplication.run(Application8081.class, args);
    }

}
