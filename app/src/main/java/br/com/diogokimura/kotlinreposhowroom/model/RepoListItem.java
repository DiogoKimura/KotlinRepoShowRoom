package br.com.diogokimura.kotlinreposhowroom.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RepoListItem {
    @SerializedName("items")
    private List<RepoItem> itemList;

    public RepoListItem(List<RepoItem> itemList) {
        this.itemList = itemList;
    }

    public List<RepoItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<RepoItem> itemList) {
        this.itemList = itemList;
    }

    public void addItemList(List<RepoItem> itemList){
        this.itemList.addAll(itemList);
    }
}
