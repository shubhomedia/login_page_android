package info.shubho.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userET,passET;
    private  static final String USER = "admin";
    private  static final String PASS = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userET = findViewById(R.id.userET);
        passET = findViewById(R.id.passET);

    }

    public void login(View view) {
        String user = userET.getText().toString();
        String pass = passET.getText().toString();
        if (user.isEmpty()) {
            userET.setError("Empty Value");
        } else if (pass.isEmpty()) {
            passET.setError("Empty Value");
        }
        else {
            if (user.equals(USER)&& pass.equals(PASS)){
                Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Email or Pass Invalid", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
