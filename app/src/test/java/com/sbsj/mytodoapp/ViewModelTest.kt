package com.sbsj.mytodoapp

import android.app.Application
import androidx.lifecycle.LiveData
import com.sbsj.mytodoapp.di.appTestModule
import com.sbsj.mytodoapp.livedata.LiveDataTestObserver
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule


@ExperimentalCoroutinesApi // test용 이므로 해당 어노테이션 사용.
internal class ViewModelTest : KoinTest  {

    @get:Rule
    val mockitoRule : MockitoRule = MockitoJUnit.rule()

    @Mock
    private lateinit var context: Application

    private val dispatcher  = TestCoroutineDispatcher()


    @Before
    fun setUp(){
        startKoin {
            androidContext(context)
            modules(appTestModule)
        }
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun tearDown(){
        stopKoin()
        Dispatchers.resetMain() // MainDispatcher 초기화 해야 메모리 누수가 발생 하지 않는다.

    }

    protected fun<T> LiveData<T>.test() : LiveDataTestObserver<T>{
        val testObserver = LiveDataTestObserver<T>()
        observeForever(testObserver)
        return testObserver
    }

}
