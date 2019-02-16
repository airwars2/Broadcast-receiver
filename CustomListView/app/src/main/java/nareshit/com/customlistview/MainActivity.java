package nareshit.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeListView();
    }

    private void initializeListView() {
        listView = (ListView) findViewById(R.id.listView);

        String[] movies = {"Batman Triology", "Harry Potter", "Braveheart", "The Patriot", "Pompeii", "Fast and Furious",
                "Die Hard", "The Fifth element", "X-Men", "Transformers", "Steve Jobs"};

        String[] cast = {"Christian Bale", "Daniel Radcliffe", "Mel Gibson", "Mel Gibson", "Kit Harington", "Paul Walker",
                "Bruce Willis", "Bruce Willis", "James McAvoy", "Sam Witwicky", "Michael fasbender"};

        MyAdapter adapter = new MyAdapter(this, movies, cast);

        listView.setAdapter(adapter);
    }
}
