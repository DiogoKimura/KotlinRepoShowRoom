package br.com.diogokimura.kotlinreposhowroom.datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.diogokimura.kotlinreposhowroom.model.RepoItem;
import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoListDataSource {

    public interface RepoListCallback {
        void onSucess(RepoListItem repoListItem);

        void onError(String message);

        void onComplete();
    }

    public void getRepos(String language, String sort, String page, RepoListDataSource.RepoListCallback callback) {
        HttpClient.retrofit().create(GitHubAPI.class)
                .getRepos("language:" + language, sort, page)
                .enqueue(new Callback<RepoListItem>() {
                    @Override
                    public void onResponse(Call<RepoListItem> call, Response<RepoListItem> response) {
                        if (response.isSuccessful()) callback.onSucess(response.body());
                        else callback.onError(response.message());
                        callback.onComplete();
                    }

                    @Override
                    public void onFailure(Call<RepoListItem> call, Throwable t) {
                        callback.onError(t.getMessage());
                        callback.onComplete();
                    }
                });
    }

    public List<RepoItem> getFiveRepoItems(String language, String sort, String page) throws IOException {
        List<RepoItem> repoItems = new ArrayList<>();
        Response<RepoListItem> response = HttpClient.retrofit()
                .create(GitHubAPI.class)
                .getRepos("language" + language, sort, page)
                .execute();
        if (response.isSuccessful()) {
            if (response.body() != null) {
                repoItems.add(response.body().getItemList().get(0));
                repoItems.add(response.body().getItemList().get(1));
                repoItems.add(response.body().getItemList().get(2));
                repoItems.add(response.body().getItemList().get(3));
                repoItems.add(response.body().getItemList().get(4));

                return repoItems;
            }
        }
        return null;
    }

}
