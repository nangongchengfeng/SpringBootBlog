package com.lrm.service;

import com.lrm.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
/**
 * Created by limi on 2017/10/16.
 */
public interface TagService {

    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

<<<<<<< HEAD
    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

=======
>>>>>>> 0f5a6ff24b56c741c9adf0a03207d5eb43edcb36
    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}
