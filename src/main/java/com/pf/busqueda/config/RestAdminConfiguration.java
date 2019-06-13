package com.pf.busqueda.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

import java.util.ArrayList;
import java.util.List;

public class RestAdminConfiguration {
    private static final String GRANT_TYPE = "password";

    @Value("${oauth.server-token:}")
    private String oauthServer;
    @Value("${oauth.client:}")
    private String oauthClientId;
    @Value("${oauth.secret:}")
    private String oauthClientSecret;


    @Value("${oauth.username:}")
    private String username;

    @Value("${oauth.password:}")
    private String password;

    @Bean
    public OAuth2RestOperations restAdminTemplate() {
        final DefaultAccessTokenRequest atr = new DefaultAccessTokenRequest();
        return new OAuth2RestTemplate(resource(), new DefaultOAuth2ClientContext(atr));
    }


    private ResourceOwnerPasswordResourceDetails resource() {
        final ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails() {
            @Override
            public boolean isClientOnly() {
                return true;
            }
        };

        final List<String> scopes = new ArrayList <>(1);
        scopes.add("admin");
        resource.setAccessTokenUri(oauthServer);
        resource.setClientId(oauthClientId);
        resource.setClientSecret(oauthClientSecret);
        resource.setGrantType(GRANT_TYPE);
        resource.setScope(scopes);
        resource.setUsername(username);
        resource.setPassword(password);
        return resource;
    }

}
