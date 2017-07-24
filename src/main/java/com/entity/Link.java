package com.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by liyuan on 2017/7/20.
 */
@Entity
public class Link implements Serializable {

    private static final Long LINK_SERIALIZABLE = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer link_id;

    @Column(name = "link_name")
    private String link_name;

    @Column(name = "link_value")
    private String link_value;

    public Integer getLink_id() {
        return link_id;
    }

    public void setLink_id(Integer link_id) {
        this.link_id = link_id;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_value() {
        return link_value;
    }

    public void setLink_value(String link_value) {
        this.link_value = link_value;
    }

    @Override
    public String toString() {
        return "Link{" +
                "link_id=" + link_id +
                ", link_name='" + link_name + '\'' +
                ", link_value='" + link_value + '\'' +
                '}';
    }
}
