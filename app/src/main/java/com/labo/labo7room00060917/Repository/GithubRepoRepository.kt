package com.labo.labo7room00060917.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.labo.labo7room00060917.Database.GithubDAO
import com.labo.labo7room00060917.Database.GithubRepo

class GithubRepoRepository(private val repoDao: GithubDAO) {

    @WorkerThread
    suspend fun insert(repo: GithubRepo){
        repoDao.insert(repo)
    }

    fun getAll(): LiveData<List<GithubRepo>> = repoDao.getAllRepos()

    fun nuke() = repoDao.nukeTable()

}