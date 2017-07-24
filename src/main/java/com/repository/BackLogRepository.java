package com.repository;


import com.entity.BackLog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

/**
 * Created by liyuan on 2017/7/20.
 */

public interface BackLogRepository extends JpaRepository<BackLog,Integer> {

    @Query("select bl from BackLog bl order by bl.log_created desc ")
    List<BackLog> RecentBackLog(Pageable pageable);
}

