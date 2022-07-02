package com.sbsj.mytodoapp.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sbsj.mytodoapp.data.entity.ToDoEntity
import com.sbsj.mytodoapp.domain.todo.GetToDoListUseCase
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


//필요한 UseCase
//1. GetToDolistUseCase
//2. UpdateToDOUseCase
//3. DeleteAllToDoUseCase
internal class ListViewModel(
    private val getToDoListUseCase: GetToDoListUseCase


) : ViewModel() {
    private var _toDoListLiveData = MutableLiveData<List<ToDoEntity>>()
    val toDoListLiveData :LiveData<List<ToDoEntity>> = _toDoListLiveData

    fun fetchData(): Job =viewModelScope.launch{
        _toDoListLiveData.postValue((getToDoListUseCase()))
    }

}