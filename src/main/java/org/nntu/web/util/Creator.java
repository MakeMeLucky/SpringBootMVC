package org.nntu.web.util;

import org.nntu.web.resource.Album;
import org.nntu.web.resource.Genre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Creator {

    public List<Genre> getDefaultGenreList() {
        List<Genre> genreList = new ArrayList<>();
        genreList.add(createGenre("Rock","Album1", "Album2"));
        genreList.add(createGenre("Jazz","Album1", "Album2"));
        genreList.add(createGenre("Country","Album1", "Album2", "Album3"));
        genreList.add(createGenre("Pop","Album1", "Album2", "Album3", "Album4"));
        genreList.add(createGenre("Disco","Album1", "Album2", "Album3", "Album4"));
        return genreList;
    }

    private Genre createGenre(String name, String... albums) {
        Genre genre = new Genre();
        genre.setName(name);
        genre.setAlbums(Stream.of(albums).map(Album::new).collect(Collectors.toList()));
        return genre;
    }

    public List<Album> getDefaultAlbums() {
        List<Album> albums = new LinkedList<>();
        albums.add(new Album("Album1", "Description1"));
        albums.add(new Album("Album2", "Description2"));
        albums.add(new Album("Album3", "Description3"));
        albums.add(new Album("Album4", "Description4"));
        albums.add(new Album("Album5", "Description5"));
        return albums;
    }
}