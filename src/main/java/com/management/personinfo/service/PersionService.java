package com.management.personinfo.service;

import com.management.personinfo.entity.Persion;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Persionservice
 */
@Service(value = "persionService")
public interface PersionService {

    /**
     * 根据Id单条查询
     * @param id
     * @return
     */
     Persion getOneById(String id);

    /**
     * 批量全部
     * @return
     */
     List<Persion>  findAll();

    /**
     * 添加
     * @return
     */
    Persion addPersion(Persion persion);
}
