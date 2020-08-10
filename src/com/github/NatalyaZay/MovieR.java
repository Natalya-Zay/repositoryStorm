package com.github.NatalyaZay;

import java.util.Arrays;
import java.util.Scanner;

public class MovieR {
    public static void main(String[] args) {

        String[] movieBase = new String[5];
        System.out.println("Menu\n" +
                "1. Add new movie\n" +
                "2. Sort movie\n" +
                "3. Edit movie\n" +
                "4. Show all movie\n" +
                "5. Contain\n" +
                "6. Delete movie\n" +
                "7. Exit");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int size = 0;
            System.out.println("Enter command from menu: ");
            String command = scanner.nextLine();

            if (command.equals("7")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Enter movie title: ");
                for (int i = 0; i < movieBase.length; i++) {
                    String movieAdd = scanner.nextLine();
                    movieBase[size] = movieAdd;
                    size++;
                }
            } else if (command.equals("2")) {
                System.out.println("Sort alphabetically ");
                for (int i = 0; i < movieBase.length; i++) {
                    Arrays.sort(movieBase);
                    System.out.println(movieBase[i]);
                }
            } else if (command.equals("3")) {
                System.out.println("What movie to edit ? ");
                String movieReplace = scanner.nextLine();
                System.out.println("What will be the changes ? ");
                String movieEdit = scanner.nextLine();

                for (int i = 0; i < movieBase.length; i++) {
                    if (movieBase[i].contains(movieReplace)) {
                        movieReplace = movieBase[i];
                        movieBase[i] = movieEdit;
                        movieEdit = movieReplace;
                        System.out.println(Arrays.toString(movieBase));
                        break;
                    }
                }
            } else if (command.equals("4")) {
                System.out.println("All movies: ");
                for (String s : movieBase) {
                    System.out.println(s);
                }
            } else if (command.equals("5")) {
                System.out.println("Which movie to check ?");
                String movieContain = scanner.nextLine();
                for (int i = 0; i < movieBase.length; i++) {
                    if (movieBase[i].contains(movieContain)) {
                        System.out.println("contained in the database");

                    } else if (i==movieBase.length-1 && !movieBase[i].contains(movieContain)){
                        System.out.println("not contained in the database");
                    }
                }
            } else if (command.equals("6")) {
                System.out.println("Which movie to remove ? ");
                String movieRemove = scanner.nextLine();
                Arrays.sort(movieBase);
                for (int i = 0; i < movieBase.length; i++) {
                    if (movieBase[i].contains(movieRemove)){
                        Arrays.sort(movieBase);
                        int key = Arrays.binarySearch(movieBase, movieRemove);
                       String[] copy = new String[movieBase.length - 1];
                       System.arraycopy(movieBase, 0, copy, 0, key);
                       System.arraycopy(movieBase, key + 1, copy, key, movieBase.length - key-1);
                       System.out.println(Arrays.toString(movieBase));
                    }
                }
            }
       }
    }
}





