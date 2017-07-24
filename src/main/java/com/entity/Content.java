package com.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "content")
public class Content implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "content_id")
    private Integer content_id;

    @Column(name="title",length=50)
    private String title;

    @Column(name = "slug")
    private String slug;

    @Column(name = "created")
    private String created;

    @Column(name = "modified")
    private String modified;

    @Column(name = "authorId")
    private int authorId;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "hits")
    private Integer hits;

    @Column(name = "commentNums")
    private Integer commentsNums;

    @Column(name = "allowComment")
    private boolean allowComment;

    @Column(name = "content")
    private String content;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "content")
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "content")
    private List<Tag> tags;


    public Integer getId() {
        return content_id;
    }

    public void setId(Integer content_id) {
        this.content_id = content_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getCommentsNums() {
        return commentsNums;
    }

    public void setCommentsNums(Integer commentsNums) {
        this.commentsNums = commentsNums;
    }

    public boolean isAllowComment() {
        return allowComment;
    }

    public void setAllowComment(boolean allowComment) {
        this.allowComment = allowComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Integer getContent_id() {
        return content_id;
    }

    public void setContent_id(Integer content_id) {
        this.content_id = content_id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Content{" +
                "content_id=" + content_id +
                ", title='" + title + '\'' +
                ", slug='" + slug + '\'' +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                ", authorId=" + authorId +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", hits=" + hits +
                ", commentsNums=" + commentsNums +
                ", allowComment=" + allowComment +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                ", category=" + category +
                ", user=" + user +
                ", tags=" + tags +
                '}';
    }
}
