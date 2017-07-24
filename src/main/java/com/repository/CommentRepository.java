
package com.repository;

import com.entity.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */


public interface CommentRepository extends JpaRepository<Comment,Integer> {

    @Query("select c from Comment c order by c.created desc")
    List<Comment> comments(Pageable pageable);
}

