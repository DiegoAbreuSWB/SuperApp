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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemCard extends RecyclerView.Adapter<ItemCard.ViewHolder> {

    private static ArrayList<FeddProperties> dataSet;

    public ItemCard(ArrayList<FeddProperties> os_versions) {

        dataSet = os_versions;
    }


    @Override
    public ItemCard.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
// create a new view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.iten_card_view, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemCard.ViewHolder viewHolder, int i) {

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
        public TextView preco; //**
        public Button  btn_add;

        public ViewHolder(final View itemLayoutView) {
            super(itemLayoutView);

            tvVersionName = (TextView) itemLayoutView
                    .findViewById(R.id.tvVersionName);

            preco= (TextView) itemLayoutView.findViewById(R.id.preco);
            btn_add=(Button) itemLayoutView.findViewById(R.id.btn_add);

            iconView = (ImageView) itemLayoutView
                    .findViewById(R.id.iconId);


            btn_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),TodoList.class);
                    intent.putExtra("title", feed.getTitle() );

                    v.getContext().startActivity(intent);

                   // Toast.makeText(v.getContext(), "preco clicado foi: " + feed.getTitle(), Toast.LENGTH_SHORT).show();
                    //Quero Ibagens ! feed.getThumbnail()

                    //Ai comeca a salvar a lista
                }
            });






/*
            itemLayoutView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      Intent intent = new Intent(v.getContext(),ItensAcougue.class);
                    v.getContext().startActivity(intent);
                    //Toast.makeText(v.getContext(), "Categoria Clicada Foi: " + feed.getTitle(), Toast.LENGTH_SHORT).show();
                    //}

                }
            });
*/

        }

    }
}
