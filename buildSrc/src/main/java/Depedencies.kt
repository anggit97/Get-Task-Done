object ApplicationId {
    const val id = "com.anggitprayogo.todolist"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val buildToolsVersion = "29.0.2"
    const val targetSdkVersion = 29
    const val minSdkVersion = 19
    const val renderTargetApi = 29
}

object Version {

    /**
     * Android Support Version
     */
    const val support = "1.1.0"
    const val material = "1.1.0"
    const val legacy = "1.0.0"
    const val cardAndRv = "1.1.0"
    const val constraintLayout = "1.1.3"

    /**
     * Jetpack Navigation Version
     */
    const val navFragmentKtx = "2.1.0"
    const val navUiKtx = "2.1.0"
}

object AndroidSupport {
    const val appCompat = "androidx.appcompat:appcompat:${Version.support}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Version.cardAndRv}"
    const val cardview = "androidx.cardview:cardview:${Version.cardAndRv}"
    const val design = "com.google.android.material:material:${Version.material}"
    const val v4 = "androidx.legacy:legacy-support-v4:${Version.legacy}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
}

object Navigation{
    const val fragmentktx = "androidx.navigation:navigation-fragment-ktx:${Version.navFragmentKtx}"
    const val uiKtx = "androidx.navigation:navigation-ui-ktx:${Version.navFragmentKtx}"
}

