package com.soutoss.facebooksnapshotsample

import androidx.test.core.app.ActivityScenario
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class MainActivityTest : ScreenshotTest {
    @Test
    fun shouldLoadListWithExpectedContent() {
        ActivityScenario.launch(MainActivity::class.java).onActivity {
            compareScreenshot(it)
        }
    }

}