package ru.comparable.skype.product;

/**
 * Class is represents item of product, has fields a name and a price.
 */
public class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " = " + price;
    }

    @Override
    public int compareTo(Product p) {
        return charCalculate(name, p.getName());
    }

    private int charCalculate(String nameProduct1, String nameProduct2) {
        int name2length = nameProduct2.length();
        for (int i = 0; i < nameProduct1.toCharArray().length; i++) {
            int result = 0;
            name2length--;
//            if(nameProduct2.charAt(i)!=null)
            result = nameProduct1.charAt(i) - nameProduct2.charAt(i);
            if (result!=0 || name2length==0){
                return result;
            }
        }

        return 0;
    }
}
