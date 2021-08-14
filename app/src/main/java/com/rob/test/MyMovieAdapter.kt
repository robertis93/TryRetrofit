package com.rob.test

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.rob.test.databinding.ItemLayoutBinding
import com.squareup.picasso.Picasso

//class MyMovieAdapter(private val context: Context, private val movieList: MutableList<ForecastResponse>) :
//    RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {
//
//    class MyViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
//        val image: ImageView = binding.imageMovie
//        val txt_name: TextView = binding.txtName
//        val txt_team: TextView = binding.txtTeam
//        val txt_createdby: TextView = binding.txtCreatedby
//
//        fun bind(listItem: ForecastResponse) {
//            image.setOnClickListener {
//                Toast.makeText(it.context, "нажал на ${binding.imageMovie}", Toast.LENGTH_SHORT)
//                    .show()
//            }
//            itemView.setOnClickListener {
//                Toast.makeText(it.context, "нажал на ${binding.txtName}", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val binding =
//            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return MyViewHolder(binding)
//    }
//
//    override fun getItemCount() = movieList.size
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val listItem = movieList[position]
//        holder.bind(listItem)
//
//      //  Picasso.get().load(movieList[position].imageurl).into(holder.image)
//        holder.txt_name.text = movieList[position].dtTxt
//        holder.txt_team.text = movieList[position].clouds.all.toString()
//        holder.txt_createdby.text = movieList[position].rain.toString()
//    }
//}