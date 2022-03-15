package com.yan.controller;

import com.yan.service.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaime
 * @version 1.0
 * @date 2022/3/14 15:21
 */
@RestController
public class DubboTestController {

    @Reference
    private DubboService dubboService;

    @GetMapping("/dubbo/test")
    public String test() {
        return dubboService.getResult();
    }

}
