package recyclervivew.alexandrenavarro.com.br.recyclerviewclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/**
 * Created by alexandrenavarro on 4/5/16.
 */
public class RecyclerOnTouchExampleActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_in_holder);

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

        mAdapter = new RecyclerOnTouchExampleAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Clicked item " + (position + 1), Toast.LENGTH_SHORT).show();
            }
        }));

        setTitle("OnTouch Example");
    }
}
