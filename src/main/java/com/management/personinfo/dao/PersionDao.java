package com.management.personinfo.dao;

import com.management.personinfo.entity.Persion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersionDao  extends JpaRepository<Persion, Integer> {
    Persion getOne(String id);
}
