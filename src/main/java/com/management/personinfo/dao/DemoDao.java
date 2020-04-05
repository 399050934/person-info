package com.management.personinfo.dao;

import com.management.personinfo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * (Demo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-05 13:09:45
 */
@Repository
public interface DemoDao extends JpaRepository<Demo, Integer> {



}