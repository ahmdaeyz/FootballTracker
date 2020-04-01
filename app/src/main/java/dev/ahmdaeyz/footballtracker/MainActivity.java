package dev.ahmdaeyz.footballtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int firstTeamGoals = 0;
    private int secondTeamGoals = 0;
    private int firstTeamTargets = 0;
    private int secondTeamTargets = 0;
    private int firstTeamOffsides = 0;
    private int secondTeamOffsides = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addGoal(View view){
        switch (view.getId()){
            case R.id.first_team_controls_goal_add:
                TextView first = findViewById(R.id.first_team_goals_text);
                first.setText(""+firstTeamGoals++);
                break;
            case R.id.second_team_controls_goal_add:
                TextView second = findViewById(R.id.second_team_goals_text);
                second.setText(""+secondTeamGoals++);
                break;

        }
    }
    public void addTarget(View view){
        switch (view.getId()){
            case R.id.first_team_controls_target_add:
                TextView first = findViewById(R.id.first_team_onTarget_text);
                first.setText(""+firstTeamTargets++);
                break;
            case R.id.second_team_controls_target_add:
                TextView second = findViewById(R.id.second_team_onTarget_text);
                second.setText(""+secondTeamTargets++);
                break;
        }
    }
    public void addOffside(View view){
        switch (view.getId()){
            case R.id.first_team_controls_offsides_add:
                TextView first = findViewById(R.id.first_team_offsides_text);
                first.setText(""+firstTeamOffsides++);
                break;
            case R.id.second_team_controls_offsides_add:
                TextView second = findViewById(R.id.second_team_offsides_text);
                second.setText(""+secondTeamOffsides++);
                break;
        }
    }
    public void removeGoal(View view){
        switch (view.getId()){
            case R.id.first_team_controls_goal_remove:
                TextView first = findViewById(R.id.first_team_goals_text);
                if(firstTeamGoals>0){
                    first.setText(""+firstTeamGoals--);
                }else{
                    first.setText(""+0);
                }
                break;

            case R.id.second_team_controls_goal_remove:
                TextView second = findViewById(R.id.second_team_goals_text);
                if(secondTeamGoals>0){
                    second.setText(""+secondTeamGoals--);
                }else{
                    second.setText(""+0);
                }
                break;

        }
    }
    public void removeTarget(View view){
        switch (view.getId()){
            case R.id.first_team_controls_target_remove:
                TextView first = findViewById(R.id.first_team_onTarget_text);
                if(firstTeamTargets>0){
                    first.setText(""+firstTeamTargets--);
                }else{
                    first.setText(""+0);
                }
                break;

            case R.id.second_team_controls_target_remove:
                TextView second = findViewById(R.id.second_team_onTarget_text);
                if(secondTeamTargets>0){
                    second.setText(""+secondTeamTargets--);
                }else{
                    second.setText(""+0);
                }
                break;
        }
    }
    public void removeOffside(View view){
        switch (view.getId()){
            case R.id.first_team_controls_offsides_remove:
                TextView first = findViewById(R.id.first_team_offsides_text);
                if(firstTeamOffsides>0){
                    first.setText(""+firstTeamOffsides--);
                }else{
                    first.setText(""+0);
                }
                break;
            case R.id.second_team_controls_offsides_remove:
                TextView second = findViewById(R.id.second_team_offsides_text);
                if(secondTeamOffsides>0){
                    second.setText(""+secondTeamOffsides--);
                }else{
                    second.setText(""+0);
                }
                break;
        }
    }
    public void resetScores(View view){
        TextView firstGoals = findViewById(R.id.first_team_goals_text);
        TextView secondGoals = findViewById(R.id.second_team_goals_text);
        TextView firstTargets = findViewById(R.id.first_team_onTarget_text);
        TextView secondTargets = findViewById(R.id.second_team_onTarget_text);
        TextView firstOffsides = findViewById(R.id.first_team_offsides_text);
        TextView secondOffsides = findViewById(R.id.second_team_offsides_text);
        firstTeamGoals = 0;
        secondTeamGoals = 0;
        firstTeamTargets = 0;
        secondTeamTargets = 0;
        firstTeamOffsides = 0;
        secondTeamOffsides =0;
        firstGoals.setText(""+0);
        secondGoals.setText(""+0);
        firstTargets.setText(""+0);
        secondTargets.setText(""+0);
        firstOffsides.setText(""+0);
        secondOffsides.setText(""+0);
    }
}
