package nareshit.com.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by nareshit on 6/13/2017.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    String[] movies;
    String[] cast;

    public MyAdapter(Context context, String[] movies, String[] cast) {
        this.context = context;
        this.movies = movies;
        this.cast = cast;
    }

    @Override
    public int getCount() {
        return movies.length;
    }

    @Override
    public Object getItem(int position) {
        return movies[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);

        TextView textMovie = (TextView) view.findViewById(R.id.textView);
        TextView textCast = (TextView) view.findViewById(R.id.textView2);

        String movie = movies[position];
        String castName = cast[position];

        textMovie.setText(movie);
        textCast.setText(castName);
        return view;
    }
}
