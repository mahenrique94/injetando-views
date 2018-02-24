package blog.matheuscastiglioni.com.br.injetando_views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_nome;
    private Button btn_ola;
    private TextView tv_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn_ola = findViewById(R.id.btn_ola);
        this.et_nome = findViewById(R.id.et_nome);
        this.tv_nome = findViewById(R.id.tv_nome);

        this.btn_ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!et_nome.getText().toString().equals("")) {
                    tv_nome.setText(String.format("Olá %s", et_nome.getText().toString()));
                }
            }
        });
    }

}
