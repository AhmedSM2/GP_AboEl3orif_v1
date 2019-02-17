package com.example.abo_v1;

import java.util.Date;

public class Answer extends Replies {
    private String content;
    private Date time;

    public Answer() {
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

    public void addAnswer(){}
    public void editAnswer(){}
    public void deleteAnswer(){}
}
