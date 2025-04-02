package com.soneca.github_api.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id, 
                                @JsonProperty("html_url")String htmlUrl, 
                                @JsonProperty("private") boolean isPrivate,
                                @JsonProperty("description") String textDescription) {

    
}
