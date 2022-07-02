package com.sbsj.mytodoapp.domain.todo

import com.sbsj.mytodoapp.data.entity.ToDoEntity
import com.sbsj.mytodoapp.data.repository.ToDoRepository
import com.sbsj.mytodoapp.domain.UseCase

internal class GetToDoListUseCase(
    private val toDoRepository: ToDoRepository
) : UseCase {

    suspend operator fun invoke(): List<ToDoEntity> {
        return toDoRepository.getToDoList()
    }
}