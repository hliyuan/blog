package com.service.ServiceImpl;

import com.entity.Link;
import com.repository.LinkRepository;
import com.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/7/24.
 */
public class LinkServiceImpl implements LinkService {

    @Autowired
    LinkRepository linkRepository;

    @Override
    public boolean saveLink(Link link) {
        if (link == null)
            return false;
        else{
            linkRepository.saveAndFlush(link);
            return true;
        }
    }

    @Override
    public boolean deleteLinkByID(Integer link_id) {
        if (link_id == null)
            return false;
        else{
            linkRepository.delete(link_id);
            return true;
        }
    }
}
