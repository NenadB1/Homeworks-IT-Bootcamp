package domaci15;

public class MainMovie {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Inception","Christopher Nolan", 2010);
        Movie movie2 = new Movie("Matrix", "Lana Wachowski", 1999);

        if(movie1.yearOfRelease < movie2.yearOfRelease){
            System.out.println(movie2.name + " is newer.");
        } else if(movie2.yearOfRelease < movie1.yearOfRelease){
            System.out.println(movie1.name + " is newer.");
        } else {
            System.out.println("Movies were released in the same year.");
        }
    }
}
