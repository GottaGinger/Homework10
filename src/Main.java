import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Star Wars", "scifi"));
        movies.add(new Movie("Practical Magic", "drama"));
        movies.add(new Movie("Friday the 13th", "horror"));
        movies.add(new Movie("Lion King", "animated"));
        movies.add(new Movie("Titan AE", "animated"));
        movies.add(new Movie("The Matrix", "scifi"));
        movies.add(new Movie("Steel Magnolias", "drama"));
        movies.add(new Movie("Insidious", "horror"));
        movies.add(new Movie("Paprika", "animated"));
        movies.add(new Movie("City of Angels", "drama"));

        String yesOrNo;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the Movie List Application!");
            System.out.println("There are 10 movies in this list. What category are you interested in?");
            String whatGenre = scan.nextLine();
            System.out.println(whatGenre);

            for (int i = 0; i < movies.size(); i++) {
                if (whatGenre.equals(movies.get(i).category)) {
                    System.out.println(movies.get(i).title);

                }
            }
            System.out.println("Continue? y/n");
            yesOrNo = scan.nextLine();
        } while (yesOrNo.equals("y"));

    }
}