package com.management.personinfo.service.impl;

import com.management.personinfo.dao.PersionDao;
import com.management.personinfo.entity.PersonInfo;
import com.management.personinfo.service.PersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersionServiceImpl  implements PersionService {
    @Autowired
    private PersionDao persionDao;
    @Override
    public PersonInfo getOneById(int id) {
        return persionDao.getOne(id);
    }

    @Override
    public List<PersonInfo> findAll() {
        return persionDao.findAll();
    }

    @Override
    public PersonInfo addPersion(PersonInfo personInfo) {
        try {
            PersonInfo personInfo1 = persionDao.saveAndFlush(personInfo);
            return personInfo1;
        } catch (Exception e) {
            log.error("Add PersonInfo Failed:", e);
            return null;
        }
    }

    @Override
    public List<PersonInfo> groupByLouMing() {
        List<PersonInfo> list = persionDao.groupByLouMing();
        return list;
    }
}
