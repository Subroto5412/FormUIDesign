package com.trining.formuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var teacherNameEd = findViewById<EditText>(R.id.nameEd)
        var designationEd = findViewById<EditText>(R.id.designationEd)
        var departmentEd = findViewById<EditText>(R.id.departmentEd)

        findViewById<Button>(R.id.saveBtn).setOnClickListener {

            if (teacherNameEd.text.toString().isNullOrEmpty()) {
                Toast.makeText(this,"Please, Enter Teacher Name",Toast.LENGTH_LONG).show()
            } else if (designationEd.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Please, Enter Designation",Toast.LENGTH_LONG).show()
            }else if (departmentEd.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Please, Enter Department", Toast.LENGTH_LONG).show()
            }else
            {
                Toast.makeText(this,"Save Successfully", Toast.LENGTH_LONG).show()
            }
        }

    }
}