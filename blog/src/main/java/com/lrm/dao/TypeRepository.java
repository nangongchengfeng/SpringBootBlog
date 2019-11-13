package com.lrm.dao;

import com.lrm.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by limi on 2017/10/16.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}
