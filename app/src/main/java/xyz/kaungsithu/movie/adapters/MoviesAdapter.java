package xyz.kaungsithu.movie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.kaungsithu.movie.R;
import xyz.kaungsithu.movie.data.vo.PopularMovie;
import xyz.kaungsithu.movie.delegates.MovieActionDelegate;
import xyz.kaungsithu.movie.viewsholders.ItemMoviesViewHolder;


/**
 * Created by User on 12/15/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemMoviesViewHolder> {


    private MovieActionDelegate mMovieActionDelegate;
    private List<PopularMovie> mMovieList;

    public MoviesAdapter(MovieActionDelegate movieActionDelegate) {
        mMovieActionDelegate = movieActionDelegate;
        mMovieList = new ArrayList<>();
    }


    @Override
    public ItemMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieItemView = inflater.inflate(R.layout.movie_details, parent , false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(movieItemView,mMovieActionDelegate);
        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemMoviesViewHolder holder, int position) {
        holder.setMovie(mMovieList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }
    public void setMovie(List<PopularMovie> movieList){
        mMovieList=movieList;
        notifyDataSetChanged();
    }
}
