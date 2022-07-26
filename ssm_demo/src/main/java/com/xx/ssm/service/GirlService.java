package com.xx.ssm.service;


import com.xx.ssm.pojo.Girl;

import java.util.List;

public interface GirlService {

    List<Girl> findAll();

    Girl findById(int id);

    List<Girl> findByGirlQuery(Girl girl);

    boolean save(Girl girl);

    boolean update(Girl girl);

    boolean delete(int id);
}
