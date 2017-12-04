package com.yaroslavtupalo.kotlinwithrealm.model

import io.realm.RealmObject

/**
 * Created by Yaroslav on 04.12.2017.
 */
open class Cat: RealmObject() {

    var name: String? = null
}