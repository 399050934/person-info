package com.management.personinfo.service.impl;

import com.management.personinfo.dao.PersonDao;
import com.management.personinfo.entity.PersonInfo;
import com.management.personinfo.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;
    @Override
    public PersonInfo getOneById(int id) {
        return personDao.getOne(id);
    }

    @Override
    public List<PersonInfo> findAll() {
        return personDao.findAll();
    }

    @Override
    public PersonInfo addPerson(PersonInfo personInfo) {
        try {
            PersonInfo personInfo1 = personDao.saveAndFlush(personInfo);
            return personInfo1;
        } catch (Exception e) {
            log.error("Add PersonInfo Failed:", e);
            return null;
        }
    }

    @Override
    public List<PersonInfo> groupByLouMing() {
        List<PersonInfo> list = personDao.groupByLouMing();
        return list;
    }
}
