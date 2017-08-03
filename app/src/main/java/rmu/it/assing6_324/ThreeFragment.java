package rmu.it.assing6_324;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragment extends Fragment {

    EditText edttheename, edtthreemail;
    Button btdOK;



    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root_view = inflater.inflate(R.layout.fragment_three, container, false);

        edttheename = (EditText) root_view.findViewById(R.id.edtTherrName);
        edtthreemail = (EditText) root_view.findViewById(R.id.edtThreeMail);
        btdOK = (Button) root_view.findViewById(R.id.btdOK);

        btdOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String mailname = edttheename.getText().toString();
                Toast.makeText(getContext(),"",Toast.LENGTH_LONG).show();
                String mail = edtthreemail.getText().toString();
                Toast.makeText(getContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getContext(), MailActivity.class);
                intent.putExtra("MAILNAME",mailname);
                intent.putExtra("MAIL", mail);
                startActivity(intent);

            }
        });


        return root_view;
    }

    }

