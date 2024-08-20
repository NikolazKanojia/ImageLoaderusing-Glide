package com.example.imagesrandomdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gliddemo.ContactAdapter

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val rvcontact=findViewById<RecyclerView>(R.id.recyclerview)
        val contacts=createContact()
        rvcontact.adapter= ContactAdapter(this,contacts)
        rvcontact.layoutManager= LinearLayoutManager(this)
    }

    private fun createContact():List<Contact> {
        val contacts= mutableListOf<Contact>()
        for (i in 1..5000)
        {
            contacts.add(Contact(i))
        }
        return contacts
    }
}