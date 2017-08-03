package rmu.it.assing6_324;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    ListView listView;
    String data[] = {"อาจารย์วีระพน ภานุรักษ์","อาจารย์บัณฑิต สุวรรณโท","อาจารย์ภาสกร ธนศิระธรรม","อาจารย์มณีรัตน์ ผลประเสริฐ","อาจารย์ชเนตตี พิมพ์สวรรค์","อาจารย์เดือนเพ็ญ ภานุรักษ์","อาจารย์วงษ์ปัญญา นวนแก้ว","อาจารย์วรวิทย์ สังฆทิพย์","อาจารย์จารุกิตติ์ สายสิงห์"};
    String add[] = {"- ","ภาษาโปรแกรมมิ่ง PHP, C, C++","PHP","Java, PHP","ด้านระบบและเทคโนโลยีสารสนเทศ","-","php","Android Development"," VB.NET "};
    String call[] = {"088-563-2966","086-852-8535","085-693-1354","081-282-3745","083-415-4595","088-560-8366","089-419-7129","08 5005 5602","087-952-3903"};
    int img[] = {R.drawable.v,R.drawable.bandit,R.drawable.skan,R.drawable.manee,R.drawable.snat,R.drawable.denpan,R.drawable.ving,R.drawable.tam,R.drawable.o};


    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view = inflater.inflate(R.layout.fragment_two, container, false);

        listView = (ListView) root_view.findViewById(R.id.lvmenu);

        MyAdapter adapter = new MyAdapter(data, img, getContext());
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String s = data[i].toString();
                String a = add[i].toString();
                String c = call[i].toString();
                int i1 = img[i];

                Toast.makeText(getContext(), img[i],Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), data[i],Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), add[i],Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), call[i],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), ShowActivity.class);
                intent.putExtra("I", i1);
                intent.putExtra("S", s);
                intent.putExtra("A", a);
                intent.putExtra("C", c);


                startActivity(intent);
            }
        });


        return root_view;
    }

}
