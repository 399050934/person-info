package com.management.personinfo.controller;

import com.management.personinfo.entity.PersonInfo;

import com.management.personinfo.service.PersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 项目入口
 * @author makejava
 * @since 2020-04-05 13:09:49
 */
@RestController
@RequestMapping("/person")
@Slf4j
public class PersionController {
    @Autowired
    private PersionService persionService;

    @GetMapping("/getOneById")
    public ResponseEntity<PersonInfo> getOneById(@RequestParam(value = "Id") int id) {
        if (ObjectUtils.isEmpty(id)) {
            return new ResponseEntity(1, HttpStatus.BAD_REQUEST);
        }
        PersonInfo personInfo = persionService.getOneById(id);
        return new ResponseEntity<>(personInfo, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public  ResponseEntity<List<PersonInfo>> getAll() {
        List<PersonInfo> personInfos = persionService.findAll();
        return new ResponseEntity<>(personInfos, HttpStatus.OK);
    }

    @PostMapping(value = "/addPersion")
    public ResponseEntity<PersonInfo> addPersion(@RequestParam PersonInfo personInfo) {
        PersonInfo personInfo1 = persionService.addPersion(personInfo);
        if (ObjectUtils.isEmpty(personInfo1)) {
            return new ResponseEntity<>(personInfo1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(personInfo1, HttpStatus.OK);

    }
    @PostMapping(value = "/groupByLouming")
    public ResponseEntity<List<PersonInfo>> groupByLouming() {
        try {
            List<PersonInfo> lists =  persionService.groupByLouMing();
            return new ResponseEntity(lists, HttpStatus.OK);
        } catch (Exception e){
            log.error("Request error:", e);
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }
}
