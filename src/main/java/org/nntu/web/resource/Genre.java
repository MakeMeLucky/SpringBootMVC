package org.nntu.web.resource;

import java.io.Serializable;
import java.util.List;

public class Genre implements Serializable {

    public Genre() {
    }

    public Genre(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    private String name;
    private List<Album> albums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Genre {" +
                "name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }
}
