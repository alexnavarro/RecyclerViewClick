package recyclervivew.alexandrenavarro.com.br.recyclerviewclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)

        String myDataset[] = new String[]{"Example item %s on recyclerview",
                "Example item %s on recyclerview", "Example item %s on recyclerview",
                "Example item %s on recyclerview", "Example item %s on recyclerview",
                "Example item %s on recyclerview", "Example item %s on recyclerview",
                "Example item %s on recyclerview", "Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview",
                "Example item %s on recyclerview","Example item %s on recyclerview"};

        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.recycler_view_click_holder) {
            startActivity(new Intent(getApplicationContext(), ClickInHolderActivity.class));
        } else if (item.getItemId() == R.id.recycler_view_click_on_create_view_holder) {
            startActivity(new Intent(getApplicationContext(), ClickOnCreateViewHolderActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
