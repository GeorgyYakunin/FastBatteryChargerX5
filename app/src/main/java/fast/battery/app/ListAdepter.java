package fast.battery.app;

import android.app.Activity;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdepter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] detail_name;
    private final String[] detail_value;
    private final Integer[] detailImage;

    public ListAdepter(Activity context, String[] detail_name, String[] detail_value, Integer[] detailImage) {
        super(context, R.layout.details_list, detail_name);
        this.context = context;
        this.detail_name = detail_name;
        this.detailImage = detailImage;
        this.detail_value = detail_value;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.details_list, null, true);


        ImageView detailImageView = (ImageView) rowView.findViewById(R.id.detailImageView);
        TextView text_detail_name = (TextView) rowView.findViewById(R.id.text_detail_name);
        TextView text_detail_value = (TextView) rowView.findViewById(R.id.text_detail_value);
        CardView card = (CardView) rowView.findViewById(R.id.about_1);

        text_detail_name.setText(detail_name[position]);
        text_detail_value.setText(detail_value[position]);
        detailImageView.setImageResource(detailImage[position]);
        card.setCardBackgroundColor(context.getResources().getColor(R.color.cardcolor));
        card.setCardElevation(0);

        return rowView;
    }
}