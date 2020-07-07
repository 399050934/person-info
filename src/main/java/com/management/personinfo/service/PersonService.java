package com.management.personinfo.service;

import com.management.personinfo.entity.PersonInfo;

import java.util.List;

/**
 * Persionservice
 */

public interface PersonService {

    /**
     * 根据Id单条查询
     * @param id
     * @return
     */
     PersonInfo getOneById(int id);

    /**
     * 批量全部
     * @return
     */
     List<PersonInfo>  findAll();

    /**
     * 添加
     * @return
     */
    PersonInfo addPerson(PersonInfo personInfo);

    /**
     * 根据楼名分组，即根据小区划分
     */
    List<PersonInfo> groupByLouMing();
}
