package com.lrm.service;

import com.lrm.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagService {

    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}
