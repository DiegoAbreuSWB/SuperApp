package maps.superapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class ItensAcougue extends ActionBarActivity {


    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private CardView cardView;

    private ArrayList<FeddProperties> os_versions;

    private RecyclerView.Adapter mAdapter;
    // private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itens_acougue);
        initContrls();
    }


    private void initContrls() {

        //  toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  cardView = (CardView) findViewById(R.id.cardList);
        recyclerView = (RecyclerView) findViewById(R.id.acougue_recy);

        //if (toolbar != null) {
        //  setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Android Versions");

//        }

        final String[] versions = {"Carne 1","Carne 2","Carne 3","Carne 4","Carne 5","Carne 6","Carne 7","Carne 8"};

        final int[] icons = {R.drawable.steak,R.drawable.steak,R.drawable.steak,R.drawable.steak
                            ,R.drawable.steak,R.drawable.steak,R.drawable.steak,R.drawable.steak

        };
        final String[] precos = {"R$ 30,00","R$ 28,00","R$ 31,00","R$ 29,00","R$ 30,00","R$ 28,00","R$ 31,00","R$ 29,00"};




        os_versions = new ArrayList<FeddProperties>();

        for (int i = 0; i < versions.length; i++) {
            FeddProperties feed = new FeddProperties();

            feed.setTitle(versions[i]);
            feed.setThumbnail(icons[i]);
            feed.setPreco(precos[i]);

            os_versions.add(feed);
        }

        recyclerView.setHasFixedSize(true);

        // ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // create an Object for Adapter
       // mAdapter = new CardViewDataAdapter(os_versions);
        mAdapter = new ItemCard(os_versions);

        // set the adapter object to the Recyclerview
        recyclerView.setAdapter(mAdapter);


    }

}









