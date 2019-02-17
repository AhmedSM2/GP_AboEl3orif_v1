package com.example.abo_v1;

import java.util.Date;

public class Comments extends Replies {
    private String Content;
    private Date time;

    public Comments() {
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void addComment(){}
    public void editComment(){}
    public void deleteComment(){}
}
