package pe.edu.idat.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.edu.idat.appintents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private static final int btnlist =  R.id.btnlistado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnregistro.setOnClickListener(this);
        binding.btnlistado.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == binding.btnlistado.getId()){
            startActivity(new Intent(
                    MainActivity.this,
                    ListaActivity.class
            ));
        }else if(v.getId() == binding.btnregistro.getId()){
            startActivity(new Intent(
                    MainActivity.this,
                    RegistroActivity.class
            ));
        }else {
            Toast.makeText(this, "Opción no encontrada",
                    Toast.LENGTH_SHORT).show();
        }

    }
}