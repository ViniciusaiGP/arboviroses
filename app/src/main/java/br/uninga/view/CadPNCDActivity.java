package br.uninga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.uninga.R;
//import br.uninga.model.CadPNCD;
//import br.uninga.repository.CadPNCDRepository;
import br.uninga.utils.TagForm;

public class CadPNCDActivity extends AppCompatActivity {

    public static TagForm tagForm;
    public static CadPNCD cadPNCD;

    Button btnSalvar;
    Button btnCancelar;
    EditText edtId;
    EditText edtData;
    EditText edtHora;
    EditText edtA1;
    EditText edtA2;
    EditText edtBB;
    EditText edtCC;
    EditText edtD1;
    EditText edtD2;
    EditText edtEE;
    EditText edtTipo01;
    EditText edtQuantidade01;
    EditText edtTipo02;
    EditText edtQuantidade02;
    EditText edtTipoDeImovel;
    EditText edtNumero;
    EditText edtComplemento;
    EditText edtSequencia;
    EditText edtNumeroDeMoradores;
    EditText edtTelefoneResidencial;
    EditText edtTelefoneRecado;
    EditText edtNomeMorador;
    EditText edtCpf;
    EditText edtDataNascimento;
    EditText edtNumerodoCartaoSus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pncdactivity);

        btnSalvar = findViewById(R.id.btnSalvarPNCD);
        btnCancelar = findViewById(R.id.btnCancelarPNCD);

        edtId.findViewById(R.id.edtIdPNCDCad);
        edtData.findViewById(R.id.edtPNCDDataCad);
        edtHora.findViewById(R.id.edtPNCDHoraCad);
        edtA1.findViewById(R.id.edtPNCDA1Cad);
        edtA2.findViewById(R.id.edtPNCDA2Cad);
        edtBB.findViewById(R.id.edtPNCDBCad);
        edtCC.findViewById(R.id.edtPNCDCCad);
        edtD1.findViewById(R.id.edtPNCDD1Cad);
        edtD2.findViewById(R.id.edtPNCDD2Cad);
        edtEE.findViewById(R.id.edtPNCDECad);
        edtTipo01.findViewById(R.id.edtPNCDTipo01Cad);
        edtQuantidade01.findViewById(R.id.edtPNCDQuantidade01Cad);
        edtTipo02.findViewById(R.id.edtPNCDTipo02Cad);
        edtQuantidade02.findViewById(R.id.edtPNCDQuantidade02Cad);
        edtTipoDeImovel.findViewById(R.id.edtPNCDTipoDeImovelCad);
        edtNumero.findViewById(R.id.edtPNCDNumeroCad);
        edtComplemento.findViewById(R.id.edtPNCDComplementoCad);
        edtSequencia.findViewById(R.id.edtPNCDSequenciaCad);
        edtNumeroDeMoradores.findViewById(R.id.edtPNCDNumeroDeMoradoresCad);
        edtTelefoneResidencial.findViewById(R.id.edtPNCDTelefoneResidencialCad);
        edtTelefoneRecado.findViewById(R.id.edtPNCDTelefoneRecadoCad);
        edtNomeMorador.findViewById(R.id.edtPNCDNomeMoradorCad);
        edtCpf.findViewById(R.id.edtPNCDCPFCad);
        edtDataNascimento.findViewById(R.id.edtPNCDDataNascimentoCad);
        edtNumerodoCartaoSus.findViewById(R.id.edtPNCDNumerodoCartaoSusCad);

    }
}