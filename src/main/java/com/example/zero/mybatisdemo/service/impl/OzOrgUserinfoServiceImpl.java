package com.example.zero.mybatisdemo.service.impl;

import com.example.zero.mybatisdemo.entity.OzOrgUserinfo;
import com.example.zero.mybatisdemo.mapper.OzOrgUserinfoMapper;
import com.example.zero.mybatisdemo.service.OzOrgUserinfoService;
import org.springframework.stereotype.Service;

/**
 * ProjectName: [mybatis-demo]
 * Package:     [com.example.zero.mybatisdemo.service.impl.OzOrgUserinfoServiceImpl]
 * Description: 用户信息service实现类
 * CreateDate:  2020/3/30 23:27
 *
 * @author 0.0.0
 * @version 1.0
 */
@Service
public class OzOrgUserinfoServiceImpl implements OzOrgUserinfoService {

    private final OzOrgUserinfoMapper ozOrgUserinfoMapper;

    @SuppressWarnings("all")
    public OzOrgUserinfoServiceImpl(OzOrgUserinfoMapper ozOrgUserinfoMapper) {
        this.ozOrgUserinfoMapper = ozOrgUserinfoMapper;
    }

    @Override
    public OzOrgUserinfo load(long id) {
        return this.ozOrgUserinfoMapper.load(id);
    }
}
