package xyz.kaungsithu.movie.event;

import java.util.List;

import xyz.kaungsithu.movie.data.vo.PopularMovie;

/**
 * Created by User on 1/5/2018.
 */

public class LoadedMovieEvent {
    private List<PopularMovie> movieList;

    public LoadedMovieEvent(List<PopularMovie> MovieList) {
        this.movieList = movieList;
    }

    public List<PopularMovie> getMovieList(){
        return movieList;
    }
}
