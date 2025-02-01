package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name="topic")
public class Topic{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="table")
    private String tableOfContents;


    @Lob
    @Column(name="content")
    private String content;




    public Topic(String tableOfContents, String content) {
        this.tableOfContents = tableOfContents;
        this.content = content;
    }


    public Topic() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(String tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}