package kz.education.stepclasswork2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.children

class MainActivity : AppCompatActivity() {

    var buttonSort: Button? = null;
    var buttonRandom: Button? = null;
    var layoutStudents: LinearLayout? = null;
    var students: StundentsUseCase? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeElements()
        initializeEventListeners()
    }

    fun initializeElements(){
        buttonSort = findViewById(R.id.activity_main_sort_students_button)
        buttonRandom = findViewById(R.id.activity_main_random_students_button)
        layoutStudents = findViewById(R.id.activity_main_layout_students_list)
        students = StundentsUseCase();
        fillStudentsLayout();
    }

    fun initializeEventListeners(){
        buttonSort?.setOnClickListener(View.OnClickListener {
            students?.sortSudents()
            fillStudentsLayout()
        })

        buttonRandom?.setOnClickListener(View.OnClickListener {
            students?.randomSudents()
            fillStudentsLayout()
        })
    }

    fun fillStudentsLayout(){
        layoutStudents?.removeAllViews();

        students?.getStudents()?.forEach {
            var textView : TextView = TextView(getApplicationContext());
            textView.setText(it);
            layoutStudents?.addView(textView);
        }
    }
}