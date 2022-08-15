package com.example.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Usuarios (

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nombre: String,
    val usuario: String,
    val password: String
)