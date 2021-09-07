package Testing2;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());

        String highestRatedMovie = "";
        double highestRating = Double.MIN_VALUE;

        String lowestRatedMovies = "";
        double lowestRating = Double.MAX_VALUE;

        double sumMoviesRating = 0;

        for (int i = 1; i <= moviesCount ; i++) {
            String movieName = scanner.nextLine();
            double currentMovieRating = Double.parseDouble(scanner.nextLine());
            sumMoviesRating += currentMovieRating;
            if (highestRating < currentMovieRating){
                highestRating = currentMovieRating;
                highestRatedMovie = movieName;
            }
            if (lowestRating > currentMovieRating){
                lowestRating = currentMovieRating;
                lowestRatedMovies = movieName;
            }
        }
        double averageRating = sumMoviesRating / moviesCount;

        System.out.printf("%s is with highest rating: %.1f%n", highestRatedMovie, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRatedMovies, lowestRating);
        System.out.printf("Average rating: %.1f", averageRating);

    }
}
