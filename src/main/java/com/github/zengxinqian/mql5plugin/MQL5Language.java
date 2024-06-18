package com.github.zengxinqian.mql5plugin;

import com.intellij.lang.Language;

public class MQL5Language extends Language {

    public static final MQL5Language INSTANCE = new MQL5Language();

    private MQL5Language() {
        super("MQL5");
    }

}
