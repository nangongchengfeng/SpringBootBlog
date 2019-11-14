package com.lrm.service;

import com.lrm.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
/**
 * Created by limi on 2017/10/16.
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

<<<<<<< HEAD
    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id, Type type);
=======
    Type updateType(Long id,Type type);
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36

    void deleteType(Long id);
}
