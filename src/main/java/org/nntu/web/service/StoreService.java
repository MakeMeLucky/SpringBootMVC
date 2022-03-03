package org.nntu.web.service;

import org.nntu.web.model.GenreModel;
import org.nntu.web.resource.Album;
import org.nntu.web.resource.Genre;
import org.nntu.web.util.Creator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoreService {

    private final List<Genre> genres;
    private final List<Album> albums;

    @Autowired
    public StoreService(Creator creator) {
        this.genres = creator.getDefaultGenreList();
        this.albums = creator.getDefaultAlbums();
    }


    public GenreModel getGenreModel() {
        GenreModel model = new GenreModel();
        model.setGenreList(genres);
        model.setCount(genres.size());
        return model;
    }

    public Genre getGenre(String name) {
        return genres.stream().filter(genre->genre.getName().equals(name)).findFirst().orElse(null);
    }

    public Album getAlbum(String name) {
        return albums.stream().filter(album->album.getName().equals(name)).findFirst().orElse(null);
    }

}
