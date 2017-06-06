package com.windman.designmodel;

import android.content.Context;
import android.util.Log;

import java.io.InputStream;
import java.security.KeyStore;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class SslSocketFactory {
    private static final String TRUST_PASSWORD = "12345678";
    private static final String AGREEMENT = "TLS";
    private static final String TRUST_MANAGER = "X509";
    private static final String TRUST_KEYSTORE = "BKS";
    private SSLContext sslContext = null;

    public SSLSocketFactory getSslSocketFactory(Context context) {
        try {
            //取得BKS密库实例
            KeyStore keyStore = KeyStore.getInstance(TRUST_KEYSTORE);
//            InputStream input = context.getResources().openRawResource(R.raw.release_https);
            InputStream input = context.getResources().openRawResource(R.raw.release_https);
            try {
                keyStore.load(input, TRUST_PASSWORD.toCharArray());
            } finally {
                input.close();
            }
            //取得TrustManagerFactory的X509密钥管理器实例
            TrustManagerFactory trustManager = TrustManagerFactory.getInstance(TRUST_MANAGER);
            //初始化密钥管理器
            trustManager.init(keyStore);
            //取得SSL的SSLContext实例
            sslContext = SSLContext.getInstance(AGREEMENT);
            //初始化SSLContext
            sslContext.init(null, trustManager.getTrustManagers(), null);
        } catch (Exception e) {
            Log.e("SslContextFactory", e.getMessage());
        }
        return sslContext.getSocketFactory();
    }
}