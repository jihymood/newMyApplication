package com.example.bezier;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.Toast;

import com.example.bezier.view.EditTextCanClean;
import com.example.bezier.view.TaiJiView;

public class FirstActivity extends AppCompatActivity {

    private EditTextCanClean etCanClean;
    private TaiJiView taiJiView;

    final Handler handler = new Handler() {
        private float degrees = 0;

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    taiJiView.setRotate(degrees += 5);
                    this.sendEmptyMessageDelayed(0, 80);
                    break;
                default:
                    break;
            }
        }
    };


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



        /*太极旋转部分*/
        taiJiView = (TaiJiView) findViewById(R.id.taiji);
        handler.sendEmptyMessageDelayed(0, 20);
//        Message message = new Message();
//        message.what = 0;
//        handler.sendMessage(message);


        

    }
}
