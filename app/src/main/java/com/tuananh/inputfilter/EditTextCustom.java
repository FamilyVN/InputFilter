package com.tuananh.inputfilter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by FRAMGIA\vu.tuan.anh on 21/09/2017.
 */
public class EditTextCustom extends EditText {
    public EditTextCustom(Context context) {
        super(context);
        initInputFilter();
    }

    public EditTextCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInputFilter();
    }

    public EditTextCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInputFilter();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EditTextCustom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInputFilter();
    }

    private void initInputFilter() {
        setFilters(new InputFilter[]{CommonUtils.getInputFilter()});
    }
}
