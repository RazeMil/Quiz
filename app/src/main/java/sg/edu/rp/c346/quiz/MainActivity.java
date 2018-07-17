package sg.edu.rp.c346.quiz;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;

    ArrayList<MathItem> alMathItem;
    CustomAdapter caMathItem;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.listViewMath);

        alMathItem = new ArrayList<>();
        MathItem formula1 = new MathItem("Area of rectangle","Length x Length","Formula type is: Area");
        MathItem formula2 = new MathItem("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        MathItem formula3 = new MathItem("Volume of Cube","Length x Length x Length","Formula type is: Volume");

        alMathItem.add(formula1);
        alMathItem.add(formula2);
        alMathItem.add(formula3);

        caMathItem = new CustomAdapter(this,R.layout.math_item,alMathItem);

        lvMath.setAdapter(caMathItem);
    }
}
