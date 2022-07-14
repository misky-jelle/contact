package com.misky.contact

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.misky.contact.databinding.ContactListItemsBinding



class contactRVAdapter(var contactlist:List<contact>):RecyclerView.Adapter<ContacViewHolder>() {
    lateinit var binding:contactRVAdapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacViewHolder {
        var binding =contactlist.inflate(LayoutInflater.from(parent.context),parent, false)
        return ContacViewHolder(binding)
    }
//            Picasso.get().load(currentFocus.image).into(imgContact)
        override fun onBindViewHolder(holder: ContacViewHolder, position: Int) {
        val context=holder.itemView.context

        var currentContact = contactlist.get(position)
             with(holder.binding){
            tvName.text = currentContact.name
            tvEmail.text = currentContact.email
            tvLocation.text = currentContact.location
//            Picasso.get()
//                .load(currentContact.image)
//                .into(imgProfile)
            cvLayout.setOnClickListener {
                val intent= Intent(context,contactRVAdapter::class.java)
                context.startActivity(intent)
                holder.binding.imgProfile.setOnClickListener {
                    Toast.makeText(context,"You have clicked on my face",Toast.LENGTH_LONG)
                        .show()
                }

            }
//                .error(R.drawable.)
//                .resize(400,400)
//                .centerCrop()
        }
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }

    override fun onBindViewHolder(holder: ContacViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
class contactViewHolder(var binding: ContactListItemsBinding): RecyclerView.ViewHolder(binding.root){
}
