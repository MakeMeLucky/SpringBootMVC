package org.nntu.web.controller;

import org.nntu.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StoreController {

    @Autowired
    StoreService storeService;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/store/genres")
    public String getGenres(Model model) {
        model.addAttribute("genres", storeService.getGenreModel());
        return "genres";
    }

    @GetMapping("/store")
    public String getGenres(Model model,
                            @RequestParam String genre) {
        model.addAttribute("genre", storeService.getGenre(genre));
        return "genre";
    }

    @GetMapping("/store/details/{name}")
    public String details(Model model,
            @PathVariable String name) {
        model.addAttribute("album", storeService.getAlbum(name));
        return "album";
    }
}
