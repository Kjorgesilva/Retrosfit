package com.example.retrosfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.retrosfit.model.Login;
import com.example.retrosfit.webService.configuracaoWs;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private EditText edt_login, edt_senha;
    private Button btn_enviar, btn_buscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindView();
        Onclick();

    }

    public void FindView() {
        edt_login = findViewById(R.id.edt_login);
        edt_senha = findViewById(R.id.edt_senha);
        btn_enviar = findViewById(R.id.btn_enviar);
        btn_buscar = findViewById(R.id.btn_buscar);

    }

    public void Onclick() {

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configuracaoWs githubUser = configuracaoWs.retrofit.create(configuracaoWs.class);
                final Call<Login> call = githubUser.getUsuario("user");


                call.enqueue(new Callback<Login>() {
                    @Override
                    public void onResponse(Response<Login> response, Retrofit retrofit) {

                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });

            }
        });
    }

}
