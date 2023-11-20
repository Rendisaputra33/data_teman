package com.example.data_teman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.data_teman.entity.Friend
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.friend_item.*

class FriendListAdapter(private val ctx: Context, private val items: ArrayList<Friend>):
    RecyclerView.Adapter<FriendListAdapter.ViewHolder>() {
    class ViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: Friend) {
            friend_name.text = item.name
            friend_email.text = item.email
            friend_phone.text = item.phone
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
        LayoutInflater.from(ctx).inflate(
            R.layout.friend_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }
}