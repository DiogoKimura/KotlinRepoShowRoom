package br.com.diogokimura.kotlinreposhowroom.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import br.com.diogokimura.kotlinreposhowroom.R;
import br.com.diogokimura.kotlinreposhowroom.model.RepoItem;
import br.com.diogokimura.kotlinreposhowroom.model.RepoListItem;
import br.com.diogokimura.kotlinreposhowroom.presenter.RepoListPresenter;

public class RepoListAdapter extends RecyclerView.Adapter<RepoListAdapter.ViewHolder>{

    private final List<RepoItem> repoItems = new ArrayList<>();
    private int page;
    private final RepoListPresenter repoListPresenter;
    private final Context context;
    private final RecyclerView rv;

    public RepoListAdapter(Context context,
                           int page,
                           RecyclerView rv,
                           RepoListPresenter repoListPresenter){
        this.context = context;
        this.page = page;
        this.rv = rv;
        this.repoListPresenter = repoListPresenter;
    }

    public void updateRepoList(RepoListItem repoListItem){
        this.repoItems.addAll(repoListItem.getItemList());
        rv.post(new Runnable() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void run() {
                notifyDataSetChanged();
            }
        });
    }


    public void getMorePage(){
        page = page + 1;
        repoListPresenter.getRepos(page);
    }

    @NonNull
    @Override
    public RepoListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.repo_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RepoListAdapter.ViewHolder holder, int position) {
        RepoItem repoItemCurrent = repoItems.get(position);
        holder.bind(repoItemCurrent);
        if (position + 1 >= getItemCount()){
            getMorePage();
        }
    }

    @Override
    public int getItemCount() {
        return repoItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @SuppressLint("SetTextI18n")
        public void bind(RepoItem item){
            TextView name = itemView.findViewById(R.id.txt_repo_name);
            TextView star = itemView.findViewById(R.id.txt_star);
            TextView forks = itemView.findViewById(R.id.txt_fork);
            TextView author = itemView.findViewById(R.id.txt_user_name);
            ImageView avatar = itemView.findViewById(R.id.img_avatar);

            name.setText(item.getName());
            star.setText(Integer.toString(item.getStars()));
            forks.setText(Integer.toString(item.getForks()));
            author.setText(item.getRepoOwner().getAuthor());
            avatar.setImageResource(R.drawable.img_kotlin);
            Picasso.get().load(item.getRepoOwner().getAvatarUrl()).into(avatar);
        }
    }
}
