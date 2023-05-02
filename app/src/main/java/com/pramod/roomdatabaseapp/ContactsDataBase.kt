package com.pramod.roomdatabaseapp

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 1)
abstract class ContactsDataBase :RoomDatabase(){

    abstract  fun contactdao():ContactDao
}