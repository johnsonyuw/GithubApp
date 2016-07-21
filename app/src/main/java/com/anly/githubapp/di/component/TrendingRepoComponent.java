package com.anly.githubapp.di.component;

import com.anly.githubapp.di.PerActivity;
import com.anly.githubapp.di.module.ActivityModule;
import com.anly.githubapp.di.module.RepoModule;
import com.anly.githubapp.di.module.TrendingRepoModule;
import com.anly.githubapp.ui.module.main.TrendingFragment;
import com.anly.githubapp.ui.module.repo.RepoListActivity;

import dagger.Component;

/**
 * Created by mingjun on 16/7/7.
 */
@PerActivity
@Component(
        dependencies = ApplicationComponent.class,
        modules = {ActivityModule.class, TrendingRepoModule.class})
public interface TrendingRepoComponent extends ActivityComponent {

    void inject(TrendingFragment fragment);
}