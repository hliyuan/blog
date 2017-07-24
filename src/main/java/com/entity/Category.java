package com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer category_id;

    @Column(name="category_name")
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "category")
    private List<Tag> tags;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "category")
    private List<Content> contents;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", tags=" + tags +
                ", contents=" + contents +
                '}';
    }
}

