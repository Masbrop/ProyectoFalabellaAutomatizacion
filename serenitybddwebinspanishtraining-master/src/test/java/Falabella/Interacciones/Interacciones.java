package Falabella.Interacciones;


import org.openqa.selenium.By;

public class Interacciones {
    public static By BARRA_BUSQUEDA = By.cssSelector(".SearchBar-module_searchBar__Input__1VvhT");
    public static By BOTON_BUSQUEDA = By.cssSelector(".SearchBar-module_searchBtnIcon__6KVum");
    public static By CERRAR_POP = By.cssSelector(".dy-lb-close");
    public static By BOTON_PRODUCTO = By.cssSelector("#testId-Pod-action-prod10900030");
    public static By AGREGAR_BOLSA = By.cssSelector(".js-fb-continue-purchase");
    public static By VER_BOLSA_DE_COMPRA = By.cssSelector(".jsx-3482180836");
    public static By IR_A_COMPRAR = By.cssSelector(".fb-btn-icon__icon");
    public static By EMAIL = By.id("emailAddress");
    public static By CONTINUAR_FALABELLA = By.cssSelector(".fbra_emailInputForm__submitButton");
    public static By REGION = By.id("region");
    public static By REGION_OPTION = By.xpath("//option[contains(text(),'ANTIOQUIA')]");
    public static By CIUDAD = By.id("ciudad");
    public static By CIUDAD_OPTION = By.xpath("//option[contains(text(),'MEDELLIN')]");
    public static By BARRIO = By.id("comuna");
    public static By BARRIO_OPTION = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/section[1]/section[1]/form[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[2]");
    public static By CONTINUAR_COMPRA2 = By.cssSelector(".fbra_button.fbra_test_button");
    public static By DIRECCION = By.id("address");
    public static By TIPO_CASA = By.id("departmentNumber");
    public static By INGRESAR_DIRECCION = By.cssSelector(".fbra_formItem__useAddress");
    public static By CONTINUAR_FINAL = By.xpath("//button[contains(text(),'Continuar')]");

}
