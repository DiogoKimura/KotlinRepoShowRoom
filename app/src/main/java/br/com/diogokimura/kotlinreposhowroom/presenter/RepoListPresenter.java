package br.com.diogokimura.kotlinreposhowroom.presenter;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.diogokimura.kotlinreposhowroom.R;
import br.com.diogokimura.kotlinreposhowroom.datasource.RepoListDataSource;
import br.com.diogokimura.kotlinreposhowroom.model.RepoItem;
import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;
import br.com.diogokimura.kotlinreposhowroom.model.RepoOwner;
import br.com.diogokimura.kotlinreposhowroom.ui.RepoListActivity;
import br.com.diogokimura.kotlinreposhowroom.utils.AppSharedPreferences;

public class RepoListPresenter implements RepoListDataSource.RepoListCallback {
    private final RepoListActivity view;
    private final RepoListDataSource dataSource;
    private final Context context;

    public RepoListPresenter(RepoListActivity view, RepoListDataSource dataSource, Context context) {
        this.view = view;
        this.dataSource = dataSource;
        this.context = context;
    }

    public void getRepos(int page) {
        AppSharedPreferences appSharedPreferences = new AppSharedPreferences(context);
        RepoListItem repoList = appSharedPreferences.getRepoList();

        if (repoList == null) {
            this.view.showProgressBar();
            this.dataSource.getRepos("kotlin", "stars", Integer.toString(page), this);
        }else{
            onSucess(repoList);
        }
    }

    public void mockRepos() {
        List<RepoItem> repoItems = new ArrayList<>();
        repoItems.add(new RepoItem("okhttp", 1, 1, new RepoOwner("John", "http://url.com")));
        repoItems.add(new RepoItem("retrofit", 2, 2, new RepoOwner("Josh", "http://url.com")));
        repoItems.add(new RepoItem("design patterns", 3, 3, new RepoOwner("Ana", "http://url.com")));
        repoItems.add(new RepoItem("Android Architecture", 4, 4, new RepoOwner("Katarina", "http://url.com")));
        repoItems.add(new RepoItem("Samples", 5, 5, new RepoOwner("David", "http://url.com")));
        view.updateList(new RepoListItem(repoItems));
    }

    @Override
    public void onSucess(RepoListItem repoListItem) {
        view.updateList(repoListItem);
    }

    @Override
    public void onError(String message) {
        if (message.isEmpty()) message = view.getString(R.string.try_again);
        this.view.showFailure(message);
    }

    @Override
    public void onComplete() {
        view.hideProgressBar();
    }
}
