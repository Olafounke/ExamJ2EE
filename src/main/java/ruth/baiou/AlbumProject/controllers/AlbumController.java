package ruth.baiou.AlbumProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ruth.baiou.AlbumProject.entities.Album;
import ruth.baiou.AlbumProject.services.AlbumService;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public String listAlbums(Model model) {
        model.addAttribute("albums", albumService.findAll());
        return "albums/list"; // Page HTML à créer
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("album", new Album());
        return "albums/create"; // Page HTML à créer
    }

    @PostMapping("/save")
    public String saveAlbum(@ModelAttribute("album") Album album) {
        albumService.save(album);
        return "redirect:/albums";
    }
}
