package maps.superapp;

/**
 * Created by diegoabreu on 24/06/2017.
 */
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class CardViewDataAdapter extends RecyclerView.Adapter<CardViewDataAdapter.ViewHolder> {

    private static ArrayList<FeddProperties> dataSet;

    public CardViewDataAdapter(ArrayList<FeddProperties> os_versions) {

        dataSet = os_versions;
    }


    @Override
    public CardViewDataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
// create a new view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.card_view, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewDataAdapter.ViewHolder viewHolder, int i) {

        FeddProperties fp = dataSet.get(i);

        viewHolder.tvVersionName.setText(fp.getTitle());
        viewHolder.iconView.setImageResource(fp.getThumbnail());
        viewHolder.feed = fp;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvVersionName;
        public ImageView iconView;

        public FeddProperties feed;

        public ViewHolder(final View itemLayoutView) {
            super(itemLayoutView);

            tvVersionName = (TextView) itemLayoutView
                    .findViewById(R.id.tvVersionName);
            iconView = (ImageView) itemLayoutView
                    .findViewById(R.id.iconId);

            itemLayoutView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int y=0;
                    //int y = v.getId();
                   // int x= itemLayoutView.getId();
                    // String z=  feed.getTitle();
                    //Toast.makeText(v.getContext(), "X: " + x, Toast.LENGTH_SHORT).show();
                    //Toast.makeText(v.getContext(), "Y: " + y, Toast.LENGTH_SHORT).show();
                    //if(x.equals('ACOUGUE')) {
                    //  y = 1;
                    // Toast.makeText(v.getContext(), "Y: " + y, Toast.LENGTH_SHORT).show();
                    //}
                    //Toast.makeText(v.getContext(), "Y: " + y, Toast.LENGTH_SHORT).show();
                    // if(???"ACOUGUE" )) { TA ERRADO ISSO
                    Intent intent = new Intent(v.getContext(),ItensAcougue.class);
                    v.getContext().startActivity(intent);
                    //Toast.makeText(v.getContext(), "Categoria Clicada Foi: " + feed.getTitle(), Toast.LENGTH_SHORT).show();
                    //}

                }
            });


        }

    }
}
