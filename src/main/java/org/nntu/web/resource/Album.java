package org.nntu.web.resource;

import java.io.Serializable;

public class Album implements Serializable {

    public Album() {
    }

    public Album(String name) {
        this.name = name;
    }

    public Album(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
