package com.github.zengxinqian.mql5plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MQL5FileType extends LanguageFileType {

    public static final MQL5FileType INSTANCE = new MQL5FileType();

    private MQL5FileType() {
        super(MQL5Language.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "MQL5 File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "MQL5 language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "mq5";
    }

    @Override
    public Icon getIcon() {
        return MQL5Icon.FILE;
    }

}
