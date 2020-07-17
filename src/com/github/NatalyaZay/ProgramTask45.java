package com.github.NatalyaZay;

public class ProgramTask45 {
    public static void main(String[] args) {
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne && bTwo); // boolean
        System.out.println(bOne || bTwo);
        System.out.println(!bOne ^ bTwo);  // ! меняет true na false . Дает обратный результат
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println();

        boolean bOne1 = true;
        boolean bTwo1 = true;
        System.out.println(bOne1 && bTwo1);
        System.out.println(bOne1 || bTwo1);
        System.out.println(!bOne1 ^ bTwo1);
        System.out.println(bOne1 & bTwo1);
        System.out.println(bOne1 | bTwo1); // проверяют все действия выражения  , в отличие от сокращенных
        System.out.println(bOne1 ^ bTwo1);
        /*
        а = true
        b = false
        c = true
        d = не скомпилируется
        e = true
        f = true
        i = true
        g = не скомпилируется
         */
    }
}
