package com.management.personinfo.service.impl;

import com.management.personinfo.entity.Demo;
import com.management.personinfo.dao.DemoDao;
import com.management.personinfo.service.DemoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Demo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-05 13:09:48
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    @Override
    public Demo queryById( int id) {
        return this.demoDao.getOne(id);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }


}