package com.tuananh.inputfilter;

import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;

/**
 * Created by FRAMGIA\vu.tuan.anh on 21/09/2017.
 */
public class CommonUtils {
    public static final String VALID_EXISTED = ".*[a b c].*";
    public static final String REGEX_TEXT1 = ".*[0-3].*";

    public static boolean checkValidInput(CharSequence charSequence) {
        charSequence = charSequence.toString().replace(" ", "");
        return charSequence.toString().matches(REGEX_TEXT1)
            || charSequence.toString().matches(VALID_EXISTED.replace(" ", ""));
    }

    public static InputFilter getInputFilter() {
        return new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dStart, int dEnd) {
                Log.d("TAG", "source = " + source);
                if (CommonUtils.checkValidInput(source)) return "";
                Log.d("TAG", "source1 = " + source);
                return source;
            }
        };
    }
}
