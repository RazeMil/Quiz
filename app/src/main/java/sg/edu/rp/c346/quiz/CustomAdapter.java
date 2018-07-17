package sg.edu.rp.c346.quiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<MathItem> MathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        MathList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        MathItem currentItem = MathList.get(position);

        String name = currentItem.getName();
        String formula = currentItem.getFormula();
        String type = currentItem.getType();

        tvName.setText(name);
        tvFormula.setText(formula);
        tvType.setText(type);
        return rowView;
    }
}
