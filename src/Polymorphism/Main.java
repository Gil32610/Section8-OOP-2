package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Science Fiction", "Indiana Jones");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter type (A for adventure, C for comedy, S for Science Fiction, or Q to quit):");
            String type = s.nextLine();
            if("Qq".contains(type)){
                System.out.println("See you next time!");
                break;
            }
            System.out.print("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
