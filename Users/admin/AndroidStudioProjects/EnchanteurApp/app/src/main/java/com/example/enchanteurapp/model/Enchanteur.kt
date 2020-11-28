package com.example.enchanteurapp.model

data class User (
    val username : String,
    val password : String,

    val creatureEnchanted : Int,
    val EnchantedReq : Int,
    val EnchantmentReq : Int,

    val UserPost : MutableList<UserPost>

)
data class UserPost (
    val animalImage : String?,
    val animalStory : String?,
    val animalName : String?,

    val animalType: String?,

    val animalLikes: String?,
    val animalDonations : Int,
    val animalLocation : Int,

)