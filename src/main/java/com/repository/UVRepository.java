package com.repository;

import com.entity.UV;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

public interface UVRepository extends JpaRepository<UV,Integer> {

    @Query("select uv from UV uv order by uv.uv_created desc")
    List<UV> uvs(Pageable pageable);

    @Query("select uv from UV uv order by uv.uv_created asc")
    List<UV> uvsAsc(Pageable pageable);
}

