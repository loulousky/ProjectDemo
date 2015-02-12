package com.example.ogetest;

import com.orange.content.SceneBundle;
import com.orange.engine.device.Device;
import com.orange.entity.scene.Scene;
import com.orange.entity.text.Text;
import com.orange.entity.text.TextOptions;
import com.orange.opengl.font.BitmapFont;
import com.orange.util.HorizontalAlign;
import com.orange.util.color.Color;

public class MainScene extends Scene {

    @Override
    public void onSceneCreate(SceneBundle bundle) {
        super.onSceneCreate(bundle);
        drawText();
    }
    
    private BitmapFont getBitmapFont() {
        BitmapFont bitmapFont = new BitmapFont(this.getEngine().getTextureManager(), Device.getDevice().getFileManage(), "font/BitmapFont.fnt");
        bitmapFont.load();
        return bitmapFont;
    }

    private void drawText() {
        Text bitmapText = new Text(50, 230, getBitmapFont(), "Hello World!", new TextOptions(HorizontalAlign.CENTER), getVertexBufferObjectManager());
        bitmapText.setScale(0.5f);
        bitmapText.setColor(Color.RED);
        this.attachChild(bitmapText);
    }

}
