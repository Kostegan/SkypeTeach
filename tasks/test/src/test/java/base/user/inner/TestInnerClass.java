package base.user.inner;

/**
 *
 */
public class TestInnerClass {
    class InnerOne{
        public void printInteriorIOne(){
            System.out.println("It is the interior for InnerClassOne!!!");
        }
    }

    static class InnerStaticTwo {
        public void printInteriorITwo(){
            System.out.println("It is the interior for InnerClassTwo!!!");
        }
    }

    public void getInnerClass(){
        class InnerThree{
            public void printInteriorIThree(){
                System.out.println("It is the interior for InnerClassTwo!!!");
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        TestInnerClass one = new TestInnerClass();
        TestInnerClass.InnerOne innerOne = one.new InnerOne();
        TestInnerClass.InnerStaticTwo two  = new TestInnerClass.InnerStaticTwo();
    }
}
