package br.com.diogokimura.kotlinreposhowroom.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import java.util.List;

import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;


public class AppSharedPreferences {
    private static final String NULL_VALUE = "NULL_VALUE";
    private static final String PREF_NAME = "pref";
    private static final String KEY_PAGES = "page";
    private static final String KEY_REPO = "repo_";

    private final Context context;
    private final SharedPreferences.Editor editor;
    private final SharedPreferences preferences;
    List<Integer> pages;

    public AppSharedPreferences(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    private void putLastDownloadedPage(){
        int lastPage = getLastDownloadedPage();
        lastPage += 1;
        editor.putInt(KEY_PAGES, lastPage);
    }
    private int getLastDownloadedPage(){
        return  preferences.getInt(KEY_PAGES, 0);
    }
    public void resetPage(){
        int lastPage = 0;
        editor.putInt(KEY_PAGES, lastPage);
    }

    public void setRepoList(RepoListItem repoListItem){
        String repoListString = new Gson().toJson(repoListItem);
        putString(KEY_REPO + getLastDownloadedPage(), repoListString);
        Log.d("TAG", "Setou repolist: " + KEY_REPO + getLastDownloadedPage());
        putLastDownloadedPage();
    }

    public RepoListItem getRepoList(){
        String repoList = getString(KEY_REPO + getLastDownloadedPage());
        Log.d("TAG", "Pegou repolist: " + KEY_REPO + getLastDownloadedPage());
        if (repoList.equals(NULL_VALUE))return null;
        return new Gson().fromJson(repoList, RepoListItem.class);
    }

    public void putString(String key, String value){
        editor.putString(key, value);
        editor.apply();
    }
    public String getString(String key){
        return preferences.getString(key, NULL_VALUE);
    }
    public void putInt(String key, int value){
        editor.putInt(key, value);
        editor.apply();
    }
    public int getInt(String key){
        return preferences.getInt(key, 0);
    }

}
