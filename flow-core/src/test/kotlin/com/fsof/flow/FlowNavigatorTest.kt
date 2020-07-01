package com.fsof.flow

import ch.tutteli.atrium.api.infix.en_GB.toBe
import ch.tutteli.atrium.api.verbs.expect
import org.spekframework.spek2.Spek
import toothpick.ktp.KTP

/**
 * Created with Android Studio
 * User: electrolobzik electrolobzik@gmail.com
 * Date: 27.06.2020
 * Time: 15:59
 */
object FlowNavigatorTest : Spek({

    group("app navigator") {

        test("open contests on start") {

            expect(KTP.isScopeOpen(appScopeName)) toBe true

        }
    }

    afterGroup {
        println("after root")
    }
})

const val appScopeName = "App"