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
        int post = 0;
        while (true) {
            System.out.println("Enter command from menu: ");
            String command = scanner.nextLine();

            switch (command) {

                case "7":
                    System.out.println("Exit the program");
                    return;

                case "1":
                    System.out.println("Enter movie title: ");
                    String movieAdd = scanner.nextLine();
                    movieBase[post] = movieAdd;
                    post++;
                    break;

                case "2":
                    System.out.println("Sort alphabetically ");
                    Arrays.sort(movieBase);
                    break;

                case "3":
                    System.out.println("What movie to edit ? ");
                    String movieReplace = scanner.nextLine();
                    System.out.println("What will be the changes ? ");
                    String movieEdit = scanner.nextLine();
                    for (int i = 0; i < movieBase.length; i++) {
                        if (movieBase[i].contains(movieReplace)) {
                            movieBase[i] = movieEdit;
                            movieEdit = movieReplace;
                            System.out.println(Arrays.toString(movieBase));
                        }
                    }
                    break;

                case "4":
                    System.out.println("All movies: ");
                    for (String s : movieBase) {
                        System.out.println(s);
                    }
                    break;

                case "5":
                    System.out.println("Which movie to check ?");
                    String movieContain = scanner.nextLine();
                    String massage = "not contained in the database";
                    for (String str : movieBase) {
                        if (str.contains(movieContain)) {
                           massage = "contained in the database";
                            break;
                        }
                    }
                    System.out.println(massage);
                    break;

                case "6":
                    System.out.println("Which movie to remove ? ");
                    String movieRemove = scanner.nextLine();
                    Arrays.sort(movieBase);
                    int index = -1;
                    for (int i = 0; i < movieBase.length; i++) {
                        if (movieBase[i].contains(movieRemove)) {
                            index = i;
                            System.arraycopy(movieBase, index + 1, movieBase, index, movieBase.length - index - 1);
                            movieBase = Arrays.copyOf(movieBase, movieBase.length - 1);
                        }
                    }
                    break;
            }
        }
    }
}
