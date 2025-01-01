package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.WebView;

public interface InAppWebViewClientPrimaryOverrides {
    public boolean shouldOverrideUrlLoading(WebView webView, String url);
}
