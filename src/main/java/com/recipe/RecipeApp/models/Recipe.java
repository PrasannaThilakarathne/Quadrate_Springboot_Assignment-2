package com.recipe.RecipeApp.models;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    private String rid;
    private String title;
    private String description;

    @ManyToMany
    @JoinTable(name="user_recipe", joinColumns = @JoinColumn(name = "rid"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;

    public Recipe() {
    }

    public Recipe(String rid, String title, String description, Set<User> users) {
        this.rid = rid;
        this.title = title;
        this.description = description;
        this.users = users;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
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

    @Override
    public String toString() {
        return "Recipe{" +
                "rid='" + rid + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(rid, recipe.rid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid);
    }
}
