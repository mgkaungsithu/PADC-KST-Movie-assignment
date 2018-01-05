package xyz.kaungsithu.movie.data.model;

import xyz.kaungsithu.movie.network.HttpUrlConnectionDataAgent;
import xyz.kaungsithu.movie.network.NewsDataAgent;

/**
 * Created by User on 1/1/2018.
 */

public class MovieModel {
    private static MovieModel sObjInstance;

    private NewsDataAgent mDataAgent;

    private MovieModel() {
        mDataAgent = HttpUrlConnectionDataAgent.getObjInstance();
    }

    public static MovieModel getObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new MovieModel();
        }
        return sObjInstance;
    }

    /**
     * load news data from nerworklayer/api
     */
    public void loadMovie() {
        mDataAgent.loadMovie();
    }
}