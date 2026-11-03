package com.skilllab.portfolio.model;

public class Skill {
    private String name;
    private  String category;

    public Skill(String name,String catrgory){
        this.name=name;
        this.category=catrgory;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
}
