package com.baharudin.mvvmpokemon.repository

import com.baharudin.mvvmpokemon.datastore.set.PokemonSetDataStore
import com.baharudin.mvvmpokemon.model.PokemonSet

class PokemonSetRepository private constructor() : BaseRepository<PokemonSetDataStore>() {

    suspend fun getSets() : MutableList<PokemonSet>?{
        val cahche = localDataStore?.getSets()
        if (cahche != null) return cahche
        val response = remoteDataStore?.getSets()
        localDataStore?.addAll(response)
        return response
    }companion object{
        val instance by lazy { PokemonSetRepository() }
    }
}