package com.coderwangj.arsenal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.coderwangj.toolslib.MoneyUtil;
import com.coderwangj.toolslib.StringUtil;

public class MoneyShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_show);

        final EditText etInput = (EditText) findViewById(R.id.et);

        findViewById(R.id.btn_formatMonet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMoney(etInput.getText().toString());
            }
        });
    }

    private void showMoney(String s) {
        TextView tv1 = (TextView) findViewById(R.id.tv_1);
        TextView tv2 = (TextView) findViewById(R.id.tv_2);
        TextView tv3 = (TextView) findViewById(R.id.tv_3);
        TextView tv4 = (TextView) findViewById(R.id.tv_4);
        TextView tv5 = (TextView) findViewById(R.id.tv_5);

        tv1.setText(MoneyUtil.formatMoney2Show(s));
        tv2.setText(MoneyUtil.formatMoney2Trans(s));

        double value;
        if (StringUtil.isNotEmpty(s)){
            value = Double.parseDouble(s);
        } else {
            value = 0;
        }
        tv3.setText(MoneyUtil.formatMoney2Show(value));
        tv4.setText(MoneyUtil.formatMoney2Trans(value));

        tv5.setText(MoneyUtil.getMoneyValue(s) + "");


    }
}
