package org.fkg.springboot.hello.controller;

import javax.annotation.Resource;

import org.fkg.springboot.hello.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devicesController {
   
    //定义业务层对象
    @Resource
    private HelloService helloService;   
    
    @RequestMapping("/devices")
    public String getAllUsers(){
       return helloService.getAllUsers(); 
    }
    
    @RequestMapping("/show")
    public String showDevices(){
       return helloService.getAllUsers(); 
    }
}