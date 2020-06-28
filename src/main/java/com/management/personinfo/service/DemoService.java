package com.management.personinfo.service;

import com.management.personinfo.entity.Demo;
import org.apache.catalina.User;

/**
 * (Demo)表服务接口
 *
 * @author makejava
 * @since 2020-04-05 13:09:45
 */
public interface DemoService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Demo queryById( int id);

    boolean addUser(User user);


}