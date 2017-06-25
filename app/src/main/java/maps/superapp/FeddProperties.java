package maps.superapp;

import android.widget.Button;

/**
 * Created by diegoabreu on 24/06/2017.
 */

public class FeddProperties {


    private String title;
    private int thumbnail;
    private String preco;
    private Button btn_add;

    public Button getBtn_add() {
        return btn_add;
    }

    public void setBtn_add(Button btn_add) {
        this.btn_add = btn_add;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

}

