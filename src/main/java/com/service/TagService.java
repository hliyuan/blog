package com.service;

import com.entity.Tag;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface TagService {

    /**添加标签*/
    public boolean saveTag(Tag tag);

    /**删除标签*/
    public boolean deleteTagByID(Integer tag_id);
}
