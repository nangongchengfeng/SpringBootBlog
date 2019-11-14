package com.lrm.dao;

import com.lrm.po.Tag;
import com.lrm.po.Type;
<<<<<<< HEAD
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36

/**
 * Created by limi on 2017/10/16.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
<<<<<<< HEAD

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
}
