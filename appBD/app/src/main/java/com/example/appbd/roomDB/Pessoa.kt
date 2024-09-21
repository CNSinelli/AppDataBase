package com.example.appbd.roomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pessoa(
    val nome: String,
    val tel: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
