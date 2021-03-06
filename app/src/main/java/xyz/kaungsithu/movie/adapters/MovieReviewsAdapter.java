package xyz.kaungsithu.movie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.kaungsithu.movie.R;
import xyz.kaungsithu.movie.viewsholders.ItemMovieReviewsViewHolder;

/**
 * Created by User on 12/23/2017.
 */

public class MovieReviewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View reviewItemView = layoutInflater.inflate(R.layout.item_reviews,parent,false);
        ItemMovieReviewsViewHolder itemMovieReviewsViewHolder= new ItemMovieReviewsViewHolder(reviewItemView);
        return itemMovieReviewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
