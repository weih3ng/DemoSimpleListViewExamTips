package sg.edu.rp.c346.id22005564.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] ExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewExamTips);


        ExamTips = new String[3];
        ExamTips[0] = "tip1";
        ExamTips[1] = "tip2";
        ExamTips[2] = "tip3";
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ExamTips);
        lvExamTips.setAdapter(adapter);
    }
}