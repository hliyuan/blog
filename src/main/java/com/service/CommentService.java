package com.service;

import com.entity.Comment;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface CommentService {

    /**添加或者编辑评论*/
    public boolean insertComment(Comment comment);

    /**根据Id删除评论*/
    public boolean deleteComment(Integer comment_id);

    /**根据id获取评论*/
    public Comment getComment(Integer comment_id);
}
