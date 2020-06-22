package com.baharudin.mvvmpokemon.datastore.pokemon

import com.baharudin.mvvmpokemon.model.PokemonCard

class PokemonCardLocalDataStore : PokemonCardDataStore {

    private val cahche = mutableMapOf<String,MutableList<PokemonCard>?>()
    override suspend fun getPokemon(set: String): MutableList<PokemonCard>? =
        if (cahche.contains(set)) cahche[set] else null


    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {
        cahche[set] = pokemons
    }

}