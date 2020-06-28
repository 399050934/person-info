package com.management.personinfo.controller;

import com.management.personinfo.entity.Persion;
import com.management.personinfo.service.PersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.HttpResource;

import javax.xml.ws.Response;
import java.util.List;

/**
 * 项目入口
 * @author makejava
 * @since 2020-04-05 13:09:49
 */
@RestController
@RequestMapping("/persion")
public class PersionController {
    @Autowired
    private PersionService persionService;

    @GetMapping("/getOneById")
    public ResponseEntity<Persion> getOneById(@PathVariable(value = "Id") String id) {
        if (ObjectUtils.isEmpty(id)) {
            return new ResponseEntity(1, HttpStatus.BAD_REQUEST);
        }
        Persion persion = persionService.getOneById(id);
        return new ResponseEntity<>(persion, HttpStatus.OK);
    }

    @GetMapping("getAll")
    public  ResponseEntity<List<Persion>> getAll() {
        List<Persion> persions = persionService.findAll();
        return new ResponseEntity<>(persions, HttpStatus.OK);
    }
}
