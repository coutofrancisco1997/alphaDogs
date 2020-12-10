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

    @RequestMapping(method = RequestMethod.GET, path = "/create")
    public String createPackages(Model model) {
        return "ownPack";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/eco")
    public String showEcoPackage(Model model) {
        return "EcoDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bankrupt")
    public String showBankruptPackage(Model model) {
        return "BankruptDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/budget")
    public String showOnABudgetPackage(Model model) {
        return "BudgetDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/lisbon")
    public String showLisbonPackage(Model model) {
        return "LisbonExperienceDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/covid")
    public String showCovidPackage(Model model) {
        return "CovidDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/drugs")
    public String showDrugsPackage(Model model) {
        return "DrugDate";
    }
}
