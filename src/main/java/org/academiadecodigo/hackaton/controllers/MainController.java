package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.Pact;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.persistence.model.entertainment.*;
import org.academiadecodigo.hackaton.services.EntertainmentService;
import org.academiadecodigo.hackaton.services.PackageService;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private UserService userService;
    private EntertainmentService entertainmentService;
    private PackageService packageService;
    private boolean dataInitialized = false;

    @Autowired
    public void setEntertainmentService(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    @RequestMapping
    public String home() {
        initializeData();
        return "redirect:/home/home";
    }

    private void initializeData(){

        if(dataInitialized){
            return;
        }
        dataInitialized=true;

        User user = new User();
        user.setName("Batata");
        user.setEmail("mail@gmail.com");
        user.setPhone("5345345363");
        user.setPassword("123");
        userService.add(user);

        User user1 = new User();
        user1.setName("Alho");
        user1.setEmail("mail@gmail.com");
        user1.setPhone("5345345363");
        user1.setPassword("456");
        userService.add(user1);

        Entertainment loco = new Restaurant();
        loco.setName("Loco");
        loco.setAvgPrice(160);
        loco.setEmail("loco@loco.pt");
        loco.setPhone("213951861");
        loco.setWorkingHours("19h - 23h");
        loco.setClosed("Sunday - Monday");
        entertainmentService.add(loco);

        Entertainment pastel = new Restaurant();
        pastel.setName("Casa Portuguesa Pastel Bacalhau");
        pastel.setAvgPrice(15);
        pastel.setEmail("geral@pasteisdebacalhau.com");
        pastel.setPhone("916486888");
        pastel.setWorkingHours("10h - 22h");
        pastel.setClosed("Always Open");
        entertainmentService.add(pastel);

        Entertainment maneiras = new Restaurant();
        maneiras.setName("100 Maneiras");
        maneiras.setAvgPrice(60);
        maneiras.setEmail("info@100maneiras.com");
        maneiras.setPhone("910918181");
        maneiras.setWorkingHours("19h - 22h30");
        maneiras.setClosed("Always Open");
        entertainmentService.add(maneiras);

        Entertainment mini = new Restaurant();
        mini.setName("Mini Bar");
        mini.setAvgPrice(60);
        mini.setEmail("minibar@gmail.com");
        mini.setPhone("211305393");
        mini.setWorkingHours("18h45 - 22h30");
        mini.setClosed("Always Open");
        entertainmentService.add(mini);

        Entertainment restaurant4 = new Restaurant();
        restaurant4.setName("Kanazawa");
        restaurant4.setAvgPrice(50);
        restaurant4.setEmail("reservas@kanazawa.com.pt");
        restaurant4.setPhone("213010292");
        restaurant4.setWorkingHours("19h - 23h");
        restaurant4.setClosed("Sunday");
        entertainmentService.add(restaurant4);

        Entertainment restaurant5 = new Restaurant();
        restaurant5.setName("Gambrinus");
        restaurant5.setAvgPrice(55);
        restaurant5.setEmail("reservas@gambrinus.pt");
        restaurant5.setPhone("213421466");
        restaurant5.setWorkingHours("12h - 22h30");
        restaurant5.setClosed("Saturday - Sunday");
        entertainmentService.add(restaurant5);

        Entertainment tibatanos = new Restaurant();
        tibatanos.setName("Os Tibetanos");
        tibatanos.setAvgPrice(15);
        tibatanos.setEmail("@mail.com");
        tibatanos.setPhone("952345fdsdsf");
        tibatanos.setWorkingHours("10:00 - 22:00");
        tibatanos.setClosed("Sunday");
        entertainmentService.add(tibatanos);

        Entertainment restaurant7 = new Restaurant();
        restaurant7.setName("Belcanto");
        restaurant7.setAvgPrice(150);
        restaurant7.setEmail("info@belcanto.com");
        restaurant7.setPhone("213420607");
        restaurant7.setWorkingHours("12h30 - 15h, 18h45 - 22h30");
        restaurant7.setClosed("Sunday - Monday");
        entertainmentService.add(restaurant7);

        Entertainment fifty = new Restaurant();
        fifty.setName("50 Seconds");
        fifty.setAvgPrice(90);
        fifty.setEmail("50seconds@myriadhotels.com");
        fifty.setPhone("211525380");
        fifty.setWorkingHours("12h - 15h, 19h - 23h");
        fifty.setClosed("Sunday - Monday");
        entertainmentService.add(fifty);

        Entertainment restaurant9 = new Restaurant();
        restaurant9.setName("SUD Lisboa");
        restaurant9.setAvgPrice(50);
        restaurant9.setEmail("sudlisboa@sanahotels.com");
        restaurant9.setPhone("211592700");
        restaurant9.setWorkingHours("12h - 22h");
        restaurant9.setClosed("Always Open");
        entertainmentService.add(restaurant9);

        Entertainment restaurant10 = new Restaurant();
        restaurant10.setName("Faz Figura");
        restaurant10.setAvgPrice(40);
        restaurant10.setEmail("reservas@fazfigura.com");
        restaurant10.setPhone("218868981");
        restaurant10.setWorkingHours("12h30 - 15h, 19h - 23h");
        restaurant10.setClosed("Monday");
        entertainmentService.add(restaurant10);

        Entertainment restaurant11 = new Restaurant();
        restaurant11.setName("JNCquoi");
        restaurant11.setAvgPrice(45);
        restaurant11.setEmail("jncquoi@amorimluxury.com");
        restaurant11.setPhone("219369900");
        restaurant11.setWorkingHours("12h - 22h30");
        restaurant11.setClosed("Saturday - Sunday");
        entertainmentService.add(restaurant11);

        Entertainment restaurant12 = new Restaurant();
        restaurant12.setName("Faia");
        restaurant12.setAvgPrice(75);
        restaurant12.setEmail("faia@faia.pt");
        restaurant12.setPhone("213426742");
        restaurant12.setWorkingHours("20h - 02h");
        restaurant12.setClosed("Sunday");
        entertainmentService.add(restaurant12);

        Entertainment vinho = new Restaurant();
        vinho.setName("Sr. Vinho");
        vinho.setAvgPrice(60);
        vinho.setEmail("reservas@srvinho.com.pt");
        vinho.setPhone("213972681");
        vinho.setWorkingHours("20h - 02h");
        vinho.setClosed("Sunday");
        entertainmentService.add(vinho);

        Entertainment restaurant14 = new Restaurant();
        restaurant14.setName("Loja das Conservas");
        restaurant14.setAvgPrice(15);
        restaurant14.setEmail("geral@lojadasconservas.com");
        restaurant14.setPhone("911181210");
        restaurant14.setWorkingHours("10h - 20h");
        restaurant14.setClosed("Always Open");
        entertainmentService.add(restaurant14);

        Entertainment restaurant15 = new Restaurant();
        restaurant15.setName("Solar dos Presuntos");
        restaurant15.setAvgPrice(40);
        restaurant15.setEmail("solardospresuntos@gmail.com");
        restaurant15.setPhone("213424253");
        restaurant15.setWorkingHours("12h - 22h30");
        restaurant15.setClosed("Sunday");
        entertainmentService.add(restaurant15);




        Entertainment nature = new PreDate();
        nature.setName("Estrela Garden");
        nature.setWorkingHours("06h - 00h");
        nature.setClosed("Always Open");
        entertainmentService.add(nature);

        Entertainment nature1 = new PreDate();
        nature1.setName("Nossa da Nossa Senhora do Monte Viewpoint");
        nature1.setWorkingHours("Always Open");
        nature1.setClosed("Always Open");
        entertainmentService.add(nature1);

        Entertainment nature2 = new PreDate();
        nature2.setName("Graça Viewpoint");
        nature2.setWorkingHours("12h - 00h");
        nature2.setClosed("Always Open");
        entertainmentService.add(nature2);

        Entertainment nature3 = new PreDate();
        nature3.setName("Torel Garden");
        nature3.setWorkingHours("06h - 22h");
        nature3.setClosed("Always Open");
        entertainmentService.add(nature3);

        Entertainment nature4 = new PreDate();
        nature4.setName("Ribeira das Naus");
        nature4.setWorkingHours("Always Open");
        nature4.setClosed("Always Open");
        entertainmentService.add(nature4);

        Entertainment gulbenkian = new PreDate();
        gulbenkian.setName("Gulbenkian Garden");
        gulbenkian.setWorkingHours("08h - 19h30");
        gulbenkian.setClosed("Always Open");
        entertainmentService.add(gulbenkian);

        Entertainment nature6 = new PreDate();
        nature6.setName("Adamastor Viewpoint");
        nature6.setWorkingHours("08h - 23h");
        nature6.setClosed("Always Open");
        entertainmentService.add(nature6);

        Entertainment nature7 = new PreDate();
        nature7.setName("Monsanto Forest Park");
        nature7.setWorkingHours("08h - 23h");
        nature7.setClosed("Always Open");
        entertainmentService.add(nature7);


        Entertainment allFlowers = new PreDate();
        allFlowers.setName("All Flowers");
        allFlowers.setAvgPrice(20);
        allFlowers.setWorkingHours("Online");
        entertainmentService.add(allFlowers);

        Entertainment service1 = new PreDate();
        service1.setName("Seaventy");
        service1.setAvgPrice(125);
        service1.setEmail("@gmail.com");
        service1.setPhone("213424253");
        service1.setWorkingHours("09h - 18h");
        entertainmentService.add(service1);

        Entertainment escape = new PreDate();
        escape.setName("Escape In");
        escape.setAvgPrice(20);
        escape.setEmail("@gmail.com");
        escape.setPhone("213424253");
        escape.setWorkingHours("Online");
        entertainmentService.add(escape);

        Entertainment afrodite = new PreDate();
        afrodite.setName("Afrodite Sex Shop");
        afrodite.setAvgPrice(20);
        afrodite.setEmail("@gmail.com");
        afrodite.setPhone("213424253");
        afrodite.setWorkingHours("Online");
        entertainmentService.add(afrodite);

        Entertainment service4 = new PreDate();
        service4.setName("Amsterdam Store Lisboa");
        service4.setAvgPrice(15);
        service4.setEmail("@gmail.com");
        service4.setPhone("213424253");
        service4.setWorkingHours("10h - 19h");
        entertainmentService.add(service4);

        Entertainment service5 = new PreDate();
        service5.setName("Cannabis Care Portugal");
        service5.setAvgPrice(15);
        service5.setEmail("@gmail.com");
        service5.setPhone("213424253");
        service5.setWorkingHours("10h - 19h");
        entertainmentService.add(service5);

        Entertainment service6 = new PreDate();
        service6.setName("Bike Bar Tours");
        service6.setAvgPrice(25);
        service6.setEmail("@gmail.com");
        service6.setPhone("213424253");
        service6.setWorkingHours("08h - 22h");
        entertainmentService.add(service6);




        Entertainment culture = new PreDate();
        culture.setName("Zoo");
        culture.setAvgPrice(25);
        culture.setEmail("solardospresuntos@gmail.com");
        culture.setPhone("213424253");
        culture.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture);

        Entertainment culture1 = new PreDate();
        culture1.setName("Oceanarium");
        culture1.setAvgPrice(25);
        culture1.setEmail("solardospresuntos@gmail.com");
        culture1.setPhone("213424253");
        culture1.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture1);

        Entertainment tiles = new PreDate();
        tiles.setName("Tiles Museum");
        tiles.setAvgPrice(15);
        tiles.setEmail("solardospresuntos@gmail.com");
        tiles.setPhone("213424253");
        tiles.setWorkingHours("12h - 22h30");
        entertainmentService.add(tiles);

        Entertainment culture3 = new PreDate();
        culture3.setName("Jerónimos Monasterium");
        culture3.setAvgPrice(10);
        culture3.setEmail("solardospresuntos@gmail.com");
        culture3.setPhone("213424253");
        culture3.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture3);

        Entertainment culture4 = new PreDate();
        culture4.setName("Sé Cathedral");
        culture4.setAvgPrice(10);
        culture4.setEmail("solardospresuntos@gmail.com");
        culture4.setPhone("213424253");
        culture4.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture4);

        Entertainment culture5 = new PreDate();
        culture5.setName("Coach Museum");
        culture5.setAvgPrice(10);
        culture5.setEmail("solardospresuntos@gmail.com");
        culture5.setPhone("213424253");
        culture5.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture5);

        Entertainment culture6 = new PreDate();
        culture6.setName("Navy Museum");
        culture6.setAvgPrice(10);
        culture6.setEmail("solardospresuntos@gmail.com");
        culture6.setPhone("213424253");
        culture6.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture6);

        Entertainment culture7 = new PreDate();
        culture7.setName("Ladra Street Fair");
        culture7.setAvgPrice(10);
        culture7.setEmail("solardospresuntos@gmail.com");
        culture7.setPhone("213424253");
        culture7.setWorkingHours("12h - 22h30");
        entertainmentService.add(culture7);



        Entertainment transport = new Transport();
        transport.setName("Tuk Tuk Tours");
        transport.setAvgPrice(10);
        transport.setEmail("@mail.com");
        transport.setPhone("952345");
        transport.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport);

        Entertainment transport1 = new Transport();
        transport1.setName("Uber Black");
        transport1.setAvgPrice(20);
        transport1.setEmail("@mail.com");
        transport1.setPhone("952345");
        transport1.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport1);

        Entertainment transport2 = new Transport();
        transport2.setName("Uber X");
        transport2.setAvgPrice(10);
        transport2.setEmail("@mail.com");
        transport2.setPhone("952345");
        transport2.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport2);

        Entertainment transport3 = new Transport();
        transport3.setName("E-Cooltra");
        transport3.setAvgPrice(5);
        transport3.setEmail("@mail.com");
        transport3.setPhone("952345");
        transport3.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport3);

        Entertainment transport4 = new Transport();
        transport4.setName("VIP Limousines");
        transport4.setAvgPrice(75);
        transport4.setEmail("@mail.com");
        transport4.setPhone("952345");
        transport4.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport4);

        Entertainment transport5 = new Transport();
        transport5.setName("Gira Bikes");
        transport5.setAvgPrice(5);
        transport5.setEmail("@mail.com");
        transport5.setPhone("952345");
        transport5.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(transport5);




        Entertainment ritz = new PosDate();
        ritz.setName("Ritz Hotel");
        ritz.setAvgPrice(250);
        ritz.setEmail("@mail.com");
        ritz.setPhone("952345");
        ritz.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(ritz);

        Entertainment posDate1 = new PosDate();
        posDate1.setName("Tivoli Hotel");
        posDate1.setAvgPrice(100);
        posDate1.setEmail("@mail.com");
        posDate1.setPhone("952345");
        posDate1.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(posDate1);

        Entertainment chapito = new PosDate();
        chapito.setName("Chapitô");
        chapito.setAvgPrice(5);
        chapito.setEmail("@mail.com");
        chapito.setPhone("9523454234");
        chapito.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(chapito);

        Entertainment posDate3 = new PosDate();
        posDate3.setName("Loucos e Sonhadores");
        posDate3.setAvgPrice(5);
        posDate3.setEmail("@mail.com");
        posDate3.setPhone("952523525");
        posDate3.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(posDate3);

        Entertainment silk = new PosDate();
        silk.setName("Silk Club");
        silk.setAvgPrice(15);
        silk.setEmail("@mail.com");
        silk.setPhone("915632624");
        silk.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(silk);

        Entertainment posDate5 = new PosDate();
        posDate5.setName("Foxtrot Bar");
        posDate5.setAvgPrice(10);
        posDate5.setEmail("@mail.com");
        posDate5.setPhone("9274674r4");
        posDate5.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(posDate5);

        Entertainment posDate6 = new PosDate();
        posDate6.setName("Pavilhão Chinês");
        posDate6.setAvgPrice(10);
        posDate6.setEmail("@mail.com");
        posDate6.setPhone("952345");
        posDate6.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(posDate6);

        Entertainment crazy = new Crazy();
        crazy.setName("Demais");
        crazy.setAvgPrice(10);
        crazy.setEmail("@mail.com");
        crazy.setPhone("952345");
        crazy.setWorkingHours("10:00 - 22:00");
        entertainmentService.add(crazy);


        Pact eco = new Pact();
        eco.addEntertainment(nature7);
        eco.addEntertainment(tibatanos);
        eco.addEntertainment(chapito);
        packageService.add(eco);

        Pact budget = new Pact();
        budget.addEntertainment(gulbenkian);

        Entertainment chines = new Restaurant();
        chines.setName("Chines Clandestino");
        chines.setAvgPrice(10);
        chines.setEmail("clandestinos@gmail.com");
        chines.setPhone("213424253");
        chines.setWorkingHours("12h - 22h30");
        chines.setClosed("Sunday");
        entertainmentService.add(chines);
        budget.addEntertainment(chines);

        Entertainment graca = new PosDate();
        graca.setName("Graça ViewPoint");
        graca.setAvgPrice(0);
        graca.setClosed("Always Open");
        budget.addEntertainment(graca);
        entertainmentService.add(graca);
        packageService.add(budget);


        Pact bankrupt = new Pact();
        Entertainment tagus = new PreDate();
        tagus.setName("Tagus River");
        tagus.setAvgPrice(75);
        tagus.setEmail("tagusrives@gmail.com");
        tagus.setPhone("215234523");
        tagus.setWorkingHours("On Demand");
        tagus.setClosed("Always Open");
        bankrupt.addEntertainment(tagus);
        entertainmentService.add(tagus);

        bankrupt.addEntertainment(fifty);
        bankrupt.addEntertainment(silk);
        bankrupt.addEntertainment(ritz);
        packageService.add(bankrupt);

        Pact lisbon = new Pact();
        lisbon.addEntertainment(tiles);
        lisbon.addEntertainment(graca);
        lisbon.addEntertainment(vinho);
        packageService.add(lisbon);

        Pact covid = new Pact();
        covid.addEntertainment(allFlowers);
        Entertainment casa = new Restaurant();
        casa.setName("Casa da Comida");
        casa.setAvgPrice(30);
        casa.setEmail("casadacomida@gmail.pt");
        casa.setPhone("213654321");
        casa.setWorkingHours("10h - 23h");
        casa.setClosed("Sunday");
        entertainmentService.add(casa);
        covid.addEntertainment(casa);
        covid.addEntertainment(escape);
        covid.addEntertainment(afrodite);
        packageService.add(covid);

        Pact drug = new Pact();
        Entertainment maat = new PreDate();
        maat.setName("MAAT");
        maat.setAvgPrice(10);
        maat.setEmail("maat@gmail.pt");
        maat.setPhone("216543789");
        maat.setWorkingHours("11h - 19h");
        maat.setClosed("Tuesday");
        drug.addEntertainment(maat);
        entertainmentService.add(maat);

        Entertainment estufa = new PreDate();
        estufa.setName("Estufa Fria");
        estufa.setAvgPrice(0);
        estufa.setEmail("estufafria@gmail.pt");
        estufa.setPhone("216543789");
        estufa.setWorkingHours("10h - 19h");
        estufa.setClosed("Always Open");
        drug.addEntertainment(estufa);
        entertainmentService.add(estufa);

        Entertainment timeout = new Restaurant();
        timeout.setName("Time Out");
        timeout.setAvgPrice(10);
        timeout.setEmail("timeout@gmail.pt");
        timeout.setPhone("217345969");
        timeout.setWorkingHours("06h-00h");
        timeout.setClosed("Always Open");
        drug.addEntertainment(timeout);
        entertainmentService.add(timeout);

        drug.addEntertainment(graca);
        packageService.add(drug);

    }
}
