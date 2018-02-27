package blog.matheuscastiglioni.com.br.injetando_views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOla = findViewById(R.id.btn_ola);
        final EditText etNome = findViewById(R.id.et_nome);
        final TextView tvNome = findViewById(R.id.tv_nome);

        btnOla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = etNome.getText().toString();
                if (nome.equals("")) {
                    etNome.setError("Campo obrigatório");
                } else {
                    String mensagemDeOla = "Olá " + nome;
                    tvNome.setText(mensagemDeOla);
                }
            }
        });
    }

}
