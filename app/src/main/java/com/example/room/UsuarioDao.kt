package com.example.room

import androidx.room.*

@Dao
interface UsuarioDao {

    @Query("SELECT * FROM USUARIOS")
    fun getAll(): List<Usuarios>

    @Query("SELECT * FROM USUARIOS WHERE ID = :id")
    fun getById(id: Int): Usuarios

    @Update
    fun getUpdate(usuarios: Usuarios)

    @Insert
    fun insert(peopel: List<Usuarios>)

    @Delete
    fun delete(usuarios: Usuarios)
}