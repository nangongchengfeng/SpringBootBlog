package com.lrm.dao;

import com.lrm.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
/**
 * Created by limi on 2017/10/16.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);


    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
