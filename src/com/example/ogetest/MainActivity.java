package com.example.ogetest;

import com.orange.ui.activity.GameActivity;
import com.orange.ui.launcher.GameLauncher;

public class MainActivity extends GameActivity {

    @Override
    public GameLauncher CreateGameLauncher() {
        return new MainLauncher();
    }

}
