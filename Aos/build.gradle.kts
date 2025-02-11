// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
    alias(libs.plugins.com.android.library) apply false
    alias(libs.plugins.dagger.hilt) apply false
    alias(libs.plugins.com.google.devtools.ksp) apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.0" apply false
} true