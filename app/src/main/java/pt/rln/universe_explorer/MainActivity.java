package pt.rln.universe_explorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setStartUpWorldValues();

    }

    protected void setStartUpWorldValues(){
        WorldGen earth = new WorldGen("Earth", 5973, 9.78);
        earth.setPlanetColonies(1);
        setStartUpScreenText(earth);
    }

    private void setStartUpScreenText(WorldGen world){
        TextView planetNameValue = this.findViewById(R.id.dataView1);
        planetNameValue.setText(world.getPlanetName());

        TextView planetMassValue = this.findViewById(R.id.dataView2);
        planetMassValue.setText(String.valueOf(world.getPlanetMass()));

        TextView planetGravity = this.findViewById(R.id.dataView3);
        planetGravity.setText(String.valueOf(world.getPlanetGravity()));

        TextView planetColonies = this.findViewById(R.id.dataView4);
        planetColonies.setText(String.valueOf(world.getPlanetColonies()));

        TextView planetPopulation = this.findViewById(R.id.dataView5);
        planetPopulation.setText(String.valueOf(world.getColonyImmigration()));

        TextView planetMilitary = this.findViewById(R.id.dataView6);
        planetMilitary.setText(String.valueOf(world.getBaseProtection()));

        TextView planetBases = this.findViewById(R.id.dataView7);
        planetBases.setText(String.valueOf(world.getPlanetMilitary()));

        TextView planetForcefield = this.findViewById(R.id.dataView8);
        planetForcefield.setText(String.valueOf(world.getForceFieldState()));

    }

    public void seePhotos(View view) {

        Intent intent = new Intent(this, GridViewPhotos.class);
        this.startActivity(intent);

    }
}
