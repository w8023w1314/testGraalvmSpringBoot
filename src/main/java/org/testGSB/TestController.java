package org.testGSB;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testGSB.entity.SysConfig;
import org.testGSB.mapper.SysConfigMapper;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private SysConfigMapper sysConfigMapper;

    @RequestMapping("/test")
    public SysConfig  test(){

        SysConfig config = sysConfigMapper.selectConfigById(1l);

        return config;
    }
}
