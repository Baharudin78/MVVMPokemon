package com.baharudin.mvvmpokemon.datastore.set

import com.baharudin.mvvmpokemon.model.PokemonSet

interface PokemonSetDataStore {
    suspend fun getSets() : MutableList<PokemonSet>?
    suspend fun addAll(sets:MutableList<PokemonSet>?)
}