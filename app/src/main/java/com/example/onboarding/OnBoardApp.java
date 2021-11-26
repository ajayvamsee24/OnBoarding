package com.example.onboarding;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import cn.hikyson.godeye.core.GodEyeHelper;
import cn.hikyson.godeye.core.monitor.AppInfoConext;
import cn.hikyson.godeye.core.monitor.AppInfoLabel;

public class OnBoardApp extends Application {
    public OnBoardApp() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //God Eye helper
        GodEyeHelper.setMonitorAppInfoConext(new AppInfoConext() {
            @Override
            public List<AppInfoLabel> getAppInfo() {
                List<AppInfoLabel> appInfoLabels = new ArrayList<>();
                appInfoLabels.add(new AppInfoLabel("ApplicationID", BuildConfig.APPLICATION_ID, null));
                appInfoLabels.add(new AppInfoLabel("VersionName", BuildConfig.VERSION_NAME, ""));
                appInfoLabels.add(new AppInfoLabel("VersionCode", String.valueOf(BuildConfig.VERSION_CODE), ""));
                appInfoLabels.add(new AppInfoLabel("BuildType", BuildConfig.BUILD_TYPE, ""));
                appInfoLabels.add(new AppInfoLabel("AndroidGodEye", "https://github.com/Kyson/AndroidGodEye", "https://github.com/Kyson/AndroidGodEye"));
                return appInfoLabels;
            }
        });
    }

}
