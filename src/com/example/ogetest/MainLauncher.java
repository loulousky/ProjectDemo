package com.example.ogetest;

import com.orange.engine.camera.ZoomCamera;
import com.orange.engine.options.PixelPerfectEngineOptions;
import com.orange.engine.options.PixelPerfectMode;
import com.orange.engine.options.ScreenOrientation;
import com.orange.ui.launcher.GameLauncher;

public class MainLauncher extends GameLauncher {

    @Override
    protected PixelPerfectEngineOptions onCreatePixelPerfectEngineOptions() {
        PixelPerfectEngineOptions pixelPerfectEngineOptions = new PixelPerfectEngineOptions(ZoomCamera.class);
        // 璁剧疆绔栧睆
        pixelPerfectEngineOptions.setScreenOrientation(ScreenOrientation.PORTRAIT_FIXED);
        pixelPerfectEngineOptions.setPixelPerfectMode(PixelPerfectMode.CHANGE_WIDTH);
        // 鍙傝�灏哄
        pixelPerfectEngineOptions.setDesiredSize(480.0f);
        return pixelPerfectEngineOptions;
    }
    @Override
    protected void onLoadResources() {
        
    }
    @Override
    protected void onLoadComplete() {
        startScene(MainScene.class);
    }

}
