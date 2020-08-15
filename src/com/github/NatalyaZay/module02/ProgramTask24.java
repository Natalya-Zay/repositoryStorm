package com.github.NatalyaZay.module02;

public class ProgramTask24 {
    public static void main(String[] args) {
        Object a = new Integer(100);
        Object b = new Long(100);
        Object c = new String("100");
        a = null; // Integer подлежит удалению
        a = c;
        c = b;
        b = a;
   /*
   Integer подлежит удалению, так как на него никто не ссылается.
   а ссылается на с
   с ссылается на b
   b ссылается на а (которая ссылается на с)

    */
    }
}

