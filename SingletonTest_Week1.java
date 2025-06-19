package Singleton;

public class SingletonTest{
    public static void main(String[] args){
        Logger L1=Logger.getInstance();
        Logger L2=Logger.getInstance();

        System.out.println(L1==L2);
    }
}
