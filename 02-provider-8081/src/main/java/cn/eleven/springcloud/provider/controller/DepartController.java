package cn.eleven.springcloud.provider.controller;


import cn.eleven.springcloud.provider.bean.Depart;
import cn.eleven.springcloud.provider.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @description: controller
 * @date:        2019-10-15
 * @author:      十一
 */
@RequestMapping("/provider/depart")
@RestController
public class DepartController {
    @Autowired
    private DepartService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart) {
        return service.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id") int id) {
        return service.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean updateHandle(@RequestBody Depart depart) {
        return service.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        return service.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandle() {
        return service.listAllDeparts();
    }

    @GetMapping("/discovery")
    public List<String> discovery() {
        // 获取到服务列表中所有微服务名称
        List<String> applicationNames = discoveryClient.getServices();
        for (String name : applicationNames) {
            List<ServiceInstance> instances = discoveryClient.getInstances(name);
            for (ServiceInstance instance : instances) {
                System.out.println("<=== " + instance.getHost() + ":" + instance.getPort());
            }
        }
        return applicationNames;
    }
}
