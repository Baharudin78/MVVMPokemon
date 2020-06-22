package com.baharudin.mvvmpokemon.repository

import com.baharudin.mvvmpokemon.model.PokemonCard
import com.baharudin.mvvmpokemon.datastore.pokemon.PokemonCardDataStore

class PokemonCardRepository private constructor() : BaseRepository<PokemonCardDataStore>() {
        suspend fun getPokemon(set :String): MutableList<PokemonCard>?{
            val cahche = localDataStore?.getPokemon(set)
            if (cahche != null) return cahche
            val response = remoteDataStore?.getPokemon(set)
            localDataStore?.addAll(set,response)
            return response
        }
    companion object{
        val instance by lazy { PokemonCardRepository() }
    }
}