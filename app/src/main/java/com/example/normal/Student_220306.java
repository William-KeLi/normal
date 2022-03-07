package com.example.normal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Student_220306 extends AppCompatActivity implements View.OnClickListener{
    private EditText etname,etsex,etage,ethobby;
    TextView textView,neirong;
    Button button;
    private String name;
    private String sex;
    private int age;
    private String hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Student_220306() {
    }

    public Student_220306(String name, String sex, int age,String hobbies) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobbies=hobbies;

    }

    @Override
    public String toString() {
        return "名字"+name+"\n"+"性别"+sex+"\n"+"年龄"+age+"\n"+"兴趣"+hobbies;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student220306);
        init();
    }
    private void init(){
        etage=(EditText) findViewById(R.id.et_age);
        etname=(EditText) findViewById(R.id.et_name);
        ethobby=(EditText) findViewById(R.id.et_hobby);
        etsex=(EditText) findViewById(R.id.et_sex);
        textView=(TextView) findViewById(R.id.tv_title);
        neirong=(TextView) findViewById(R.id.neirong);
        button=(Button) findViewById(R.id.tijiao);
        button.setOnClickListener(this);
    }
   // class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.tijiao){
                Student_220306 s1=new Student_220306(etname.getText().toString().trim(),etsex.getText().toString().trim(),
                        Integer.parseInt(etage.getText().toString().trim()),ethobby.getText().toString().trim());
                if (!s1.name.isEmpty()&&!s1.hobbies.isEmpty()&&!s1.sex.isEmpty()&&!Integer.toString(age).isEmpty()){
                neirong.setText(s1.toString());
                }else {
                    neirong.setText("内容不能为空");
                }
            }
        }
    }

