package br.com.diogokimura.kotlinreposhowroom.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import br.com.diogokimura.kotlinreposhowroom.R;
import br.com.diogokimura.kotlinreposhowroom.datasource.RepoListDataSource;
import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;
import br.com.diogokimura.kotlinreposhowroom.presenter.RepoListPresenter;
import br.com.diogokimura.kotlinreposhowroom.ui.adapter.RepoListAdapter;
import br.com.diogokimura.kotlinreposhowroom.utils.AppSharedPreferences;

public class RepoListActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RepoListAdapter adapter;
    private ProgressDialog progress;
    private RepoListDataSource repoListDataSource;
    private RepoListPresenter repoListPresenter;
    private int page = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo_list);
        configurePresenter();
        configureRecyclerView();
    }

    public void configureRecyclerView() {
        // Configuring recycler view
        if (rv == null) {

            rv = findViewById(R.id.rv_repo_list);
            rv.setLayoutManager(new LinearLayoutManager(this));
        }

        if (adapter == null) {
            adapter = new RepoListAdapter(this,
                    page,
                    rv,
                    repoListPresenter);
            rv.setAdapter(adapter);
        }
    }

    public void configurePresenter() {
        // Setting up presenter
        if (repoListPresenter == null) {
            repoListDataSource = new RepoListDataSource();
            repoListPresenter = new RepoListPresenter(this, repoListDataSource, this);
            repoListPresenter.getRepos(page);
        }
    }

    public void testRecyclerView() {
        repoListPresenter.mockRepos();
    }

    public void updateList(RepoListItem repoListItem) {
        AppSharedPreferences appSharedPreferences = new AppSharedPreferences(this);
        appSharedPreferences.setRepoList(repoListItem);

        configurePresenter();
        configureRecyclerView();

        adapter.updateRepoList(repoListItem);
    }

    public void showFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void showProgressBar() {
        if (progress == null) {
            progress = new ProgressDialog(this);
            progress.setMessage(getString(R.string.loading));
            progress.setIndeterminate(true);
            progress.setCancelable(false);
        }
        progress.show();
    }

    public void hideProgressBar() {
        if (progress != null) {
            progress.hide();
        }
    }
}