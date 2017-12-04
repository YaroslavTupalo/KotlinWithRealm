package com.yaroslavtupalo.kotlinwithrealm.model

import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects

/**
 * Created by Yaroslav on 04.12.2017.
 */
open class Dog: RealmObject() {

    var name: String? = null

    @LinkingObjects("dog")
    val owners: RealmResults<Person>? = null
}