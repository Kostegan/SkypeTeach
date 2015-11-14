package ru.internal.skype;

/**
 *
 */
public class ExternalClass {
    private String name;
    private int id;

    public ExternalClass(){
        // create anonymous class
        IWorker worker = new IWorker(){
            {
                id = 45;
            }
            @Override
            public void setWorker(String worker) {

            }

            @Override
            public String getWorker() {
                return null;
            }
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {


        // create local class
        class localClass{
            int number;
            public localClass(int number){
                this.number = number;
            }


            public void setNumber(int number) {
                this.number = number;
            }
        }
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Static internal class
    static class StaticInternalClass{
        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    // No static internal class
    public class NoStaticInternalClass{
        private int age;

        public NoStaticInternalClass(String name, int id, int age){
            ExternalClass.this.name = name;
            ExternalClass.this.id = id;
            this.age = age;
        }
    }
}
