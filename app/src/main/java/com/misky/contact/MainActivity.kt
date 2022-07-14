package com.misky.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.misky.contact.databinding.ActivityMainBinding
import com.misky.contact.databinding.ContactListItemsBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact=contact("Anzal Yussuf"," anzalyussuf@gmail.com","wajir,Kenya")
        var contact1=contact("Ramla YUssuf"," ramlajelle@gmail.com","wajir,Kenya")
        var contact2=contact("Hamza YUssuf"," hamzayussuf@gmail.com","wajir,Kenya")
        var contact3=contact("Adhnan YUssuf"," adhnanaden@gmail.com","wajir,Kenya")
        var contact4=contact("Muna YUssuf"," munayussuf@gmail.com","wajir,Kenya")
        var contact5=contact("Malbi YUssuf"," malbijelle@gmail.com","wajir,Kenya")
        var contact6=contact("Mahir YUssuf"," mahiryussuf@gmail.com","wajir,Kenya")


        var  contactList=listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6)
        var contactAdapter=contactRVAdapter(contactList)
//        binding.rcvC.layoutManager = LinearLayoutManager(this)
//        binding.rcvTweet.adapter=contactAdapter

    }
    }
class contactList(var binding: ContactListItemsBinding): RecyclerView.ViewHolder(binding.root){
}