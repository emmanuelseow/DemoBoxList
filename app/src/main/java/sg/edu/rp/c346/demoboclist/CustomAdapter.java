package sg.edu.rp.c346.demoboclist;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Color> coloursList;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        coloursList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        ImageView ivColour = rowView.findViewById(R.id.imageViewcolor);

        Color currentItem = coloursList.get(position);

        char check = currentItem.getColor();
        if (check =='O'){
            ivColour.setImageResource(R.drawable.orange_box);
        } else if (check =='B'){
            ivColour.setImageResource(R.drawable.blue_box);
        } else {
            ivColour.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }
}