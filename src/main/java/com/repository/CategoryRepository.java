package com.repository;

import com.entity.Category;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query("select c from Category c")
    List<Category> categoried(Pageable pageable);
}

