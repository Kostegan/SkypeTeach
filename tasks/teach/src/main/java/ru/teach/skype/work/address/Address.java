package ru.teach.skype.work.address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Address {
    private String postalCode;
    private String city;
    private String street;
    private int house;
    private int apartment;

    /**
     * Used to the pattern, means a postal code.
     */
    private static final String POSTALCODE = "(\\d+)?";
    /**
     * Uses to the pattern, divides strings.
     */
    private static final String SEPARATOR = "[,]?";
    private static final String SPACE = "[\\W]?";
    private static final String CITY = "([A-Za-z]+)?";
    private static final String STREET = "([A-Za-z]+)?";
    private static final String HOUSE = "(\\d+)?";
    private static final String APARTMENT = "(\\d+)?";

    private static final String PATTERN = POSTALCODE + SEPARATOR + SPACE + CITY + SEPARATOR + SPACE + STREET + SEPARATOR + SPACE + HOUSE + SEPARATOR + SPACE + APARTMENT;


    /**
     * Constructor takes a specified string, parses the string to elements and sets the elements into specified fields.
     *
     * @param address which will be divided to elements
     * @throws IllegalArgumentException if the address is a incorrect.
     */
    public Address(String address) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            if (matcher.group(1) != null) {
                setPostalCode(matcher.group(1));
            }
            if (matcher.group(2) != null) {
                setCity(matcher.group(2));
            }
            if (matcher.group(3) != null) {
                setStreet(matcher.group(3));
            }
            if (matcher.group(4) != null) {
                setHouse(Integer.parseInt(matcher.group(4)));
            }
            if (matcher.group(5) != null) {
                setApartment(Integer.parseInt(matcher.group(5)));
            }
        } else {
            throw new IllegalArgumentException("This address is incorrect: " + address + ".");
        }
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
