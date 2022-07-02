package com.sbsj.mytodoapp.repository

import com.sbsj.mytodoapp.data.entity.ToDoEntity
import com.sbsj.mytodoapp.data.repository.ToDoRepository

class TestToDORepository : ToDoRepository {


    private val toDoList : MutableList<ToDoEntity> = mutableListOf()

    override suspend fun getToDoList(): List<ToDoEntity> {
       return toDoList
    }

    override suspend fun insertToDoList(toDoList: List<ToDoEntity>) {
       this.toDoList.addAll(toDoList)
    }
}