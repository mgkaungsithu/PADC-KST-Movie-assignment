package xyz.kaungsithu.movie.data.model;

import xyz.kaungsithu.movie.network.HttpUrlConnectionDataAgent;
import xyz.kaungsithu.movie.network.NewsDataAgent;

/**
 * Created by User on 1/1/2018.
 */

public class MovieModel {
    private static MovieModel sObjectInstance;

    private NewsDataAgent mDataAgent;

    private MovieModel() {
        mDataAgent = HttpUrlConnectionDataAgent.getObjectInstance();
    }

    public static MovieModel getObjectInstance() {
        if (sObjectInstance == null) {
            sObjectInstance = new MovieModel();
        }
        return sObjectInstance;
    }

    /**
     * load news data from nerworklayer/api
     */
    public void loadMovie() {
        mDataAgent.loadMovie();
    }
}