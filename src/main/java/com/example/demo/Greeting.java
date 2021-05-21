package com.example.demo;
// a demo program
public class Greeting {
    private String content;
    private Long id;

    public Greeting(String content, Long id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
