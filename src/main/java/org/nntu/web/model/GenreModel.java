package org.nntu.web.model;

import org.nntu.web.resource.Genre;

import java.util.List;

public class GenreModel {

    private Integer count;

    private List<Genre> genreList;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    @Override
    public String toString() {
        return "GenreModel {" +
                "count=" + count +
                ", genreList=" + genreList +
                '}';
    }
}
