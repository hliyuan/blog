package com.entity;




import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "backlog")
public class BackLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer log_id;

    @Column(name = "action")
    private String action;

    @Column(name = "log_created")
    private String log_created;

    @Column(name = "log_ip")
    private String log_ip;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLog_created() {
        return log_created;
    }

    public void setLog_created(String log_created) {
        this.log_created = log_created;
    }

    public String getLog_ip() {
        return log_ip;
    }

    public void setLog_ip(String log_ip) {
        this.log_ip = log_ip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BackLog{" +
                "log_id=" + log_id +
                ", action='" + action + '\'' +
                ", log_created='" + log_created + '\'' +
                ", log_ip='" + log_ip + '\'' +
                ", user=" + user +
                '}';
    }
}

