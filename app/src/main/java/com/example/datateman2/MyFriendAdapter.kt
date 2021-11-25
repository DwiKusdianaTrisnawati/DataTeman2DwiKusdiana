package com.example.datateman2

import android.content.Context
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.*

class MyFriendAdapter(private val Context: Context, private val items:ArrayList<MyFriend>):
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(Context).inflate(R.layout.my_friends_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: MyFriend) {
            txtFriendName.text=item.nama
            txtFriendEmail.text=item.email
            txtFriendTlp.text=item.telp
        }
    }
}