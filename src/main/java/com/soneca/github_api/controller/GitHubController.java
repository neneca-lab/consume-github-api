package com.soneca.github_api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soneca.github_api.client.GitHubClient;
import com.soneca.github_api.client.RepositoryResponse;

@RestController
@RequestMapping("/api/v1")
public class GitHubController {

    private final GitHubClient gitHubClient;

    public GitHubController(GitHubClient gitHubClient){
        this.gitHubClient = gitHubClient;
    }

    @GetMapping(value= "/repos")
    public ResponseEntity<List<RepositoryResponse>> listRepos(@RequestHeader(value="token") String personalAccesToken){

        var repos = gitHubClient.listRepos(
                            "Bearer " + personalAccesToken, 
                            null, 
                            "public"
                            );
        return ResponseEntity.ok(repos);
    }
}