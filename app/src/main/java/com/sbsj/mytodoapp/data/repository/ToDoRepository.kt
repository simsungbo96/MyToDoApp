package com.sbsj.mytodoapp.data.repository

import com.sbsj.mytodoapp.data.entity.ToDoEntity


//1. insertToDoList
//2. getToDoList


interface ToDoRepository {

    suspend fun getToDoList(): List<ToDoEntity>

    suspend fun insertToDoList(toDoList : List<ToDoEntity>)


}