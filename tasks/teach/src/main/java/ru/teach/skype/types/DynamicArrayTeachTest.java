package ru.teach.skype.types;

/**
 *
 */
public class DynamicArrayTeachTest {
    public static void main(String[] args){
        Sush rim = new Sush(3);
        rim.setCity(0,"Voroneg");
        rim.setCity(1,"Poleto");
        rim.setCity(2,"Ikil");
        rim.addNewLine("Merk");
        rim.addNewLine("Tol");
        rim.print();
        rim.deleteOldLine("Ikil");
        rim.print();
    }
}


class Sush {
    String magazin;
    String[] city = null;

    public Sush(int index){
        city = new String [index];
    }

    public void setCity(int index, String cityName) {
        city[index] = cityName;
    }

    public String getCity(int index){
        return city[index];
    }

    public void print(){
        for(int i = 0; i < city.length; i++){
            System.out.print(city[i]);
            if(i == city.length-1){
                System.out.println(".");
            } else{
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void addNewLine(String str){
        String[] tmp = new String[city.length + 1];
        for (int i = 0; i < city.length; i++){
            tmp[i] = city[i];
        }
        tmp[tmp.length-1] = str;
        city = tmp;
    }

    public void deleteOldLine(String str){
        String[] tmp = new String[city.length-1];
        for (int i = 0, j = 0; i < city.length; i++){
            if(!(city[i].equals(str))){
                tmp[j] = city[i];
                j++;
            } else {
                //
            }
        }
        city = tmp;
    }
}

class vizov{

}