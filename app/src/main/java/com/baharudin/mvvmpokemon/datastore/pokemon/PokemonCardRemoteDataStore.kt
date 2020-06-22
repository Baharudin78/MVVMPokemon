package com.baharudin.mvvmpokemon.datastore.pokemon

import com.baharudin.mvvmpokemon.model.PokemonCard
import com.baharudin.mvvmpokemon.webservice.PokemonTcgService

class PokemonCardRemoteDataStore (private val pokemonTcgService : PokemonTcgService) : PokemonCardDataStore {
    override suspend fun getPokemon(set: String): MutableList<PokemonCard>? {
        val response = pokemonTcgService.getCards(set)
        if (response.isSuccessful) return response.body()?.card

        throw Exception("Terjadi kesalahan saat Request data , status error ${response.code()}")
    }

    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {

    }

}