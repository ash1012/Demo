package com.abgamerguys.libgdx.demo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.abgamerguys.libgdx.demo.MyDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "My Demo Game";
		config.width = 500;
		config.height = 400;
		new LwjglApplication(new MyDemo(), config);
	}
}
