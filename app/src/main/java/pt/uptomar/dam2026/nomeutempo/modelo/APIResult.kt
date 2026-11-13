package pt.uptomar.dam2026.nomeutempo.modelo

import  com.google.gson.annotations.SerializedName

data class APIResult (
    @SerializedName("codigo") val codigo: String?,
    @SerializedName("descricao") val descricao: String?
)