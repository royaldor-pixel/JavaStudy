package com.objandcls.movie;

public class MovieTestDrive {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.genre = "science fiction";
        movie.name = "Back to Earth";
        movie.rating = 5.0F;
        movie.playIt();

    }

}
