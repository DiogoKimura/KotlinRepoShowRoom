package br.com.diogokimura.kotlinreposhowroom.model;

import com.google.gson.annotations.SerializedName;

public class RepoItem {
    @SerializedName("name")
    private String name;
    @SerializedName("stargazers_count")
    private int stars;
    @SerializedName("forks")
    private int forks;
    @SerializedName("owner")
    private RepoOwner repoOwner;

    public RepoItem(String name, int stars, int forks, RepoOwner repoOwner) {
        this.name = name;
        this.stars = stars;
        this.forks = forks;
        this.repoOwner = repoOwner;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getForks() {
        return forks;
    }

    public RepoOwner getRepoOwner() {
        return repoOwner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public void setRepoOwner(RepoOwner repoOwner) {
        this.repoOwner = repoOwner;
    }
}
