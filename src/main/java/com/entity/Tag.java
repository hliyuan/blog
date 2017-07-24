package com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "tag")
public class Tag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tag_id;

    @Column(name = "tag_name")
    private String tag_name;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private Content content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Integer getTag_id() {
        return tag_id;
    }

    public void setTag_id(Integer tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag_id=" + tag_id +
                ", tag_name='" + tag_name + '\'' +
                ", content=" + content +
                ", category=" + category +
                '}';
    }
}
