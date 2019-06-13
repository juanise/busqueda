package com.pf.busqueda.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer.AuthorizedUrl;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@EnableResourceServer
public class OAuth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    @Value("${oauth.sign_token:s1f41234pwqdqkl4l12ghg9853123sd}")
    private String signing_key;

    public OAuth2ResourceServerConfiguration() {
    }

    public void configure(final HttpSecurity http) throws Exception {
        ((AuthorizedUrl)((AuthorizedUrl)((AuthorizedUrl)((HttpSecurity)http.csrf().disable()).antMatcher("/**").authorizeRequests().antMatchers(new String[]{"/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security", "/swagger-ui.html", "/webjars/**", "/swagger-resources/**", "/swagger-ui.html", "/swagger-resources/configuration/security"})).permitAll().antMatchers(new String[]{"/api/v1/**"})).authenticated().anyRequest()).permitAll();
    }

    public void configure(final ResourceServerSecurityConfigurer config) {
        config.tokenServices(this.tokenServices());
        config.resourceId("restservice");
    }

    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(this.accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(this.signing_key);
        return converter;
    }

    @Bean
    @Primary
    public DefaultTokenServices tokenServices() {
        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        defaultTokenServices.setTokenStore(this.tokenStore());
        return defaultTokenServices;
    }

    public String getSigning_key() {
        return this.signing_key;
    }

    public void setSigning_key(String signing_key) {
        this.signing_key = signing_key;
    }
}
