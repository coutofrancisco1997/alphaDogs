package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/packages")
public class PackageController {

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public String showAllPackages(Model model) {

        return "allPackages";
    }
}
