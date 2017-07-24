package com.repository;

import com.entity.Content;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

public interface ContentRepository extends JpaRepository<Content,Integer> {

    @Query("select c from Content c order by c.created desc")
    List<Content> contents(Pageable pageable);
}

