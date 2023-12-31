/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package demo

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import kotlin.test.Test
import kotlin.test.assertNotNull

//class AppTest {
//    @Test fun appHasAGreeting() {
//        val classUnderTest = App()
//        assertNotNull(classUnderTest.greeting, "app should have a greeting")
//    }
//}

class AppTest : BehaviorSpec({
    given("Happy Path") {
        val sut = App()

        `when`("App.greeting") {
            val result = sut.greeting

            then("Matches Expected") {
                result.shouldNotBeNull()
            }
        }
    }
})
