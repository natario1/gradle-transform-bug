package gradle.transform.bug

import android.app.Activity
import android.os.Bundle
import android.util.Log
import gradle.transform.bug.library.helloWorld

class ConsumerActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ConsumerApp", helloWorld())

    }
}