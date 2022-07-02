package com.sbsj.mytodoapp.domain.todo

import com.sbsj.mytodoapp.data.entity.ToDoEntity
import com.sbsj.mytodoapp.data.repository.ToDoRepository
import com.sbsj.mytodoapp.domain.UseCase

internal class InsertToDoListUseCase(
    private val toDoRepository: ToDoRepository
) : UseCase {


    suspend operator fun invoke(toDOList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDOList)
    }


}