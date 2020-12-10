package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.persistence.model.entertainment.*;
import org.academiadecodigo.hackaton.services.EntertainmentService;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private UserService userService;
    private EntertainmentService entertainmentService;
    private boolean dataInitialized = false;

    @Autowired
    public void setEntertainmentService(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public String home() {
        initializeData();
        return "redirect:/home";
    }

    private void initializeData(){

        if(dataInitialized){
            return;
        }

        dataInitialized=true;
        User user = new User(packet);
        user.setName("Batata");
        user.setEmail("mail@gmail.com");
        user.setPhone("5345345363");
        user.setPassword("123");
        userService.add(user);

        User user1 = new User(packet);
        user1.setName("Alho");
        user1.setEmail("mail@gmail.com");
        user1.setPhone("5345345363");
        user1.setPassword("456");
        userService.add(user1);

        Entertainment restaurant = new Restaurant();
        restaurant.setName("Loco");
        restaurant.setAvgPrice(160);
        restaurant.setEmail("loco@loco.pt");
        restaurant.setPhone("213951861");
        restaurant.setWorkingHours("19h - 23h");
        restaurant.setClosed("Sunday - Monday");

        Entertainment restaurant1 = new Restaurant();
        restaurant1.setName("Casa Portuguesa Pastel Bacalhau");
        restaurant1.setAvgPrice(15);
        restaurant1.setEmail("geral@pasteisdebacalhau.com");
        restaurant1.setPhone("916486888");
        restaurant1.setWorkingHours("10h - 22h");
        restaurant1.setClosed("Always Open");

        Entertainment restaurant2 = new Restaurant();
        restaurant2.setName("100 Maneiras");
        restaurant2.setAvgPrice(60);
        restaurant2.setEmail("info@100maneiras.com");
        restaurant2.setPhone("910918181");
        restaurant2.setWorkingHours("19h - 22h30");
        restaurant2.setClosed("Always Open");

        Entertainment restaurant3 = new Restaurant();
        restaurant3.setName("Mini Bar");
        restaurant3.setAvgPrice(60);
        restaurant3.setEmail("minibar@gmail.com");
        restaurant3.setPhone("211305393");
        restaurant3.setWorkingHours("18h45 - 22h30");
        restaurant3.setClosed("Always Open");

        Entertainment restaurant4 = new Restaurant();
        restaurant4.setName("Kanazawa");
        restaurant4.setAvgPrice(50);
        restaurant4.setEmail("reservas@kanazawa.com.pt");
        restaurant4.setPhone("213010292");
        restaurant4.setWorkingHours("19h - 23h");
        restaurant4.setClosed("Sunday");

        Entertainment restaurant5 = new Restaurant();
        restaurant5.setName("Gambrinus");
        restaurant5.setAvgPrice(55);
        restaurant5.setEmail("reservas@gambrinus.pt");
        restaurant5.setPhone("213421466");
        restaurant5.setWorkingHours("12h - 22h30");
        restaurant5.setClosed("Saturday - Sunday");

        Entertainment restaurant6 = new Restaurant();
        restaurant6.setName("Alho");
        restaurant6.setAvgPrice(10);
        restaurant6.setEmail("@mail.com");
        restaurant6.setPhone("952345");
        restaurant6.setWorkingHours("10:00 - 22:00");
        restaurant6.setClosed("");

        Entertainment restaurant7 = new Restaurant();
        restaurant7.setName("Belcanto");
        restaurant7.setAvgPrice(150);
        restaurant7.setEmail("info@belcanto.com");
        restaurant7.setPhone("213420607");
        restaurant7.setWorkingHours("12h30 - 15h, 18h45 - 22h30");
        restaurant7.setClosed("Sunday - Monday");

        Entertainment restaurant8 = new Restaurant();
        restaurant8.setName("50 Seconds");
        restaurant8.setAvgPrice(90);
        restaurant8.setEmail("50seconds@myriadhotels.com");
        restaurant8.setPhone("211525380");
        restaurant8.setWorkingHours("12h - 15h, 19h - 23h");
        restaurant8.setClosed("Sunday - Monday");

        Entertainment restaurant9 = new Restaurant();
        restaurant9.setName("SUD Lisboa");
        restaurant9.setAvgPrice(50);
        restaurant9.setEmail("sudlisboa@sanahotels.com");
        restaurant9.setPhone("211592700");
        restaurant9.setWorkingHours("12h - 22h");
        restaurant9.setClosed("Always Open");

        Entertainment restaurant10 = new Restaurant();
        restaurant10.setName("Faz Figura");
        restaurant10.setAvgPrice(40);
        restaurant10.setEmail("reservas@fazfigura.com");
        restaurant10.setPhone("218868981");
        restaurant10.setWorkingHours("12h30 - 15h, 19h - 23h");
        restaurant10.setClosed("Monday");

        Entertainment restaurant11 = new Restaurant();
        restaurant11.setName("JNCquoi");
        restaurant11.setAvgPrice(45);
        restaurant11.setEmail("jncquoi@amorimluxury.com");
        restaurant11.setPhone("219369900");
        restaurant11.setWorkingHours("12h - 22h30");
        restaurant11.setClosed("Saturday - Sunday");

        Entertainment restaurant12 = new Restaurant();
        restaurant12.setName("Faia");
        restaurant12.setAvgPrice(75);
        restaurant12.setEmail("faia@faia.pt");
        restaurant12.setPhone("213426742");
        restaurant12.setWorkingHours("20h - 02h");
        restaurant12.setClosed("Sunday");

        Entertainment restaurant13 = new Restaurant();
        restaurant13.setName("Sr. Vinho");
        restaurant13.setAvgPrice(60);
        restaurant13.setEmail("reservas@srvinho.com.pt");
        restaurant13.setPhone("213972681");
        restaurant13.setWorkingHours("20h - 02h");
        restaurant13.setClosed("Sunday");

        Entertainment restaurant14 = new Restaurant();
        restaurant14.setName("Loja das Conservas");
        restaurant14.setAvgPrice(15);
        restaurant14.setEmail("geral@lojadasconservas.com");
        restaurant14.setPhone("911181210");
        restaurant14.setWorkingHours("10h - 20h");
        restaurant14.setClosed("Always Open");

        Entertainment restaurant15 = new Restaurant();
        restaurant15.setName("Solar dos Presuntos");
        restaurant15.setAvgPrice(40);
        restaurant15.setEmail("solardospresuntos@gmail.com");
        restaurant15.setPhone("213424253");
        restaurant15.setWorkingHours("12h - 22h30");
        restaurant15.setClosed("Sunday");




        Entertainment nature = new PreDate();
        nature.setName("Estrela Garden");
        nature.setWorkingHours("06h - 00h");
        nature.setClosed("Always Open");

        Entertainment nature1 = new PreDate();
        nature1.setName("Nossa da Nossa Senhora do Monte Viewpoint");
        nature1.setWorkingHours("Always Open");
        nature.setClosed("Always Open");

        Entertainment nature2 = new PreDate();
        nature2.setName("Graça Viewpoint");
        nature2.setWorkingHours("12h - 00h");
        nature.setClosed("Always Open");

        Entertainment nature3 = new PreDate();
        nature3.setName("Torel Garden");
        nature3.setWorkingHours("06h - 22h");
        nature.setClosed("Always Open");

        Entertainment nature4 = new PreDate();
        nature4.setName("Ribeira das Naus");
        nature4.setWorkingHours("Always Open");
        nature.setClosed("Always Open");

        Entertainment nature5 = new PreDate();
        nature5.setName("Gulbenkian Garden");
        nature5.setWorkingHours("08h - 19h30");
        nature.setClosed("Always Open");

        Entertainment nature6 = new PreDate();
        nature6.setName("Adamastor Viewpoint");
        nature6.setWorkingHours("08h - 23h");
        nature.setClosed("Always Open");



        Entertainment service = new PreDate();
        service.setName("All Flowers");
        service.setAvgPrice(20);
        service.setWorkingHours("Online");

        Entertainment service1 = new PreDate();
        service1.setName("Seaventy");
        service1.setAvgPrice(125);
        service1.setEmail("@gmail.com");
        service1.setPhone("213424253");
        service1.setWorkingHours("09h - 18h");

        Entertainment service2 = new PreDate();
        service2.setName("Escape In");
        service2.setAvgPrice(20);
        service2.setEmail("@gmail.com");
        service2.setPhone("213424253");
        service2.setWorkingHours("Online");

        Entertainment service3 = new PreDate();
        service3.setName("Afrodite Sex Shop");
        service3.setAvgPrice(20);
        service3.setEmail("@gmail.com");
        service3.setPhone("213424253");
        service3.setWorkingHours("Online");

        Entertainment service4 = new PreDate();
        service4.setName("Amsterdam Store Lisboa");
        service4.setAvgPrice(15);
        service4.setEmail("@gmail.com");
        service4.setPhone("213424253");
        service4.setWorkingHours("10h - 19h");

        Entertainment service5 = new PreDate();
        service5.setName("Cannabis Care Portugal");
        service5.setAvgPrice(15);
        service5.setEmail("@gmail.com");
        service5.setPhone("213424253");
        service5.setWorkingHours("10h - 19h");

        Entertainment service6 = new PreDate();
        service6.setName("Bike Bar Tours");
        service6.setAvgPrice(25);
        service6.setEmail("@gmail.com");
        service6.setPhone("213424253");
        service6.setWorkingHours("08h - 22h");




        Entertainment culture = new PreDate();
        culture.setName("Zoo");
        culture.setAvgPrice(25);
        culture.setEmail("solardospresuntos@gmail.com");
        culture.setPhone("213424253");
        culture.setWorkingHours("12h - 22h30");

        Entertainment culture1 = new PreDate();
        culture1.setName("Oceanarium");
        culture1.setAvgPrice(25);
        culture1.setEmail("solardospresuntos@gmail.com");
        culture1.setPhone("213424253");
        culture1.setWorkingHours("12h - 22h30");

        Entertainment culture2 = new PreDate();
        culture2.setName("Tiles Museum");
        culture2.setAvgPrice(15);
        culture2.setEmail("solardospresuntos@gmail.com");
        culture2.setPhone("213424253");
        culture2.setWorkingHours("12h - 22h30");

        Entertainment culture3 = new PreDate();
        culture3.setName("Jerónimos Monasterium");
        culture3.setAvgPrice(10);
        culture3.setEmail("solardospresuntos@gmail.com");
        culture3.setPhone("213424253");
        culture3.setWorkingHours("12h - 22h30");

        Entertainment culture4 = new PreDate();
        culture4.setName("Sé Cathedral");
        culture4.setAvgPrice(10);
        culture4.setEmail("solardospresuntos@gmail.com");
        culture4.setPhone("213424253");
        culture4.setWorkingHours("12h - 22h30");

        Entertainment culture5 = new PreDate();
        culture5.setName("Coach Museum");
        culture5.setAvgPrice(10);
        culture5.setEmail("solardospresuntos@gmail.com");
        culture5.setPhone("213424253");
        culture5.setWorkingHours("12h - 22h30");

        Entertainment culture6 = new PreDate();
        culture6.setName("Navy Museum");
        culture6.setAvgPrice(10);
        culture6.setEmail("solardospresuntos@gmail.com");
        culture6.setPhone("213424253");
        culture6.setWorkingHours("12h - 22h30");

        Entertainment culture7 = new PreDate();
        culture7.setName("Ladra Street Fair");
        culture7.setAvgPrice(10);
        culture7.setEmail("solardospresuntos@gmail.com");
        culture7.setPhone("213424253");
        culture7.setWorkingHours("12h - 22h30");



        Entertainment transport = new Transport();
        transport.setName("Tuk Tuk Tours");
        transport.setAvgPrice(10);
        transport.setEmail("@mail.com");
        transport.setPhone("952345");
        transport.setWorkingHours("10:00 - 22:00");

        Entertainment transport1 = new Transport();
        transport1.setName("Uber Black");
        transport1.setAvgPrice(20);
        transport1.setEmail("@mail.com");
        transport1.setPhone("952345");
        transport1.setWorkingHours("10:00 - 22:00");

        Entertainment transport2 = new Transport();
        transport2.setName("Uber X");
        transport2.setAvgPrice(10);
        transport2.setEmail("@mail.com");
        transport2.setPhone("952345");
        transport2.setWorkingHours("10:00 - 22:00");

        Entertainment transport3 = new Transport();
        transport3.setName("E-Cooltra");
        transport3.setAvgPrice(5);
        transport3.setEmail("@mail.com");
        transport3.setPhone("952345");
        transport3.setWorkingHours("10:00 - 22:00");

        Entertainment transport4 = new Transport();
        transport4.setName("VIP Limousines");
        transport4.setAvgPrice(75);
        transport4.setEmail("@mail.com");
        transport4.setPhone("952345");
        transport4.setWorkingHours("10:00 - 22:00");

        Entertainment transport5 = new Transport();
        transport5.setName("Gira Bikes");
        transport5.setAvgPrice(5);
        transport5.setEmail("@mail.com");
        transport5.setPhone("952345");
        transport5.setWorkingHours("10:00 - 22:00");




        Entertainment posDate = new PosDate();
        posDate.setName("Ritz Hotel");
        posDate.setAvgPrice(250);
        posDate.setEmail("@mail.com");
        posDate.setPhone("952345");
        posDate.setWorkingHours("10:00 - 22:00");

        Entertainment posDate1 = new PosDate();
        posDate1.setName("Tivoli Hotel");
        posDate1.setAvgPrice(100);
        posDate1.setEmail("@mail.com");
        posDate1.setPhone("952345");
        posDate1.setWorkingHours("10:00 - 22:00");

        Entertainment posDate2 = new PosDate();
        posDate2.setName("Chapitô");
        posDate2.setAvgPrice(5);
        posDate2.setEmail("@mail.com");
        posDate2.setPhone("9523454234");
        posDate2.setWorkingHours("10:00 - 22:00");

        Entertainment posDate3 = new PosDate();
        posDate3.setName("Loucos e Sonhadores");
        posDate3.setAvgPrice(5);
        posDate3.setEmail("@mail.com");
        posDate3.setPhone("952523525");
        posDate3.setWorkingHours("10:00 - 22:00");

        Entertainment posDate4 = new PosDate();
        posDate4.setName("Silk Club");
        posDate4.setAvgPrice(15);
        posDate4.setEmail("@mail.com");
        posDate4.setPhone("915632624");
        posDate4.setWorkingHours("10:00 - 22:00");

        Entertainment posDate5 = new PosDate();
        posDate5.setName("Foxtrot Bar");
        posDate5.setAvgPrice(10);
        posDate5.setEmail("@mail.com");
        posDate5.setPhone("9274674r4");
        posDate5.setWorkingHours("10:00 - 22:00");

        Entertainment posDate6 = new PosDate();
        posDate6.setName("Pavilhão Chinês");
        posDate6.setAvgPrice(10);
        posDate6.setEmail("@mail.com");
        posDate6.setPhone("952345");
        posDate6.setWorkingHours("10:00 - 22:00");

        Entertainment crazy = new Crazy();
        crazy.setName("Demais");
        crazy.setAvgPrice(10);
        crazy.setEmail("@mail.com");
        crazy.setPhone("952345");
        crazy.setWorkingHours("10:00 - 22:00");

        entertainmentService.add(restaurant);
        entertainmentService.add(restaurant1);
        entertainmentService.add(restaurant2);
        entertainmentService.add(restaurant3);
        entertainmentService.add(restaurant4);
        entertainmentService.add(restaurant15);

        entertainmentService.add(culture7);
        entertainmentService.add(nature1);
        entertainmentService.add(nature2);
        entertainmentService.add(nature3);
        entertainmentService.add(nature4);
        entertainmentService.add(nature5);

        entertainmentService.add(transport);
        entertainmentService.add(transport1);
        entertainmentService.add(transport2);
        entertainmentService.add(transport3);
        entertainmentService.add(transport4);
        entertainmentService.add(transport5);

        entertainmentService.add(posDate);
        entertainmentService.add(posDate1);
        entertainmentService.add(posDate2);
        entertainmentService.add(posDate3);
        entertainmentService.add(posDate4);
        entertainmentService.add(posDate5);

        entertainmentService.add(crazy);
    }
}
