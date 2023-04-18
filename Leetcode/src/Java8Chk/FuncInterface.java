package Java8Chk;

@FunctionalInterface
public interface FuncInterface {

    boolean test(int a, int b);

    default void msg(){
        System.out.println("Interface called");
    }

    static void addout(int a, int b){
        System.out.println( a + b);
    }
}
