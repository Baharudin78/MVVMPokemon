package com.baharudin.mvvmpokemon.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class PokemonCard (
    var nama : String?,
    @SerializedName("imageUrl") var image : String?,
    var rarity : String?,
    var serrier : String?,
    var Set : String?,
    @PrimaryKey var id : String
) : Parcelable{
    data class PokemonCardResponse(
        var card : MutableList<PokemonCard>
    )
}