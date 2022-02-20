package sk.uniza.fri;

/**
 * 30. 1. 2022 - 11:07
 *
 * @author 42191
 */
public class Rekurzia {


    public Rekurzia() {

    }
    //tail recursion je rekurzia ktorá najprv vykoná niaku časť kodu a až potom zavola sama seba , nič sa nedeje v returnig time
    //da sa transformovat do cyklu (while)
    public void tailRek1(int n) {
        if (n > 0) {
            System.out.printf("%d\n" , n);
            this.tailRek1(n - 1);

        }

    }


    //head rekursion je rekurzia ktora všetko robi v returning time najprv sa zavola a potom vykonáva další kod
    public void headRek1(int n) {
        if (n > 0) {
            this.tailRek1(n - 1);
            System.out.printf("%d\n" , n);

        }

    }

    //tree rekursion je stromova rekurzia to znamná že sa sama v sebe volá viac krát ako raz
    public void treeRek1(int n) {
        if (n > 0) {
            System.out.printf("%d\n" , n);
            this.treeRek1(n - 1);
            this.treeRek1(n - 1);

        }
    }

    //nepriama rekurzia znamena že rekurzia sa deje pomocou inej funkcie
    public void indirectRek1( int n ) {
        if ( n > 0 ) {
            System.out.printf("%d -->1\n" , n );
            this.indirectRek2(n - 1);
        }
    }

    public void indirectRek2 ( int n ) {
        if ( n > 0 ) {
            System.out.printf("%d -->2\n" , n );
            this.indirectRek1(n / 2);

        }
    }

    //nested rekursion znamena že funkcia je volaná sama sebou ale ako parameter dostáva výsledok svojho volania sa
    public int nestedRek1 ( int n ) {
        if ( n > 100 ) {
            return n - 10 ;
        } else {
            return this.nestedRek1( this.nestedRek1( n + 11 ) );
        }
    }

    public int factorial (int n ) {
        if (n == 0) {
            return 1 ;
        } else {
            return this.factorial( n - 1 ) * n ;
        }
    }

    //mocnina pomocou rekurzie
    public int pow ( int m , int n ) {

        if (n == 0) {
            return 1;
        }
        if ( n % 2 == 0 ) {
            return this.pow( m * m , n / 2);
        } else {
            return m * this.pow( m * m , ( n - 1 ) / 2 )  ;
        }
    }


    public double taylorSeries1(int x , int n) {
        double p = 1 ;
        double f = 1 ;
        double r ;
        if ( n == 0) {
            return 1 ;
        } else {
            r = this.taylorSeries1( x , n - 1) ;
            p = p * x ;
            f = f * n ;
            return r + p / f;
        }
    }

    public double taylorSeries2 ( int x , int n ) {
        double s = 1 ;
        if ( n == 0 ) {
            return s ;
        } else {
            s = 1 + x * s / n  ;
            return this.taylorSeries2( x , n - 1);
        }

    }
    // fibonacciho postupnosť je excesive recursion pretože sama seba volá viac krat pre rovnake hodnoty
    public int fibonacci1 ( int n ) {
        if ( n <= 1) {
            return n;
        } else {
            return this.fibonacci1( n - 2) + this.fibonacci1( n - 1) ;
        }
    }



    public int fibonacci2 (int n ) {
        int[] intArray = new int[n + 1];
        for (int i = 0 ; i <= n ; i++) {
            intArray[i] = -1 ;
        }
        if ( n <= 1 ) {
            intArray[n] = n ;
            return n;
        } else {
            if ( intArray[n - 2] == -1) {
                intArray[n - 2] = this.fibonacci2( n - 2);
            }
            if (intArray[n - 1] == -1) {
                intArray[n - 1] = this.fibonacci2( n - 1);
            }
            return intArray[n - 2] + intArray[n - 1] ;
        }
    }

    public int kombinacia( int n , int r ) {
        if ( r == 0 || n == r ) {
            return 1 ;
        } else {
            return this.kombinacia( n - 1 ,  r - 1 ) + this.kombinacia( n - 1 , r );
        }
    }

    public void problemOfHanoiTowers ( int n , int a , int b , int c ) {
        if ( n > 0 ) {
            this.problemOfHanoiTowers( n - 1 , a , c , b );
            System.out.printf(" ( %d , %d ) " , a , c );
            this.problemOfHanoiTowers( n - 1 , b , a , c );
        }
    }
}
