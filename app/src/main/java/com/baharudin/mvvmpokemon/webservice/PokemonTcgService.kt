package com.baharudin.mvvmpokemon.webservice

import com.baharudin.mvvmpokemon.model.PokemonCard
import com.baharudin.mvvmpokemon.model.PokemonSet
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonTcgService {

    @GET("card")
    suspend fun getCards(@Query("set")set : String ) : Response<PokemonCard.PokemonCardResponse>

    @GET("sets")
    suspend fun getSets() : Response<PokemonSet.PokemonSetResponse>
}