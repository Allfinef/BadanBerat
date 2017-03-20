package id.sch.smktelkom_mlg.modul6_alfinef;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Submit, Hapus;
    EditText textNama, textTahun, textAlamat, textTelepon, textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit = (Button) findViewById(R.id.Submit);
        Hapus = (Button) findViewById(R.id.Hapus);
        textNama = (EditText) findViewById(R.id.textNama);
        textTahun = (EditText) findViewById(R.id.textTahun);
        textAlamat = (EditText) findViewById(R.id.textAlamat);
        textTelepon = (EditText) findViewById(R.id.textTelepon);
        textEmail = (EditText) findViewById(R.id.textEmail);

        Hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNama.setText("");
                textTahun.setText("");
                textAlamat.setText("");
                textTelepon.setText("");
                textEmail.setText("");
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = textNama.getText().toString();
                Integer tahun = Integer.parseInt(textTahun.getText().toString());
                String alamat = textAlamat.getText().toString();
                Integer telepon = Integer.parseInt(textTelepon.getText().toString());
                String email = textEmail.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", nama);
                b.putInt("parse_tahun", tahun);
                b.putString("parse_alamat", alamat);
                b.putInt("parse_telepon", telepon);
                b.putString("parse_email", email);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
