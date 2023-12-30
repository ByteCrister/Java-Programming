import java.util.*;
 enum Names{
    Mashiat, shakib, sakib, arnab, anik;

 }
 class Enum{
    String n;
    Enum(String name){
        this.n = name;
    }

    Names ob = Names.Mashiat;
 }
public class Practice1{
    public static void main(String[] args) {

        System.out.println("Who is the best student ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Names ob1 = Names.Mashiat;
        System.out.println(ob1);
    }
}