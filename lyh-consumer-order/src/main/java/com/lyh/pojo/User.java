package com.lyh.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2020/10/1.
 */
public class User implements Serializable{
    private Long id;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
