package com.baharudin.mvvmpokemon.datastore.pokemon

import com.baharudin.mvvmpokemon.database.PokemonCardDao
import com.baharudin.mvvmpokemon.model.PokemonCard

class PokemonCardRoomDataStore(private val pokemonCardDao: PokemonCardDao) : PokemonCardDataStore {
    override suspend fun getPokemon(set: String): MutableList<PokemonCard>? {
        val response = pokemonCardDao.getAll(set)
        return if (response.isEmpty()) null else response
    }

    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {
        pokemons?.let { pokemonCardDao.insertAll(* it.toTypedArray()) }

    }
}