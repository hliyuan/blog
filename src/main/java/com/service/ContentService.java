package com.service;

import com.entity.Content;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface ContentService {

    /**添加/编辑文章*/
    public boolean saveContent(Content content);

    /**删除文章*/
    public boolean deleteContent(Integer content_id);

    /**通过id,获取文章对象*/
    public Content getContentByID(Integer content_id);





}
