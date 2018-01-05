package xyz.kaungsithu.movie.network.responses;

import java.util.List;

import xyz.kaungsithu.movie.data.vo.PopularMovie;

/**
 * Created by User on 1/3/2018.
 */

public class GetMoviesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<PopularMovie> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PopularMovie> getPopularMovies() {
        return popularMovies;
    }
}
