package ru.teach.skype.types.internal.classses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class InternalClassTeach {
    private String name;

    private ActionListener listener =  new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked2!" + name);
        }
    };

    {
        name = "Piter";
    }

    public InternalClassTeach(final String name) {
        this.name = name;
        NonStaticInternalClass internalObj = new NonStaticInternalClass(2);
        NonStaticInternalClass internalObj2 = new NonStaticInternalClass(4);
        System.out.println(internalObj.id);

        StaticInternalClass internalStatObj = new StaticInternalClass(3);
        System.out.println(internalStatObj.id);

        Object anonymObj = new Object(){ // InternalClassTeach$1
            @Override
            public String toString() {
                return name + ".";
            }
        };


        final String city = "Spb";

        Button button = new Button();
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InternalClassTeach.this.name = "ds";
                System.out.println("Clicked!" + InternalClassTeach.this.name + "-" + city);
            }
        });
        button.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked2!");
            }
        });

        AInterface anonymObj2 = new AInterface() {
            @Override
            public String getId() {
                return name + "!";
            }
        };

        System.out.println(anonymObj.toString());

        Object info = getInfo();
        info.toString();
    }

    public Object getInfo() {
        class LocalClass {
            int price;

            public LocalClass(int price) {
                this.price = price;
                System.out.println(name);
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String toString() {
                return String.valueOf(price);
            }
        }

        LocalClass localObj = new LocalClass(344);
        return localObj;
    }


    public ActionListener getListener() {
        return listener;
    }

    public void setListener(ActionListener listener) {
        this.listener = listener;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StaticInternalClass obj = new StaticInternalClass(2);
    }

    public static class StaticInternalClass {
        private int id;

        public StaticInternalClass(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id+"";
        }
    }

    public class NonStaticInternalClass {
        private int id;

        public NonStaticInternalClass(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return getName() + "-" + id;
        }
    }

    public interface AInterface {
        String getId();
    }
}
