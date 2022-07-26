package com.xx.ssm.dao;



import com.xx.ssm.pojo.Girl;

import java.util.List;

public interface GirlDao {

    List<Girl> findAll();

    Girl findById(int id);

    List<Girl> findByGirlQuery(Girl girl);

    int save(Girl girl);

    int update(Girl girl);

    int delete(int id);
}
