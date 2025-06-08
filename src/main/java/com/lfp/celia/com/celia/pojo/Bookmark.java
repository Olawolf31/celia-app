package com.lfp.celia.com.celia.pojo;

import java.util.UUID;

public class Bookmark {
    
    private String title;
    private String url;
    private String description;
    private String tag;
    private String id;

    public Bookmark(){
        this.id = UUID.randomUUID().toString();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
