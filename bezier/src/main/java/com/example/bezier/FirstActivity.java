package com.example.bezier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.Toast;

import com.example.bezier.view.EditTextCanClean;

public class FirstActivity extends AppCompatActivity {

    private EditTextCanClean etCanClean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etCanClean = (EditTextCanClean) findViewById(R.id.et_account);

        //测试代码设置文字方法
        etCanClean.setText("飒飒");    //有效

        //测试代码设置清除图标样式
        etCanClean.setCleanIcon(R.mipmap.ic_launcher);    //有效

        //获取自定义空间中EditText进行特殊属性设置
        etCanClean.getEditText().setInputType(InputType.TYPE_CLASS_PHONE);   //有效

        //setBackground方法也是可用的，因为EditTextCanClean继承LinearLayout
        //etCanClean.setBackgroundResource(R.drawable.xx);

        Toast.makeText(this, etCanClean.getText(), Toast.LENGTH_SHORT).show();
    }
}
