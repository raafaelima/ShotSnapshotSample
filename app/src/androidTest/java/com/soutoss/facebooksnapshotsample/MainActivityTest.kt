package com.soutoss.facebooksnapshotsample

import androidx.test.rule.ActivityTestRule
import com.facebook.testing.screenshot.Screenshot
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun shouldLoadWithExpectedContent() {
        val activity = activityTestRule.launchActivity(null)
        Screenshot.snapActivity(activity).record()
    }

}