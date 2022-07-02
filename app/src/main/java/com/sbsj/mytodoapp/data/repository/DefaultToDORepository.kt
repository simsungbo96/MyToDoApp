package com.sbsj.mytodoapp.data.repository

import com.sbsj.mytodoapp.data.entity.ToDoEntity

class DefaultToDORepository :ToDoRepository {


    override suspend fun getToDoList(): List<ToDoEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun insertToDoList(toDoList: List<ToDoEntity>) {
        TODO("Not yet implemented")
    }
}