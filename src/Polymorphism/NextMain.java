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
        aquaTeen.watchMovie();

        Object unknownObject = Movie.getMovie("A", "Indiana Jones");
        if(unknownObject.getClass().getSimpleName()=="Equals"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            //instance of tests the type of Object or instance
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof  ScienceFiction syfy) {
            //Pattern matching support
            syfy.watchScienceFiction();
        }


    }
}
