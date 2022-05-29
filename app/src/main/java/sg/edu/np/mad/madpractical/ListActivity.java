package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import sg.edu.np.mad.madpractical.MainActivity;
import sg.edu.np.mad.madpractical.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView popup = findViewById(R.id.imageView);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab = new AlertDialog.Builder(ListActivity.this);
                ab.setTitle("Profile");
                ab.setMessage("MADness");
                ab.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(100);

                        Intent i = new Intent(ListActivity.this, MainActivity.class);

                        // PASS INFO TO NEXT PAGE
                        i.putExtra("randInt", randomNumber);
                        startActivity(i);
                    }
                });
                ab.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });

                ab.show();
            }
        });
    }


}