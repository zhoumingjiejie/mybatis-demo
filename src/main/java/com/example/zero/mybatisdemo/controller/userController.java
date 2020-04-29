package com.example.zero.mybatisdemo.controller;

import com.example.zero.mybatisdemo.service.OzOrgUserinfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectName: [mybatis-demo]
 * Package:     [com.example.zero.mybatisdemo.controller.userController]
 * Description: 用户控制器
 * CreateDate:  2020/3/30 23:30
 *
 * @author 0.0.0
 * @version 1.0
 */
@RestController
public class userController {

    private final OzOrgUserinfoService ozOrgUserinfoService;

    public userController(OzOrgUserinfoService ozOrgUserinfoService) {
        this.ozOrgUserinfoService = ozOrgUserinfoService;
    }

    /**
     * 通过id加载一条数据
     * (调用：http://127.0.0.1:8082/load/1)
     *
     * @param id id
     * @return 用户信息类
     */
    @RequestMapping("load/{id}")
    public String load(@PathVariable long id) {
        return String.valueOf(this.ozOrgUserinfoService.load(id));
    }
}
