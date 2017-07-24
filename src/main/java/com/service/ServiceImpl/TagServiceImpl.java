package com.service.ServiceImpl;

import com.entity.Tag;
import com.repository.TagRepository;
import com.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/7/24.
 */
public class TagServiceImpl implements TagService {

    @Autowired
    TagRepository tagRepository;

    @Override
    public boolean saveTag(Tag tag) {
        if (tag == null)
            return false;
        else {
            tagRepository.saveAndFlush(tag);
            return true;
        }
    }

    @Override
    public boolean deleteTagByID(Integer tag_id) {
        if (tag_id == null)
            return false;
        else{
            tagRepository.delete(tag_id);
            return true;
        }
    }
}
