package xyz.kaungsithu.movie.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.*;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import butterknife.*;
import butterknife.ButterKnife;
import xyz.kaungsithu.movie.R;
import xyz.kaungsithu.movie.adapters.MovieReviewsAdapter;
import xyz.kaungsithu.movie.adapters.MovieTypesAdaper;
import xyz.kaungsithu.movie.adapters.TrailersAdapter;


/**
 * Created by User on 12/15/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {
    @BindView(R.id.rv_movie_trailer)
    RecyclerView rvMovieTrailer;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv_movie_types)
    RecyclerView rvMovieTypes;

    @BindView(R.id.rv_movie_reviews)
    RecyclerView rvMovieReviews;

    public static Intent newIntent(Context context)
    {
        Intent intent = new Intent(context,MainActivity.class);
        return intent;
    }
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_details);
        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
       actionBar.setDisplayShowTitleEnabled(false);

        MovieTypesAdaper movieTypesAdaper = new MovieTypesAdaper();
        LinearLayoutManager linearLayoutManagerMovieTypes = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvMovieTypes.setLayoutManager(linearLayoutManagerMovieTypes);
        rvMovieTypes.setAdapter(movieTypesAdaper);

        MovieReviewsAdapter movieReviewsAdapter = new MovieReviewsAdapter();
        LinearLayoutManager linearLayoutManagerReview = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvMovieReviews.setLayoutManager(linearLayoutManagerReview);
        rvMovieReviews.setAdapter(movieReviewsAdapter);


        TrailersAdapter trailersAdapter = new TrailersAdapter();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,false);
        rvMovieTrailer.setLayoutManager(linearLayoutManager);
        rvMovieTrailer.setAdapter(trailersAdapter);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}
