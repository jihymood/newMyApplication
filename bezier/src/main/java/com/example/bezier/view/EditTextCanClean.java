package com.example.bezier.view;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.bezier.R;

/**
 * Created by HASEE on 2017/5/9 14:42
 * 组合控件 带删除按钮的输入框
 */

public class EditTextCanClean extends View {
    private EditText et;
    private ImageView img;


    public EditTextCanClean(Context context) {
        super(context);
    }

    public EditTextCanClean(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        int resourceId = -1;

        View view = LayoutInflater.from(context).inflate(R.layout.mould_layout, null);
        et = (EditText) view.findViewById(R.id.et);
        //给et添加输入内容变化的监听，控制清除按钮的显示与否
        et.addTextChangedListener(textWatcher);

        img = (ImageView) view.findViewById(R.id.imgClean);
        //初始无输入值时，清除按钮隐藏
        img.setVisibility(View.INVISIBLE);
        //清除按钮的点击响应
        img.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.EditTextCanClean);
        int n = ta.getIndexCount();
        for (int i = 0; i < n; i++) {
            int attr = ta.getIndex(i);
            switch (attr) {
                case R.styleable.EditTextCanClean_hint:
                    resourceId = ta.getResourceId(R.styleable.EditTextCanClean_hint, 0);
                    //若resourceId>0，说明读到hint设置为reference类型，则找到资源字段进行设置
                    //否则，说明读到为hint设置了String字段，获取从读到的字段中取出对应String设置给et
                    et.setHint(resourceId > 0 ? getResources().getText(resourceId) : ta.getString(R.styleable
                            .EditTextCanClean_hint));
                    break;
                //若读到text属性设置，否则走不到该case
                case R.styleable.EditTextCanClean_text:
                    resourceId = ta.getResourceId(R.styleable.EditTextCanClean_text, 0);
                    et.setText(resourceId > 0 ? getResources().getText(resourceId) : ta.getString(R.styleable
                            .EditTextCanClean_text));
                    break;

                //若没有设置cleanIconDrawable属性，则走不到该case，cleanIconDrawable显示ImageView中默认的图标
                case R.styleable.EditTextCanClean_cleanIconDrawable:
                    resourceId = ta.getResourceId(R.styleable.EditTextCanClean_cleanIconDrawable, 0);
                    img.setImageResource(resourceId > 0 ? resourceId : R.mipmap.ic_launcher);
                    break;

                case R.styleable.EditTextCanClean_textColor:
                    resourceId = ta.getResourceId(R.styleable.EditTextCanClean_textColor, 0);
                    et.setTextColor(resourceId > 0 ? getResources().getColor(resourceId) : ta.getColor(R.styleable
                            .EditTextCanClean_textColor, Color.BLACK));
                    break;

                case R.styleable.EditTextCanClean_textSize:
                    resourceId = ta.getResourceId(R.styleable.EditTextCanClean_textSize, 0);
                    et.setTextSize(resourceId > 0 ? getResources().getDimension(resourceId) : ta.getDimension(R
                            .styleable.EditTextCanClean_textSize, 20));
                    break;

                case R.styleable.EditTextCanClean_maxLength:
//                    et.setMaxEms(ta.getInt(R.styleable.EditTextCanClean_maxLength, 0));
                    et.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ta.getInt(R.styleable
                            .EditTextCanClean_maxLength, 0))});
                    Log.e("WangJie", ta.getInt(R.styleable.EditTextCanClean_maxLength, 0) + "个");
                    break;

                default:
                    break;
            }
        }
        ta.recycle();   //一定要对TypedArray资源进行释放

    }

    public EditTextCanClean(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //设置Hint提示字符串的方法，以便通过Java代码进行设置
    public void setHint(String string) {
        et.setHint(string);
    }

    //设置编辑框显示文字的方法，以便通过Java代码进行设置
    public void setText(String string) {
        et.setText(string);
    }


    //获取输入值
    public String getText() {
        return et.getText().toString();
    }

    //设置清除按钮的图标，以便通过Java代码进行设置
    public void setCleanIcon(int drawableId) {
        Drawable drawable = getResources().getDrawable(drawableId);
        img.setImageDrawable(drawable);
    }

    //***重要
    //暴露出EditText，以便设置EditText的更多属性，如inputType属性等等，是为了增加灵活性和兼容性
    public EditText getEditText() {
        return et;
    }

    //输入框文本变化监听器
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //在输入框没有输入时不显示清除图标，有输入后显示
            if (TextUtils.isEmpty(s)) {
                //为什么不用View.GONE呢？——GONE会使被隐藏的控件不再占用它原本的位置
                // 为了放置在隐藏和显示变化过程中由于位置有无导致自定义控件外观产生抖动或是变化，所以用了View.INVISIBLE
                img.setVisibility(View.INVISIBLE);
            } else {
                img.setVisibility(View.VISIBLE);
            }
        }
    };
}
