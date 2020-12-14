package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.services.AuthService;
import org.academiadecodigo.hackaton.services.EntertainmentService;
import org.academiadecodigo.hackaton.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/packages")
public class PackageController {

    private AuthService authService;
    private PackageService packageService;
    private EntertainmentService entertainmentService;

    @Autowired
    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    @Autowired
    public void setEntertainmentService(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public String showAllPackages(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "allPackages";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/create")
    public String createPackages(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "ownPack";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/build/done")
    public String buildPackages(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "buildDone";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/eco")
    public String showEcoPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "EcoDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bankrupt")
    public String showBankruptPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "BankruptDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/budget")
    public String showOnABudgetPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "BudgetDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/lisbon")
    public String showLisbonPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "LisbonExperienceDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/covid")
    public String showCovidPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "CovidDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/drugs")
    public String showDrugsPackage(Model model) {
        model.addAttribute(authService.getAccessingUser());
        return "DrugDate";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/add")
    public String addEntertainment(Model model){
        model.addAttribute(authService.getAccessingUser());
        return "";
    }

}
