package com.hafidhaulia.learnretrofit.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hafidhaulia.learnretrofit.R;
import com.hafidhaulia.learnretrofit.model.Movie;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context context;
    private List<Movie> movies;

    public MovieAdapter(Context context, List<Movie> movies) {
        super(context, R.layout.list_item, movies);

        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView textView = row.findViewById(R.id.list_item_pagination_text);

        Movie movie = movies.get(position);

        String title = movie.getTitle();

        textView.setText(title);

        return row;
    }
}
