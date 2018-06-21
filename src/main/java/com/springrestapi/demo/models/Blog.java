package com.springrestapi.demo.models;

import javax.persistence.*;

@Entity
public class Blog implements Comparable<Blog>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="content")
    private String content;

    public Blog(){

    }

    public Blog(int id, String title, String content){

        this.id = id;
        this.title = title;
        this.content = content;

    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
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

