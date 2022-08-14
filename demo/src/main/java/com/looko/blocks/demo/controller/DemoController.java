package com.looko.blocks.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RefreshScope   // 实时同步 nacos 配置
public class DemoController {

    @Value("${demo.value.a}")
    private String demoValueA;

    @GetMapping("/a")
    public Object getDemoValueA() {
        return demoValueA;
    }
}
