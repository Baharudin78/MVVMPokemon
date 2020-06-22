package com.baharudin.mvvmpokemon.repository


open class BaseRepository<DataStore> {

    protected var localDataStore : DataStore ? = null
    protected var remoteDataStore : DataStore? = null

    fun init(localDataStore : DataStore, remoteDataStore : DataStore ){
        this.localDataStore = localDataStore
        this.remoteDataStore = remoteDataStore
    }
}