package com.teradata.config;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//@State(name = "com.xlight.code.generator.component.DBSettingApplicationComponent", storages = {@Storage(file = "$APP_CONFIG$/cg.xml")})
//cg.xml默认地址 C:\Users\Administrator\.IntelliJIdea13\system\plugins-sandbox\config\options

public class DBSettingApplicationComponent implements ApplicationComponent,
        Configurable, PersistentStateComponent<DBSettingApplicationComponent> {

    @Nullable
    @Override
    public void loadState(DBSettingApplicationComponent state) {

        XmlSerializerUtil.copyBean(state, this);
    }

    @Override
    public DBSettingApplicationComponent getState() {
        return this;
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Hello";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
