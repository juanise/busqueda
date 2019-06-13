package com.pf.busqueda.config;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class RestTemplateSecurityInterceptor implements ClientHttpRequestInterceptor {
    public RestTemplateSecurityInterceptor() {
    }

    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        String token = RequestContext.getContext().getToken();
        if (!token.isEmpty()) {
            request.getHeaders().add("Authorization", token);
        }

        return execution.execute(request, body);
    }
}