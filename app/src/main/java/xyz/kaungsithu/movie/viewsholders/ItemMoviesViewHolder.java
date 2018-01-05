package xyz.kaungsithu.movie.viewsholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import xyz.kaungsithu.movie.R;
import butterknife.*;
import xyz.kaungsithu.movie.delegates.MovieActionDelegate;

import static xyz.kaungsithu.movie.R.id.cv_movies_items_root;

/**
 * Created by User on 12/15/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {


    private MovieActionDelegate mMovieActionDelegate;

    public ItemMoviesViewHolder(View itemView, MovieActionDelegate movieActionDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mMovieActionDelegate = movieActionDelegate;
    }

    @OnClick(cv_movies_items_root)
    public void onTapMoviesItem(){
        mMovieActionDelegate.onTapMovieItems();
    }
}
