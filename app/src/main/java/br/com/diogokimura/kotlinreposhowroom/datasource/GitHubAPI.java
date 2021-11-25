package br.com.diogokimura.kotlinreposhowroom.datasource;

import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubAPI {
    static final String BASE_URL = "https://api.github.com";

    @GET("/search/repositories")
    Call<RepoListItem> getRepos(@Query("q") String language,
                                @Query("sort") String sort,
                                @Query("page") String page);

    Response<RepoListItem> responseRepos();
}
