package com.soneca.github_api.client;

import java.util.List;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

public interface GitHubClient {

    @GetExchange(value = "/user/repos")
    public List<RepositoryResponse> listRepos(@RequestHeader("Authorization") String token,
                                            @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-28") String apiVersion,
                                            @RequestParam(value = "visibility", defaultValue = "public") String visibility);

}
