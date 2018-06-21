package com.springrestapi.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog implements Comparable<Blog> {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    public Blog() {

    }

    public Blog(String title, String content) {


        this.title = title;
        this.content = content;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public int compareTo(Blog o) {
        return 0;
    }
}

