package br.uninga.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.uninga.R;
import br.uninga.adapters.BairroAdapter;
import br.uninga.model.Bairro;
import br.uninga.repository.BairroRepository;
import br.uninga.utils.TagForm;

public class ListaBairroActivity extends AppCompatActivity {


    Button btnNovoBairro;
    BairroRepository bairroRepository;
    ListView lvBairros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bairro);

        bairroRepository = BairroRepository.getInstance(this);
        atualizaTela();

        lvBairros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final Bairro bairro = (Bairro)  parent.getItemAtPosition(position);

                AlertDialog alerta;
                AlertDialog.Builder builder = new AlertDialog.Builder(ListaBairroActivity.this);
                builder.setTitle("Cadastro de Bairro");
                builder.setMessage("Selecione uma opção!" );

                builder.setPositiveButton("Alterar".toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent( ListaBairroActivity.this, CadBairroActivity.class);
                        CadBairroActivity.tagForm = TagForm.A;
                        CadBairroActivity.bairro = bairro;
                        startActivity(intent);
                        atualizaTela();
                    }
                });

                builder.setNeutralButton("Excluir".toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        bairroRepository.remover(bairro);
                        atualizaTela();
                    }
                });

                alerta = builder.create();
                alerta.show();
                atualizaTela();

            }
        });


        btnNovoBairro = findViewById(R.id.btnNovoBairro);
        btnNovoBairro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ListaBairroActivity.this, CadBairroActivity.class);
                CadBairroActivity.tagForm = TagForm.I;
                startActivity(intent);
            }
        });

    }

    public void atualizaTela(){
        List<Bairro> bairros = bairroRepository.getAll();
        lvBairros = findViewById(R.id.lvBairros);
        ArrayAdapter ad = new BairroAdapter(this,R.layout.lista_bairros, bairros);
        lvBairros.setAdapter(ad);
    }

    @Override
    protected void onResume() {
        super.onResume();
        atualizaTela();
    }
}