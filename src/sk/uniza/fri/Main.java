package sk.uniza.fri;
/**
 * Created by IntelliJ IDEA.
 * User: 42191
 * Date: 30. 1. 2022
 * Time: 11:07
 */



public class Main {

    public static void main(String[] args) {
        Rekurzia rekurzia = new Rekurzia();

        System.out.println("Tail rek");
        rekurzia.tailRek1(5);

        System.out.println("Head rek");
        rekurzia.headRek1(5);

        System.out.println("Tree rek");
        rekurzia.treeRek1(5);

        System.out.println("Indirect rek");
        rekurzia.indirectRek1(20);

        System.out.println("Nested rek");
        rekurzia.nestedRek1(95);

        System.out.println("Taylor series");
        System.out.printf("e^x = %f " , rekurzia.taylorSeries1(1 , 10));


        System.out.printf("\nFib1 pre 5 je : %d" , rekurzia.fibonacci1( 6 ));

        System.out.printf("\nFib2 pre 5 je : %d" , rekurzia.fibonacci2( 6 ));

        System.out.printf("\n kombinacia : %d" , rekurzia.kombinacia(5 , 3));

        System.out.println();
        rekurzia.problemOfHanoiTowers(5 , 1 , 2 , 3);

        System.out.println("Refresh na githube");
    }
}
