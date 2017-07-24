package com.repository;

import com.entity.Link;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

public interface LinkRepository extends JpaRepository<Link,Integer>{

    @Query("select l from Link l")
    List<Link> links(Pageable pageable);
}

