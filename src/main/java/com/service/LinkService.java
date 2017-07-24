package com.service;

import com.entity.Link;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface LinkService {

    /**添加编辑友链*/
    public boolean saveLink(Link link);

    /**删除友链*/
    public boolean deleteLinkByID(Integer link_id);
}
