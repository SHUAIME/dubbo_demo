package com.yan.service.impl;

import com.yan.service.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author shuaime
 * @version 1.0
 * @date 2022/3/14 14:44
 */
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public String getResult() {
        return "dubbo success!!!!!";
    }
}
