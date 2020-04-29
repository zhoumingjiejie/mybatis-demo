package com.example.zero.mybatisdemo.service;

import com.example.zero.mybatisdemo.entity.OzOrgUserinfo;

/**
 * ProjectName: [mybatis-demo]
 * Package:     [com.example.zero.mybatisdemo.service.OzOrgUserinfoService]
 * Description: 用户信息service
 * CreateDate:  2020/3/30 23:26
 *
 * @author 0.0.0
 * @version 1.0
 */
public interface OzOrgUserinfoService {
    /**
     * 通过id加载一条数据
     *
     * @param id id
     * @return 用户信息类
     */
    OzOrgUserinfo load(long id);
}
