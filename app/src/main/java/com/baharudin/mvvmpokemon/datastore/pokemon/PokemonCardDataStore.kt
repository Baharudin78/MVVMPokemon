package com.baharudin.mvvmpokemon.datastore.pokemon

import com.baharudin.mvvmpokemon.model.PokemonCard

interface PokemonCardDataStore {
    suspend fun getPokemon(set : String) : MutableList<PokemonCard>?
    suspend fun addAll(set: String,pokemons : MutableList<PokemonCard>?)
}