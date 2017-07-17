package com.example.bezier.view.shouhui;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bezier.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;

public class ShouhuiActivity extends AppCompatActivity implements View.OnClickListener {

    private HandDrawView handDrawView;
    private Button clear, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouhui);

        handDrawView = (HandDrawView) findViewById(R.id.handView);
        clear = (Button) findViewById(R.id.iv_btn_clear);
        save = (Button) findViewById(R.id.iv_btn_save);
        clear.setOnClickListener(this);
        save.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_btn_clear:
                handDrawView.clear();
                break;

            case R.id.iv_btn_save: {
                try {
                    String sdState = Environment.getExternalStorageState(); // 判断sd卡是否存在
                    // 检查SD卡是否可用
                    if (!sdState.equals(android.os.Environment.MEDIA_MOUNTED)) {
                        Toast.makeText(this, "SD卡未准备好！", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    //获取系统图片存储路径
                    File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                    // Make sure the Pictures directory exists.
                    path.mkdirs();
                    //根据当前时间生成图片名称
                    Calendar c = Calendar.getInstance();
                    String name = ""
                            + c.get(Calendar.YEAR) + c.get(Calendar.MONTH) + c.get(Calendar.DAY_OF_MONTH)
                            + c.get(Calendar.HOUR_OF_DAY) + c.get(Calendar.MINUTE) + c.get(Calendar.SECOND)
                            + ".png";
                    //合成完整路径，注意 / 分隔符
                    String string = path.getPath() + "/" + name;
                    handDrawView.saveToFile(string);
                    Toast.makeText(this, "保存成功！\n文件保存在：" + string, Toast.LENGTH_LONG).show();
                } catch (FileNotFoundException e) {
                    Toast.makeText(this, "保存失败！\n" + e, Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
    }
}
