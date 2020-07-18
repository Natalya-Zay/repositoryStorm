package com.github.NatalyaZay;

public class ProgramTask43 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        ++a; // Увеличили на 1
        --b; // Уменьшили на 1
        System.out.println(a);
        System.out.println(b);
        a = --b; // Сначало вычитаем из b единицу и присваеваем значение b переменной а  , поэтому а = 3
        a = b--; /* Сначало а присваиваем значение b (3);  а потом из него вычитаем 1, если мы дальше будем использовать
        переменную а , то она будет иметь значение 2.
        */
        System.out.println(a);
        System.out.println(a);

/*   ++  или --   стоит перед операндой, то сначало выполнить действие + или - , а потом присвоить полученное значение.
  если ++ или -- стоит после операнды, то сначало присвоить значение, а затем выполнить действия + или -. Но полученное
   новое значение будет присваиваться в дальнейшем.
 */

    }
}
