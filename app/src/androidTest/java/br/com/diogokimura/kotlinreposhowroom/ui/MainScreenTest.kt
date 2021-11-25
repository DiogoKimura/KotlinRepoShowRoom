package br.com.diogokimura.kotlinreposhowroom.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import br.com.diogokimura.kotlinreposhowroom.R
import org.junit.Rule
import org.junit.Test

class MainScreenTest {

    @get:Rule
    public val activityTestRule: ActivityTestRule<*> =
            ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun have_ToShowIntroducingText_WhenApplicationStarts() {
        onView(withText(activityTestRule.activity.getString(R.string.introducing_text)))
                .check(matches(isDisplayed()))
    }

    @Test
    fun have_ToShowImageButton_WhenApplicationStarts() {
        onView(withId(R.id.imageButton)).check(matches(isClickable()))
    }
}