package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Indiana Jones");
        movie.watchMovie();

        //Explicit casting so the compiler can make assumptions
        Adventure indianaJones = (Adventure) Movie.getMovie("A", "Indiana Jones");
        indianaJones.watchMovie();

        //too generic reference
        //Compiler cannot figure out what type is going to be returned
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();
        //Compiler only looks at the reference type (interface)

        //Local Variable Type Inference
        //Figuring out the compile-time type
        //Reduces boilerplate code
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();


        var aquaTeen = new Comedy("Aqua Teen");
        aquaTeen.watchComedy();
    }
}
