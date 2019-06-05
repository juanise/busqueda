package com.pf.busqueda.config;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger.host}")
    private String swaggerHost;

    @Value("${oauth.server}")
    private String oauthServer;
    @Value("${oauth.client}")
    private String oauthClientId;
    @Value("${oauth.secret}")
    private String oauthClientSecret;
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(userServiceApiInfo())
                .groupName("DeviceActionService-api-1.0")
                .ignoredParameterTypes(Pageable.class)
                .select()
                .paths(getPaths("v1"))
                .apis(RequestHandlerSelectors.any())
                .build()
                .host("localhost:9999")
                .useDefaultResponseMessages(false)
                .securitySchemes(Arrays.asList(securityScheme()))
                .securityContexts(Arrays.asList(securityContext("v1")));
    }

    /**
     * Api info
     * @return ApiInfo
     */
    private ApiInfo userServiceApiInfo() {
        return new ApiInfoBuilder()
                .title("DeviceAction Client Service")
                .version("1.0")
                .build();
    }


    /**
     * Config paths.
     *
     * @return the predicate
     */
    private Predicate<String> getPaths(String version){
        return PathSelectors.regex(String.format("/api/%s.*", version));
    }

    @Bean
    SecurityConfiguration security() {
        return SecurityConfigurationBuilder.builder().clientId(oauthClientId).clientSecret(oauthClientSecret).useBasicAuthenticationWithAccessCodeGrant(true).build();
    }

    private SecurityScheme securityScheme() {
        final AuthorizationCodeGrant grantType = new AuthorizationCodeGrantBuilder()
                .tokenEndpoint(new TokenEndpoint(oauthServer + "/token", "oauthtoken"))
                .tokenRequestEndpoint(new TokenRequestEndpoint(oauthServer + "/oauth2/token", oauthClientId, oauthClientId))
                .build();

        return new OAuthBuilder().name("spring_oauth").grantTypes(Arrays.asList(grantType))
                .scopes(Arrays.asList(scopes())).build();
    }

    private AuthorizationScope[] scopes() {
        return new AuthorizationScope[] { new AuthorizationScope("admin", "for admin operations"), new AuthorizationScope("user", "for user operations"), new AuthorizationScope("management", "for management operations")};
    }

    private SecurityContext securityContext(String version) {
        return SecurityContext.builder()
                .securityReferences(Arrays.asList( new SecurityReference("spring_oauth", scopes())))
                .forPaths(PathSelectors.regex("/api/$version.*")).build();
    }

}