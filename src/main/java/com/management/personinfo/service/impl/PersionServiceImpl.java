package com.management.personinfo.service.impl;

import com.management.personinfo.dao.PersionDao;
import com.management.personinfo.entity.Persion;
import com.management.personinfo.service.PersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class PersionServiceImpl  implements PersionService {
    @Autowired
    private PersionDao persionDao;
    @Override
    public Persion getOneById(String id) {
        return persionDao.getOne(id);
    }

    @Override
    public List<Persion> findAll() {
        return persionDao.findAll();
    }
}
