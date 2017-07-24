package com.service.ServiceImpl;

import com.entity.Category;
import com.repository.CategoryRepository;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/7/24.
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public boolean saveCategory(Category category) {
        if (category == null)
            return false;
        else{
            categoryRepository.saveAndFlush(category);
            return true;
        }
    }

    @Override
    public boolean deleteCategory(Integer category_id) {
        if (category_id == null)
            return false;
        else{
            categoryRepository.delete(category_id);
            return true;
        }
    }
}
