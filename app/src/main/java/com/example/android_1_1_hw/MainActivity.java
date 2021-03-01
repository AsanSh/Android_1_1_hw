package com.example.android_1_1_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    Создаете два экрана, в первом экране должна быть ImageView, TextView
//    и две кнопки , во втором экране создаете ImageView, EditText и одна кнопка
//
//    Флоу задания:
//
//    Done      - При нажатии на кнопку в первом экране,идет переход во второй экран,
//    Done      - Во втором экране вы заполняете Editext ,
//    Done      - Далее кликаете по иконке и при нажатии на иконку должен быть переход в галерею, выбираете фото,
//    Not done  - Возвращаетесь в экран и отправляете результат в первый экран,
//    Not done  - В первом экране отображете результат +
//    Частично  - кликаете по второй кнопке и должен быть переход в gmail с полученными вами текстом


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}