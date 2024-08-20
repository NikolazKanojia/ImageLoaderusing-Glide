package com.example.gliddemo

import android.content.Context
import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.imagesrandomdemo.Contact
import com.example.imagesrandomdemo.R

class ContactAdapter(private val context:Context,private val contacts:List<Contact>):RecyclerView.Adapter<ContactAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row,parent,false))

    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact=contacts[position]
        holder.bind(contact)
    }
    inner class ViewHolder( itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bind(contact: Contact) {
            Glide.with(context)
                .load(contact.imageurl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(itemView.findViewById<ImageView>(R.id.imageView))





        }
    }
}