package id.ac.poliban.mi.andre.makanannusantara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Food> foods = new ArrayList<>();
    private ListView lvFood;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFood = findViewById(R.id.listview);

        foods.addAll(FoodData.getFoodList());

        adapter = new FoodAdapter(foods);

        lvFood.setAdapter(adapter);

        lvFood.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(foods.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }

}
