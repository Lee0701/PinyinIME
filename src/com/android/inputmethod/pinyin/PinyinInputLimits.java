package com.android.inputmethod.pinyin;

public class PinyinInputLimits {
    public static final int MAX_INPUT_LENGTH = 120;
    public static final int BUFFER_SIZE = MAX_INPUT_LENGTH + 1;

    public static boolean canApplyEdit(int currentLength, int removeBeforeCursor, int appendLength) {
        if(currentLength < 0 || removeBeforeCursor < 0 || removeBeforeCursor > currentLength || appendLength < 0) {
            return false;
        }
        int retainedLength = currentLength - removeBeforeCursor;
        return appendLength <= MAX_INPUT_LENGTH - retainedLength;
    }
}
