package sg.edu.rp.c346.demoboclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<Color> alColourList;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewColor);
        alColourList = new ArrayList<>();
        Color clr1 = new Color('B');
        Color clr2 = new Color('O');
        Color clr3 = new Color('R');

        alColourList.add(clr1);
        alColourList.add(clr2);
        alColourList.add(clr3);

        caColour = new CustomAdapter(this, R.layout.row, alColourList);
        lvColour.setAdapter(caColour);
    }
}