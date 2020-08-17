package com.github.NatalyaZay.module01;

public class ProgramTask54 {
    public static void main(String[] args) {
        int a = 10;
        int c = a;
        int b = ++a;

        if (b >= a){
            if (c == 10){
                if ((c <= b) && (a != b)){
                    System.out.println(" Все утверждения верны ");
                } else {
                    System.out.println(" Одно из утверждений не соответсвует ");
                }
            } else {
                System.out.println(" Одно из утверждений верно ");
            }
        } else {
            System.out.println(" Все утверждения ложные ");
        }
    }
}
// вывод на экран: Одно из утверждений не соответсвует
/* если поменять ( а == b ) , тогда вывод станет: все утверждения верны , так как все if стали true
отработает самый внутренний
 */