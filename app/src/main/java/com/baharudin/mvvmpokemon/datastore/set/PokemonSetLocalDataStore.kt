package com.baharudin.mvvmpokemon.datastore.set

import com.baharudin.mvvmpokemon.model.PokemonSet

class PokemonSetLocalDataStore : PokemonSetDataStore {
    private var cahces = mutableListOf<PokemonSet>()
    override suspend fun getSets(): MutableList<PokemonSet>? =
        if (cahces.isNotEmpty()) cahces else null

    override suspend fun addAll(sets: MutableList<PokemonSet>?) {
        sets?.let { cahces = it }

    }
}