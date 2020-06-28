package com.management.personinfo.controller;

import com.management.personinfo.entity.Demo;
import com.management.personinfo.service.DemoService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;


/**
 * (Demo)表控制层
 *
 * @author makejava
 * @since 2020-04-05 13:09:49
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * 服务对象
     */
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Demo selectOne(@RequestParam Integer id) {
        return this.demoService.queryById(id);
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("addUser")
    public boolean addUser(User user) {
        return this.demoService.addUser(user);
    }

}