package maps.superapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private CardView cardView;

    private ArrayList<FeddProperties> os_versions;

    private RecyclerView.Adapter mAdapter;
    // private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        initContrls();
    }

    private void initContrls() {

    //    toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  cardView = (CardView) findViewById(R.id.cardList);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

//        if (toolbar != null) {
  //          setSupportActionBar(toolbar);
    //        getSupportActionBar().setTitle("Android Versions");

      //  }

        //final String[] versions = {"ACOUGUE ", "PEIXARIA", "BEBIDAS", "COMBUSTIVEIS",
          //      "CONGELADOS", "FRIOS E LATICINIOS", "HIGIENE E BELEZA", "HORTIFRUTI",
            //    "LIMPEZA", "MERCEARIA", "PADARIA E CONFEITARIA"};
        final String[] versions = {"ACOUGUE ", "PEIXARIA",
              };

        final int[] icons = {R.drawable.ic_acougue, R.drawable.ic_pescado};


        os_versions = new ArrayList<FeddProperties>();

        for (int i = 0; i < versions.length; i++) {
            FeddProperties feed = new FeddProperties();

            feed.setTitle(versions[i]);
            feed.setThumbnail(icons[i]);
            os_versions.add(feed);
        }

        recyclerView.setHasFixedSize(true);

        // ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Grid View
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2,1,false));

        //StaggeredGridView
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));

        // create an Object for Adapter
        mAdapter = new CardViewDataAdapter(os_versions);

        // set the adapter object to the Recyclerview
        recyclerView.setAdapter(mAdapter);

    }


}
