package android.example.com.putri_1202154293;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button Login = (Button) findViewById(R.id.btLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("EAD") && password.equals("MOBILE")){
                    Intent intent = new Intent(Login.this, CardView.class);
                    intent.putExtra("etUsername", etUsername.getText().toString());
                    intent.putExtra("etPassword", etPassword.getText().toString());
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(),"Login Sukses", Toast.LENGTH_SHORT).show();

                    Login.this.startActivity(intent);

                }else{
                    //Jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password anda salah..!!!")
                            .setNegativeButton("Retry", null).create().show();

                }

            }
        });
    }



}
