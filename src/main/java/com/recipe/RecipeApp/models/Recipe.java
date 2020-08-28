package com.recipe.RecipeApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Recipe {
    @Id
    private String rid;
    private String title;
    private String description;

    @ManyToOne
    private User user;

    public Recipe() {
    }

    public Recipe(String rid, String title, String description) {
        this.rid = rid;
        this.title = title;
        this.description = description;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
