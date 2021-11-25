package br.com.diogokimura.kotlinreposhowroom.model;

import com.google.gson.annotations.SerializedName;

public class RepoOwner {
    @SerializedName("login")
    private String author;
    @SerializedName("avatar_url")
    private String avatarUrl;

    public RepoOwner(String author, String avatarUrl) {
        this.author = author;
        this.avatarUrl = avatarUrl;
    }

    public String getAuthor() {
        return author;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
