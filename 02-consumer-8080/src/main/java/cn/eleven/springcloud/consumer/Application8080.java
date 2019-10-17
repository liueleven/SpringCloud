package cn.eleven.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @EnableDiscoveryClient 开启服务发现客户端
 * @description:
 * @date:        2019-10-15
 * @author:      十一
 */
@SpringBootApplication
public class Application8080 {

    public static void main(String[] args) {
        SpringApplication.run(Application8080.class, args);
    }

}
