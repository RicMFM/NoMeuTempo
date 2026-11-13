package pt.uptomar.dam2026.nomeutempo.modelo

import com.google.gson.annotations.SerializedName

data class Fotografia(
    @SerializedName("id") val id: Int,
    @SerializedName("localId") val localId: Int,
    @SerializedName("imagemAtual") val imagemAtual: String,
    @SerializedName("comentario") val comentario:String?,
    @SerializedName("data") val data:String

)