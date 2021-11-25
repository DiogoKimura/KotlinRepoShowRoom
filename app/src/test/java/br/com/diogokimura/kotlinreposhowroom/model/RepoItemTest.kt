package br.com.diogokimura.kotlinreposhowroom.model

import com.google.gson.Gson
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class RepoItemTest {
    var gsonRepoList = "{\"total_count\":678934,\"incomplete_results\":false,\"items\":[{\"id\":5152285,\"node_id\":\"MDEwOlJlcG9zaXRvcnk1MTUyMjg1\",\"name\":\"okhttp\",\"full_name\":\"square/okhttp\",\"private\":false,\"owner\":{\"login\":\"square\",\"id\":82592,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjgyNTky\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/82592?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/square\",\"html_url\":\"https://github.com/square\",\"followers_url\":\"https://api.github.com/users/square/followers\",\"following_url\":\"https://api.github.com/users/square/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/square/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/square/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/square/subscriptions\",\"organizations_url\":\"https://api.github.com/users/square/orgs\",\"repos_url\":\"https://api.github.com/users/square/repos\",\"events_url\":\"https://api.github.com/users/square/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/square/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/square/okhttp\",\"description\":\"Square’s meticulous HTTP client for the JVM, Android, and GraalVM.\",\"fork\":false,\"url\":\"https://api.github.com/repos/square/okhttp\",\"forks_url\":\"https://api.github.com/repos/square/okhttp/forks\",\"keys_url\":\"https://api.github.com/repos/square/okhttp/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/square/okhttp/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/square/okhttp/teams\",\"hooks_url\":\"https://api.github.com/repos/square/okhttp/hooks\",\"issue_events_url\":\"https://api.github.com/repos/square/okhttp/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/square/okhttp/events\",\"assignees_url\":\"https://api.github.com/repos/square/okhttp/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/square/okhttp/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/square/okhttp/tags\",\"blobs_url\":\"https://api.github.com/repos/square/okhttp/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/square/okhttp/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/square/okhttp/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/square/okhttp/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/square/okhttp/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/square/okhttp/languages\",\"stargazers_url\":\"https://api.github.com/repos/square/okhttp/stargazers\",\"contributors_url\":\"https://api.github.com/repos/square/okhttp/contributors\",\"subscribers_url\":\"https://api.github.com/repos/square/okhttp/subscribers\",\"subscription_url\":\"https://api.github.com/repos/square/okhttp/subscription\",\"commits_url\":\"https://api.github.com/repos/square/okhttp/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/square/okhttp/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/square/okhttp/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/square/okhttp/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/square/okhttp/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/square/okhttp/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/square/okhttp/merges\",\"archive_url\":\"https://api.github.com/repos/square/okhttp/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/square/okhttp/downloads\",\"issues_url\":\"https://api.github.com/repos/square/okhttp/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/square/okhttp/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/square/okhttp/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/square/okhttp/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/square/okhttp/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/square/okhttp/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/square/okhttp/deployments\",\"created_at\":\"2012-07-23T13:42:55Z\",\"updated_at\":\"2021-11-24T09:47:06Z\",\"pushed_at\":\"2021-11-24T08:10:15Z\",\"git_url\":\"git://github.com/square/okhttp.git\",\"ssh_url\":\"git@github.com:square/okhttp.git\",\"clone_url\":\"https://github.com/square/okhttp.git\",\"svn_url\":\"https://github.com/square/okhttp\",\"homepage\":\"https://square.github.io/okhttp/\",\"size\":40960,\"stargazers_count\":41172,\"watchers_count\":41172,\"language\":\"Kotlin\",\"has_issues\":true,\"has_projects\":false,\"has_downloads\":true,\"has_wiki\":false,\"has_pages\":true,\"forks_count\":8687,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":117,\"license\":{\"key\":\"apache-2.0\",\"name\":\"Apache License 2.0\",\"spdx_id\":\"Apache-2.0\",\"url\":\"https://api.github.com/licenses/apache-2.0\",\"node_id\":\"MDc6TGljZW5zZTI=\"},\"allow_forking\":true,\"is_template\":false,\"topics\":[\"android\",\"graalvm\",\"java\",\"kotlin\"],\"visibility\":\"public\",\"forks\":8687,\"open_issues\":117,\"watchers\":41172,\"default_branch\":\"master\",\"score\":1},{\"id\":51148780,\"node_id\":\"MDEwOlJlcG9zaXRvcnk1MTE0ODc4MA==\",\"name\":\"architecture-samples\",\"full_name\":\"android/architecture-samples\",\"private\":false,\"owner\":{\"login\":\"android\",\"id\":32689599,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMyNjg5NTk5\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/32689599?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/android\",\"html_url\":\"https://github.com/android\",\"followers_url\":\"https://api.github.com/users/android/followers\",\"following_url\":\"https://api.github.com/users/android/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/android/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/android/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/android/subscriptions\",\"organizations_url\":\"https://api.github.com/users/android/orgs\",\"repos_url\":\"https://api.github.com/users/android/repos\",\"events_url\":\"https://api.github.com/users/android/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/android/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/android/architecture-samples\",\"description\":\"A collection of samples to discuss and showcase different architectural tools and patterns for Android apps.\",\"fork\":false,\"url\":\"https://api.github.com/repos/android/architecture-samples\",\"forks_url\":\"https://api.github.com/repos/android/architecture-samples/forks\",\"keys_url\":\"https://api.github.com/repos/android/architecture-samples/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/android/architecture-samples/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/android/architecture-samples/teams\",\"hooks_url\":\"https://api.github.com/repos/android/architecture-samples/hooks\",\"issue_events_url\":\"https://api.github.com/repos/android/architecture-samples/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/android/architecture-samples/events\",\"assignees_url\":\"https://api.github.com/repos/android/architecture-samples/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/android/architecture-samples/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/android/architecture-samples/tags\",\"blobs_url\":\"https://api.github.com/repos/android/architecture-samples/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/android/architecture-samples/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/android/architecture-samples/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/android/architecture-samples/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/android/architecture-samples/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/android/architecture-samples/languages\",\"stargazers_url\":\"https://api.github.com/repos/android/architecture-samples/stargazers\",\"contributors_url\":\"https://api.github.com/repos/android/architecture-samples/contributors\",\"subscribers_url\":\"https://api.github.com/repos/android/architecture-samples/subscribers\",\"subscription_url\":\"https://api.github.com/repos/android/architecture-samples/subscription\",\"commits_url\":\"https://api.github.com/repos/android/architecture-samples/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/android/architecture-samples/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/android/architecture-samples/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/android/architecture-samples/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/android/architecture-samples/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/android/architecture-samples/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/android/architecture-samples/merges\",\"archive_url\":\"https://api.github.com/repos/android/architecture-samples/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/android/architecture-samples/downloads\",\"issues_url\":\"https://api.github.com/repos/android/architecture-samples/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/android/architecture-samples/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/android/architecture-samples/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/android/architecture-samples/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/android/architecture-samples/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/android/architecture-samples/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/android/architecture-samples/deployments\",\"created_at\":\"2016-02-05T13:42:07Z\",\"updated_at\":\"2021-11-24T10:47:47Z\",\"pushed_at\":\"2021-11-18T08:11:45Z\",\"git_url\":\"git://github.com/android/architecture-samples.git\",\"ssh_url\":\"git@github.com:android/architecture-samples.git\",\"clone_url\":\"https://github.com/android/architecture-samples.git\",\"svn_url\":\"https://github.com/android/architecture-samples\",\"homepage\":\"\",\"size\":12280,\"stargazers_count\":39772,\"watchers_count\":39772,\"language\":\"Kotlin\",\"has_issues\":true,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":10902,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":195,\"license\":{\"key\":\"apache-2.0\",\"name\":\"Apache License 2.0\",\"spdx_id\":\"Apache-2.0\",\"url\":\"https://api.github.com/licenses/apache-2.0\",\"node_id\":\"MDc6TGljZW5zZTI=\"},\"allow_forking\":true,\"is_template\":false,\"topics\":[\"android\",\"android-architecture\",\"samples\"],\"visibility\":\"public\",\"forks\":10902,\"open_issues\":195,\"watchers\":39772,\"default_branch\":\"main\",\"score\":1},{\"id\":3432266,\"node_id\":\"MDEwOlJlcG9zaXRvcnkzNDMyMjY2\",\"name\":\"kotlin\",\"full_name\":\"JetBrains/kotlin\",\"private\":false,\"owner\":{\"login\":\"JetBrains\",\"id\":878437,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjg3ODQzNw==\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/878437?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/JetBrains\",\"html_url\":\"https://github.com/JetBrains\",\"followers_url\":\"https://api.github.com/users/JetBrains/followers\",\"following_url\":\"https://api.github.com/users/JetBrains/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/JetBrains/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/JetBrains/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/JetBrains/subscriptions\",\"organizations_url\":\"https://api.github.com/users/JetBrains/orgs\",\"repos_url\":\"https://api.github.com/users/JetBrains/repos\",\"events_url\":\"https://api.github.com/users/JetBrains/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/JetBrains/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/JetBrains/kotlin\",\"description\":\"The Kotlin Programming Language. \",\"fork\":false,\"url\":\"https://api.github.com/repos/JetBrains/kotlin\",\"forks_url\":\"https://api.github.com/repos/JetBrains/kotlin/forks\",\"keys_url\":\"https://api.github.com/repos/JetBrains/kotlin/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/JetBrains/kotlin/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/JetBrains/kotlin/teams\",\"hooks_url\":\"https://api.github.com/repos/JetBrains/kotlin/hooks\",\"issue_events_url\":\"https://api.github.com/repos/JetBrains/kotlin/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/JetBrains/kotlin/events\",\"assignees_url\":\"https://api.github.com/repos/JetBrains/kotlin/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/JetBrains/kotlin/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/JetBrains/kotlin/tags\",\"blobs_url\":\"https://api.github.com/repos/JetBrains/kotlin/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/JetBrains/kotlin/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/JetBrains/kotlin/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/JetBrains/kotlin/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/JetBrains/kotlin/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/JetBrains/kotlin/languages\",\"stargazers_url\":\"https://api.github.com/repos/JetBrains/kotlin/stargazers\",\"contributors_url\":\"https://api.github.com/repos/JetBrains/kotlin/contributors\",\"subscribers_url\":\"https://api.github.com/repos/JetBrains/kotlin/subscribers\",\"subscription_url\":\"https://api.github.com/repos/JetBrains/kotlin/subscription\",\"commits_url\":\"https://api.github.com/repos/JetBrains/kotlin/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/JetBrains/kotlin/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/JetBrains/kotlin/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/JetBrains/kotlin/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/JetBrains/kotlin/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/JetBrains/kotlin/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/JetBrains/kotlin/merges\",\"archive_url\":\"https://api.github.com/repos/JetBrains/kotlin/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/JetBrains/kotlin/downloads\",\"issues_url\":\"https://api.github.com/repos/JetBrains/kotlin/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/JetBrains/kotlin/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/JetBrains/kotlin/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/JetBrains/kotlin/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/JetBrains/kotlin/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/JetBrains/kotlin/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/JetBrains/kotlin/deployments\",\"created_at\":\"2012-02-13T17:29:58Z\",\"updated_at\":\"2021-11-24T11:07:49Z\",\"pushed_at\":\"2021-11-24T11:02:22Z\",\"git_url\":\"git://github.com/JetBrains/kotlin.git\",\"ssh_url\":\"git@github.com:JetBrains/kotlin.git\",\"clone_url\":\"https://github.com/JetBrains/kotlin.git\",\"svn_url\":\"https://github.com/JetBrains/kotlin\",\"homepage\":\"https://kotlinlang.org\",\"size\":1290360,\"stargazers_count\":39397,\"watchers_count\":39397,\"language\":\"Kotlin\",\"has_issues\":false,\"has_projects\":false,\"has_downloads\":true,\"has_wiki\":false,\"has_pages\":false,\"forks_count\":4818,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":125,\"license\":null,\"allow_forking\":true,\"is_template\":false,\"topics\":[\"compiler\",\"gradle-plugin\",\"intellij-plugin\",\"kotlin\",\"kotlin-library\",\"maven-plugin\",\"programming-language\"],\"visibility\":\"public\",\"forks\":4818,\"open_issues\":125,\"watchers\":39397,\"default_branch\":\"master\",\"score\":1}]}"


    @Test
    fun have_addRepoItem(){
        val repoOwner = RepoOwner("author", "http://url.com")
        val repoItem = RepoItem("name", 1, 2, repoOwner)

        assertEquals(repoItem.name, "name")
        assertEquals(repoItem.forks, 2)
        assertEquals(repoOwner.author, "author")
    }

    @Test
    fun have_convertGsonToRepoListItemObject(){
        val gson = Gson()
        val repoListItem = gson.fromJson(gsonRepoList, RepoListItem::class.java)

        assertNotNull(repoListItem.itemList.get(0).name)
        assertNotNull(repoListItem.itemList.get(0).repoOwner)
        assertNotNull(repoListItem.itemList.get(0).stars)
    }
}