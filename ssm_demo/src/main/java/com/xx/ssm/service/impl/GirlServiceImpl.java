package com.xx.ssm.service.impl;


import com.xx.ssm.dao.GirlDao;
import com.xx.ssm.pojo.Girl;
import com.xx.ssm.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlDao girlDao;

    @Override
    public List<Girl> findAll() {
        return girlDao.findAll();
    }

    @Override
    public Girl findById(int id) {
        return girlDao.findById(id);
    }

    @Override
    public List<Girl> findByGirlQuery(Girl girl) {
        return girlDao.findByGirlQuery(girl);
    }

    @Override
    public boolean save(Girl girl) {
        return girlDao.save(girl) > 0;
    }

    @Override
    public boolean update(Girl girl) {
        return girlDao.update(girl) > 0;
    }

    @Override
    public boolean delete(int id) {
        return girlDao.delete(id) > 0;
    }
}
