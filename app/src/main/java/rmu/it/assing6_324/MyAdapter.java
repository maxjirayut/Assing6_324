package rmu.it.assing6_324;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 3/8/2560.
 */

public class MyAdapter extends BaseAdapter {

    String data[];
    int img[];
    Context ct;

    public MyAdapter(String data[], int img[], Context ct) {
        this.data = data;
        this.img = img;
        this.ct = ct;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(R.layout.itam_layout, viewGroup, false);

        ImageView imvPic = (ImageView) view.findViewById(R.id.imvPic);
        TextView tvItem = (TextView) view.findViewById(R.id.tvItam);

        imvPic.setImageResource(img[i]);
        tvItem.setText(data[i]);

        return view;
    }
}
