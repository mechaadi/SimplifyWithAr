package a7aent.com.simplifywithar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import a7aent.com.simplifywithar.chemistry.Water;
import a7aent.com.simplifywithar.chemistry.fullerene;
import a7aent.com.simplifywithar.chemistry.fullereneSphere;

public class MenuActivity extends AppCompatActivity {

    private CardView anatomy, earth, fsphere, ftube, water;
    private Button cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        anatomy = findViewById(R.id.anatomy);
        earth = findViewById(R.id.earth);
        fsphere = findViewById(R.id.fsphere);
        ftube = findViewById(R.id.ftube);
        water = findViewById(R.id.water);

        cloud = findViewById(R.id.cloud);


        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        anatomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Skeleton.class));
            }
        });

        earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), earth.class));
            }
        });

        ftube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), fullerene.class));
            }
        });

        fsphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), fullereneSphere.class));
            }
        });

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Water.class));
            }
        });

    }
}
