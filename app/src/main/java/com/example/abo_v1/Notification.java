package com.example.abo_v1;

import java.util.Date;

public class Notification {
    private String content;
    private Date time;

    public Notification() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
