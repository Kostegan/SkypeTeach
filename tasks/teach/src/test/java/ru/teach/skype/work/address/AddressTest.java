package ru.teach.skype.work.address;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class AddressTest {
    /**
     * Gets a postal code.
     */
    @Test
    public void getPostalCode(){
        Address address = new Address("234556");
        assertEquals("Postal code: 234556","234556",address.getPostalCode());
    }

    /**
     * Gets a city.
     */
    @Test
    public void getCity(){
        Address address = new Address("Moscow");
        assertEquals("City: Moscow","Moscow",address.getCity());
    }

    /**
     * Gets a street.
     */
    @Test
    public void getStreet(){
        Address address = new Address("Locov");
//        assertEquals("Address: Locov","Locov",address.getStreet());                          todo------------------
    }



    /**
     * Checks a specified string through the pattern, searches by all address.
     */
    @Test
    public void searchesAllAddress(){
        String stringAddress = "341123, Voroneg, GerStratosfery, 20, 32";
        Address address = new Address(stringAddress);
        assertEquals("Finds postal code: 341123","341123",address.getPostalCode());
        assertEquals("Finds city: Voroneg","Voroneg",address.getCity());
        assertEquals("Finds street: GerStratosfery","GerStratosfery",address.getStreet());
        assertEquals("Finds house: 20",20,address.getHouse());
        assertEquals("Finds apartment: 32",32,address.getApartment());
    }

    /**
     * Checks a specified string through the pattern, searches the address without an apartment.
     */
    @Test
    public void searchesAddressWithoutApartment(){
        String stringAddress = "341123, Voroneg, GerStratosfery, 20";
        Address address = new Address(stringAddress);
        assertEquals("Finds postal code: 341123","341123",address.getPostalCode());
        assertEquals("Finds city: Voroneg","Voroneg",address.getCity());
        assertEquals("Finds street: GerStratosfery","GerStratosfery",address.getStreet());
        assertEquals("Finds house: 20",20,address.getHouse());
    }

    /**
     * Checks a specified string through the pattern, searches the address without an apartment and a house.
     */
    @Test
    public void searchesAddressWithoutApartmentHouse(){
        String stringAddress = "341123, Voroneg, GerStratosfery";
        Address address = new Address(stringAddress);
        assertEquals("Finds postal code: 341123","341123",address.getPostalCode());
        assertEquals("Finds city: Voroneg","Voroneg",address.getCity());
        assertEquals("Finds street: GerStratosfery","GerStratosfery",address.getStreet());
    }

    /**
     * Checks a specified string through the pattern, searches the address by a postal code and a city.
     */
    @Test
    public void searchesAddressByPostalCodeCity(){
        String stringAddress = "341123, Voroneg";
        Address address = new Address(stringAddress);
        assertEquals("Finds postal code: 341123","341123",address.getPostalCode());
        assertEquals("Finds city: Voroneg","Voroneg",address.getCity());
    }

    /**
     * Checks a specified string through the pattern, searches the address by a city.
     */
    @Test
    public void searchesAddressByCity(){
        String stringAddress = "Voroneg";
        Address address = new Address(stringAddress);
        assertEquals("Finds city: Voroneg","Voroneg",address.getCity());
    }
}
