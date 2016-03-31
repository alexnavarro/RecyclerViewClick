package recyclervivew.alexandrenavarro.com.br.recyclerviewclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by alexandrenavarro on 3/31/16.
 */
public class ClickOnCreateViewHolderActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_on_create_view_holder);

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

        mAdapter = new ClickOnCreateViewHolderAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        setTitle("onClickListener in onCreateViewHolder class");
    }
}
