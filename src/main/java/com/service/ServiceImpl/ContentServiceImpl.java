package com.service.ServiceImpl;

import com.entity.Content;
import com.repository.ContentRepository;
import com.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by lenovo on 2017/7/24.
 */
public class ContentServiceImpl implements ContentService {

    @Autowired
    ContentRepository contentRepository;



    @Override
    public boolean saveContent(Content content) {
        if (content==null)
            return false;
        else {
            contentRepository.saveAndFlush(content);
            return true;
        }
    }

    @Override
    public boolean deleteContent(Integer content_id) {
        if (content_id==null)
            return false;
        else {
            contentRepository.delete(content_id);
            return false;
        }

    }

    @Override
    public Content getContentByID(Integer content_id) {
        if (content_id==null)
            return null;
        else
            return contentRepository.getOne(content_id);
    }
}
