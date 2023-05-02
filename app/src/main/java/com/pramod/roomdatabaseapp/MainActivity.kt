package com.pramod.roomdatabaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var dataBase: ContactsDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBase = Room.databaseBuilder(applicationContext,ContactsDataBase::class.java,"contactdb").build()

        GlobalScope.launch {
            dataBase.contactdao().insertContact(Contact(0,"pramod kumar","9910914510"))
        }
    }
}