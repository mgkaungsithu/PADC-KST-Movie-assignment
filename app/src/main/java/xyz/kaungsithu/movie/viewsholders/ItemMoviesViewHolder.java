package xyz.kaungsithu.movie.viewsholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import butterknife.ButterKnife;
import xyz.kaungsithu.movie.R;
import butterknife.*;
import xyz.kaungsithu.movie.data.vo.PopularMovie;
import xyz.kaungsithu.movie.delegates.MovieActionDelegate;

import static xyz.kaungsithu.movie.R.id.cv_movies_items_root;

/**
 * Created by User on 12/15/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.tv_movie_title)
    TextView movieTitle;

    @BindView(R.id.iv_movie_cover)
    ImageView movieCover;

    @BindView(R.id.tv_rating_text)
    TextView rating;


    private MovieActionDelegate mMovieActionDelegate;

    public ItemMoviesViewHolder(View itemView, MovieActionDelegate movieActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mMovieActionDelegate = movieActionDelegate;
    }

    @OnClick(cv_movies_items_root)
    public void onTapMoviesItem() {
        mMovieActionDelegate.onTapMovieItems();
    }

    public void setMovie(PopularMovie movies) {
        movieTitle.setText(movies.getTitle());
        Glide.with(movieCover.getContext())
                .load(movies.getPosterPath())
                .into(movieCover);
    }
}
