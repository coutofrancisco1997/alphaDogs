package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.services.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/entertainment")
public class EntertainmentController {

    private EntertainmentService entertainmentService;

    @Autowired
    public void setEntertainmentService(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listBusinessByType(@PathVariable String entertainmentType, Model model) {
        model.addAttribute("entertainments", entertainmentService.listByType(entertainmentType));
        return "entertainments/list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showEntertainment(@PathVariable Integer id, Model model) {
        Entertainment entertainment = entertainmentService.get(id);

        model.addAttribute("entertainment", entertainment);
        return "entertainment/show";
    }
}
