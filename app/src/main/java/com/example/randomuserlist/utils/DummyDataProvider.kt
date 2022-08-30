package com.example.randomuserlist.utils

data class RandomUser(
    val name: String = "p2glet",
    val description: String = "android jetpack compose tutorial",
    val profileImage: String = "https://randomuser.me/api/portraits/women/19.jpg"
)

object DummyDataProvider {

    val userList = List<RandomUser>(50) { RandomUser() }
}