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

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return Id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public double getPopolarity() {
        return popolarity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public Integer[] getGenreIds() {
        return genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }


}
