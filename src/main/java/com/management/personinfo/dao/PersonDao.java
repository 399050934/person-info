package com.management.personinfo.dao;

import com.management.personinfo.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<PersonInfo, Integer> {
    @Query(value = "select * from personinfo group by louming", nativeQuery = true)
    List<PersonInfo> groupByLouMing();
}
