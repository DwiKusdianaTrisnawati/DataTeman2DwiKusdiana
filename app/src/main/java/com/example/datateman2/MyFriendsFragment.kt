package com.example.datateman2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import kotlinx.android.synthetic.main.my_friends_item.*

class MyFriendsFragment : Fragment() {
    lateinit var  listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul Arifin","Laki-laki",
            "samsul@stimata.ac.id", "08123456789", "Bogor"))
        listTeman.add(MyFriend("Dian Wahyuningsih","Perempuan",
            "dian@stimata.ac.id","08987654321","Sidoarjo" ))
        listTeman.add(MyFriend("Diana","Perempuan",
            "diana@stimata.ac.id","08987654321","Surabaya" ))
        listTeman.add(MyFriend("widhi","Laki-laki",
            "widhi@stimata.ac.id","08987654321","lawang" ))
        listTeman.add(MyFriend("Susi","Perempuan",
            "susi@stimata.ac.id","08987654321","Banyuwangi" ))
        listTeman.add(MyFriend("Irma","Perempuan",
            "irma@stimata.ac.id","08987654321","Banjarmasin" ))
        listTeman.add(MyFriend("Rima","Perempuan",
            "rima@stimata.ac.id","08987654321","Palembang" ))
        listTeman.add(MyFriend("Mega","Perempuan",
            "mega@stimata.ac.id","08987654321","Lampung" ))
        listTeman.add(MyFriend("Panji","Laki-laki",
            "panji@stimata.ac.id","08987654321","Bengkulu" ))
        listTeman.add(MyFriend("Bagas","Laki-laki",
            "bagas@stimata.ac.id","08987654321","Mojokerto" ))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun tampilTeman(){
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }
    private fun initView() {
            simulasiDataTeman()
            tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

        override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
}