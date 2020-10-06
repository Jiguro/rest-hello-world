package com.example.resthelloworld.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "data-sf")
@Validated
public class DataSFProperties {

    @NotBlank
    private String baseUrl;

    @NotBlank
    private String filmLocationsEndpoint;

    @NotBlank
    private String titleColumnFieldName;

    @NotBlank
    private String locationsColumnFieldName;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getFilmLocationsEndpoint() {
        return filmLocationsEndpoint;
    }

    public void setFilmLocationsEndpoint(final String filmLocationsEndpoint) {
        this.filmLocationsEndpoint = filmLocationsEndpoint;
    }

    public String getTitleColumnFieldName() {
        return titleColumnFieldName;
    }

    public void setTitleColumnFieldName(final String titleColumnFieldName) {
        this.titleColumnFieldName = titleColumnFieldName;
    }

    public String getLocationsColumnFieldName() {
        return locationsColumnFieldName;
    }

    public void setLocationsColumnFieldName(final String locationsColumnFieldName) {
        this.locationsColumnFieldName = locationsColumnFieldName;
    }
}
