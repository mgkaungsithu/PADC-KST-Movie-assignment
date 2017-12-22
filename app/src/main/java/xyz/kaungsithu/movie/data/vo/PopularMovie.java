package xyz.kaungsithu.movie.data.vo;

/**
 * Created by User on 12/22/2017.
 */

public class PopularMovie {
    private int voteCount;
    private int Id;
    private boolean video;
    private double voteAverage;
    private String title;
    private double popolarity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private Integer[] genreIds;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releaseDate;

    public PopularMovie(int voteCount, int id, boolean video, double voteAverage, String title, double popolarity, String posterPath, String originalLanguage, String originalTitle, Integer[] genreIds, String backdropPath, boolean adult, String overview, String releaseDate) {
        this.voteCount = voteCount;
        Id = id;
        this.video = video;
        this.voteAverage = voteAverage;
        this.title = title;
        this.popolarity = popolarity;
        this.posterPath = posterPath;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.genreIds = genreIds;
        this.backdropPath = backdropPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
    }
}
