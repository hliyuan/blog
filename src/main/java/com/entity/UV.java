package com.entity;




import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by liyuan on 2017/7/20.
 */
@Entity
public class UV implements Serializable{

    private static final Long UV_SERIALIZABLE = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uv_id;

    @Column(name = "uv_created")
    private String uv_created;

    @Column(name = "uv_ip")
    private String uv_ip;

    @Column(name = "uv_url")
    private String uv_url;

    @Column(name = "user_agent")
    private String user_agent;

    public Integer getUv_id() {
        return uv_id;
    }

    public void setUv_id(Integer uv_id) {
        this.uv_id = uv_id;
    }

    public String getNv_created() {
        return uv_created;
    }

    public void setNv_created(String nv_created) {
        this.uv_created = nv_created;
    }

    public String getUv_ip() {
        return uv_ip;
    }

    public void setUv_ip(String uv_ip) {
        this.uv_ip = uv_ip;
    }

    public String getUv_url() {
        return uv_url;
    }

    public void setUv_url(String uv_url) {
        this.uv_url = uv_url;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    @Override
    public String toString() {
        return "UV{" +
                "uv_id=" + uv_id +
                ", nv_created='" + uv_created + '\'' +
                ", uv_ip='" + uv_ip + '\'' +
                ", uv_url='" + uv_url + '\'' +
                ", user_agent='" + user_agent + '\'' +
                '}';
    }
}
