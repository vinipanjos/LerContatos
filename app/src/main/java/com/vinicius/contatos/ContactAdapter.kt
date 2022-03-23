package com.vinicius.contatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vinicius.contatos.databinding.ContactItemBinding

class ContactAdapter(val contactsList: ArrayList<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(contact: Contact) {
            val textName = itemView.findViewById<TextView>(R.id.tv_contact_name)
            val textPhone = itemView.findViewById<TextView>(R.id.tv_contact_phone_number)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber

        }
    }

}