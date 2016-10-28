package cn.bluemobi.dylan;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-10-28.
 */

public class LoadingDialog extends Dialog {
    private TextView tv_text;

    public LoadingDialog(Context context) {
        super(context, R.style.transparentFrameWindowStyle);
        setContentView(R.layout.loading);
        tv_text = (TextView) findViewById(R.id.tv_text);
        setCanceledOnTouchOutside(false);
    }

    public LoadingDialog setMessage(String message) {
        tv_text.setText(message);
        return this;
    }
}
