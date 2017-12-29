package com.bob.utils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebPageUtils {

	/**
	 * 在浏览器中打开新Tab页
	 *
	 * @param url 跳转地址
	 */
	private void loadWebpage(String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException | URISyntaxException ex) {
			// TODO
			ex.printStackTrace();
			Logger.getLogger(WebPageUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


}
