package com.repository;


import com.entity.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

import org.springframework.data.jpa.repository.Query;

public interface TagRepository extends JpaRepository<Tag,Integer> {

    @Query("select t from Tag t ")
    List<Tag> tags(Pageable pageable);
}

