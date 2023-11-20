package com.example.data_teman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data_teman.entity.Friend
import kotlinx.android.synthetic.main.fragment_friend.*

class FriendFragment : Fragment() {

    private lateinit var friendList: ArrayList<Friend>

    fun setupDataFriends() {
        friendList = ArrayList()
        friendList.add(Friend("Rendi Saputra", "rendi_22310011@stimata.ac.id", "085648656692"))
        friendList.add(Friend("Rendi Pangalila", "rendi_22310011@stimata.ac.id", "085648656692"))
    }

    fun setupUiListFriend() {
        listContainer.layoutManager = LinearLayoutManager(activity)
        listContainer.adapter = FriendListAdapter(requireActivity(), friendList)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupDataFriends()
        setupUiListFriend()
    }
}