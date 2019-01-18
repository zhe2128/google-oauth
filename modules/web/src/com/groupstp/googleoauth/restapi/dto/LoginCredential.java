package com.groupstp.googleoauth.restapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * @author adiatullin
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginCredential implements Serializable {
    private static final long serialVersionUID = -1592521993836772738L;

    @JsonProperty("redirect_url")
    private String redirectUrl;

    @JsonProperty("code")
    private String code;

    @JsonProperty("access_token")
    private String accessToken;


    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}