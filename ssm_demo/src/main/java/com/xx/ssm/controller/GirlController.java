package com.xx.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xx.ssm.pojo.Girl;
import com.xx.ssm.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("girl")
public class GirlController {

    @Autowired
    private GirlService girlService;

    @GetMapping
    public List<Girl> findAll() {
        return girlService.findAll();
    }

    @GetMapping("page")
    public PageInfo<Girl> page(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageHum,
                               @RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize,
                               Girl girl) {
        PageHelper.startPage(pageHum, pageSize);
        List<Girl> ret = girlService.findByGirlQuery(girl);
        PageInfo<Girl> pageInfo = new PageInfo<>(ret);
        return pageInfo;
    }

    @GetMapping("{id}")
    public Girl findById(@PathVariable int id) {
        return girlService.findById(id);
    }

    @GetMapping("query")
    public List<Girl> findByGirlQuery(@RequestBody Girl girl) {
        return girlService.findByGirlQuery(girl);
    }

    @PostMapping("save")
    public boolean save(@RequestBody Girl girl) {
        return girlService.save(girl);
    }

    @PostMapping("update")
    public boolean update(@RequestBody Girl girl) {
        return girlService.update(girl);
    }

    @PostMapping("{id}")
    public boolean delete(@PathVariable int id) {
        return girlService.delete(id);
    }
}
