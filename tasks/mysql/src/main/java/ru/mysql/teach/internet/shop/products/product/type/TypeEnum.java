package ru.mysql.teach.internet.shop.products.product.type;

/**
 * Creates types from products.
 */
public enum TypeEnum {
    SCHOOL_SUPPLIES(1),
    FOOD(2),
    HOUSEHOLD_PRODUCT(3);

    private final int value;

    TypeEnum(int value){
        this.value = value;
    }

    public String getTypeName(){
        return toString();
    }


    public int getValue(){
        return value;
    }

    public static TypeEnum valueOf(int value){
        for(TypeEnum type:TypeEnum.values()){
            if(type.getValue()==value){
                return type;
            }
        }
        throw new IllegalArgumentException("Type is not found for value: " + value+". Available values: ");
    }
}
