package com.sbsj.mytodoapp.di

import com.sbsj.mytodoapp.data.repository.ToDoRepository
import com.sbsj.mytodoapp.domain.todo.GetToDoListUseCase
import com.sbsj.mytodoapp.domain.todo.InsertToDoListUseCase
import com.sbsj.mytodoapp.presentation.list.ListViewModel
import com.sbsj.mytodoapp.repository.TestToDORepository
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


internal val appTestModule = module {


    //ViewModel
    viewModel { ListViewModel(get())  }
    //UseCase
    factory { GetToDoListUseCase(get()) }
    factory { InsertToDoListUseCase(get()) }

    //Repository
    single<ToDoRepository> { TestToDORepository() }
}