package com.service.ServiceImpl;

import com.entity.Comment;
import com.repository.CommentRepository;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/7/24.
 */
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

    @Override
    public boolean insertComment(Comment comment) {
        if (comment!=null){
            commentRepository.saveAndFlush(comment);
            return true;
        }else return false;
    }

    @Override
    public boolean deleteComment(Integer comment_id) {
        if (comment_id==null)
            return false;
        else {
            commentRepository.delete(comment_id);
            return true;
        }
    }

    @Override
    public Comment getComment(Integer comment_id) {
        if (comment_id==null)
            return null;
        else
            return commentRepository.getOne(comment_id);
    }
}
