package com.pf.busqueda.config;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@SpringBootConfiguration
public class AppConfig {

    /**
     * Aceptamos certificados autofirmados
     * @return
     */
    @Bean
    RestTemplate getRestTemplate(){
        try {
            final HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
            final SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build());
            final CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
            requestFactory.setHttpClient(httpclient);
            return new RestTemplate(requestFactory);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return new RestTemplate();
    }
}
