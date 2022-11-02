package aut.funcional.testcases;

import aut.funcional.pages.vuelos.RumboVuelosPage;
import aut.funcional.pages.vuelos.RumboVuelosRyanair;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestVuelos extends SeleniumTestBase {
    RumboVuelosPage rumboVuelos;
    RumboVuelosRyanair rumboVuelosRyanair;
    By fechaIdaLocator1 = By.xpath("//div[@class='monthContainer monthContainerFirst']//child::div[text()='12']");
    By fechaVueltaLocator = By.xpath("//div[@class='monthContainer monthContainerFirst']//child::div[text()='21']");
    By fechaIdaLocator2 = By.xpath("//*[@id='hub-csw-container']//div[2]/div[2]/button[27]");
    @Test
    //TCV-MC-001 Busqueda de vuelos de la Aerolinea Ryanair
    void test1(){
        //rumboVuelos = new RumboVuelosPage(super.driver);
        rumboVuelosRyanair = new RumboVuelosRyanair(super.driver);
        //rumboVuelos.navigateToViewVuelos();
        //rumboVuelos.navigateToAirlineView("Ryanair");
        rumboVuelosRyanair.navigateToHomePage();
        rumboVuelosRyanair.deleteCookies();
        rumboVuelosRyanair.writeOnOriginRyanair();
        rumboVuelosRyanair.writeOnDestinationRyanair();
        rumboVuelosRyanair.selectFechaIda(fechaIdaLocator1, 0);
        rumboVuelosRyanair.selectFechaVuelta(fechaVueltaLocator, 1);
        rumboVuelosRyanair.addPassengers("Adultos", 3);
        rumboVuelosRyanair.addPassengers("Niños", 1);
        rumboVuelosRyanair.selectClassOption("Bussiness");
        rumboVuelosRyanair.searchWithSearchBtn();
    }

    //TCV-MC-002
    @Test
    void test2(){

    }
    //TCV-HC-001
    @Test
    void test3(){

    }
    //TCV-LC-001
    @Test
    void test4(){
        rumboVuelos = new RumboVuelosPage(super.driver);
        rumboVuelos.navigateToViewVuelos();
       rumboVuelos.deleteCookies();
        rumboVuelos.selectOptionVuelo("Ida y vuelta");
        rumboVuelos.writeOnOrigin("Madrid (MAD) Adolfo Suárez Barajas, España");
        rumboVuelos.writeOnDestination("Madrid");
        rumboVuelos.clickBtnBuscar();
        rumboVuelos.validateAlertSameValueInputMessage();
    }
    //TCV-LC-002
    @Test
    void test5(){
        rumboVuelos = new RumboVuelosPage(super.driver);
        rumboVuelos.navigateToViewVuelos();
        rumboVuelos.deleteCookies();
        rumboVuelos.selectOptionVuelo("Solo ida");
        rumboVuelos.eraseOrigin();
        rumboVuelos.selectFechaIda(fechaIdaLocator2);
        rumboVuelos.addAdult(2);
        rumboVuelos.addChild(1, "Bebé, 0-11 meses");
        rumboVuelos.addChild(1, "2 años");
        rumboVuelos.addChild(1, "7 años");

    }
    //TCV-HC-002
    @Test
    void test6(){

    }
    //TCV-LC-003
    @Test
    void test7(){

    }
    //TCV-LC-004
    @Test
    void test8(){

    }
}
