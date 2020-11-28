package com.example.enchanteurapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.enchanteurapp.R
import com.example.enchanteurapp.model.UserPost
import kotlinx.android.synthetic.main.activity_home.view.*

class HomeAdapter (private val userPost: MutableList<UserPost> ) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_posts_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        val currentItem = userPost[position]


    }

    override fun getItemCount(): Int {
        return userPost.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animalImageView: ImageView = itemView.findViewById(R.id.animal_img)
        val animalStory : TextView = itemView.findViewById(R.id.animal_story)

        val animalHeartBtn: Button = itemView.findViewById(R.id.animal_liked)
        val animalLocBtn : Button = itemView.findViewById(R.id.animal_loc)
        val animalDonateBtn : Button = itemView.findViewById(R.id.animal_donate)
    }

}