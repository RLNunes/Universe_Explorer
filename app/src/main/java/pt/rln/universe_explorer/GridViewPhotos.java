package pt.rln.universe_explorer;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewPhotos extends AppCompatActivity {
    public static final String TITLE = "Image#";
    private GridView gridView;
    private GridViewAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridph);

        gridView = findViewById(R.id.gridViewph);
        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
        gridView.setAdapter(gridAdapter);
    }

    private ArrayList<ImageItem> getData(){
        ArrayList<ImageItem> imageItems = new ArrayList<>();

        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);

        for (int i = 0; i < imgs.length(); i++) {
            Resources res = getResources();
            int id = imgs.getResourceId(i, -1);

            Bitmap bitmap = BitmapFactory.decodeResource(res, id);

            imageItems.add(new ImageItem(bitmap, TITLE +i));
        }

        return imageItems;
    }
}
