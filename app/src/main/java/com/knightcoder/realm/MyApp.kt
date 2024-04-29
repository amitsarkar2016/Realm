package com.knightcoder.realm

import android.app.Application
import com.knightcoder.realm.models.Address
import com.knightcoder.realm.models.Course
import com.knightcoder.realm.models.Student
import com.knightcoder.realm.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}