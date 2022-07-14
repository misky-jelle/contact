package com.misky.contact

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class contact_list_item (var contactlist:List<contact>):RecyclerView.Adapter<ContacViewHolder>() {
    lateinit var binding:contact_list_item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacViewHolder {
        var binding =contactlist.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContacViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContacViewHolder, position: Int) {
        val context=holder.itemView.context
        var currentContact = contactlist.get(position)
        val contactBinding = holder.binding
        contactBinding.tvName.text = currentContact.name
        contactBinding.tvEmail.text = currentContact.email
        contactBinding.tvLocation.text = currentContact.location

        Picasso.get()
            .load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(contactBinding. imgcontact)

        contactBinding.cvcontact.setOnClickListener {
            val intent=Intent(context,::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("LOCATION",currentContact.location)
            intent.putExtra("Email",currentContact.email)

            context.startActivity(intent)
        }
        holder.binding.imgcontact.setOnClickListener {
            Toast.
            makeText(context,"You have to click on the face",Toast.LENGTH_LONG)
                .show()
        }
    }
    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContacViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){


}