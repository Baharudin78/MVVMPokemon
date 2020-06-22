package com.baharudin.mvvmpokemon.datastore.set

import com.baharudin.mvvmpokemon.model.PokemonSet
import com.baharudin.mvvmpokemon.webservice.PokemonTcgService

class PokemonSetRemoteDataStore(private val pokemonTcgService: PokemonTcgService):PokemonSetDataStore {
    override suspend fun getSets(): MutableList<PokemonSet>? {
        val response = pokemonTcgService.getSets()
        if (response.isSuccessful)return response.body()?.sets

        throw Exception("Terjad kesalahan saat melakukkan request data , status error ${response.code()}")
    }

    override suspend fun addAll(sets: MutableList<PokemonSet>?) {

    }

}