package com.service;

import com.entity.Category;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface CategoryService {

    /**添加|编辑分类*/
    public boolean saveCategory(Category category);

    /**删除分类*/
    public boolean deleteCategory(Integer category_id);
}
