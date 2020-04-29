package com.example.zero.mybatisdemo.mapper;

import com.example.zero.mybatisdemo.entity.OzOrgUserinfo;

/**
 * ProjectName: [mybatis-demo]
 * Package:     [com.example.zero.mybatisdemo.mapper.OzOrgUserinfoMapper]
 * Description: 操作数据库的用户mapper
 * CreateDate:  2020/3/30 23:20
 *
 * @author 0.0.0
 * @version 1.0
 */
public interface OzOrgUserinfoMapper {
    /**
     * 通过id加载一条数据
     *
     * @param id id
     * @return 用户信息类
     */
    OzOrgUserinfo load(long id);
}
