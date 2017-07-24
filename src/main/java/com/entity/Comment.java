package com.entity;

import javax.persistence.GeneratedValue;
import java.io.Serializable;
import javax.persistence.*;



/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer comment_id;

    @Column(name = "commiter")
    private String commiter;

    @Column(name ="comment")
    private String comment;

    @Column(name = "created")
    private String created;

    @Column(name = "ip")
    private String ip;

    @Column(name = "mail")
    private String  mail;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private Content content;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getCommiter() {
        return commiter;
    }

    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", commiter='" + commiter + '\'' +
                ", comment='" + comment + '\'' +
                ", created='" + created + '\'' +
                ", ip='" + ip + '\'' +
                ", mail='" + mail + '\'' +
                ", content=" + content +
                '}';
    }
}

