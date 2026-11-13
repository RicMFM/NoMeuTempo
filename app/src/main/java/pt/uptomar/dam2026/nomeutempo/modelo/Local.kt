package pt.uptomar.dam2026.nomeutempo.modelo

import com.google.gson.annotations.SerializedName

data class Local (
    @SerializedName("id") val id: Int,
    @SerializedName("titulo") val titulo: String,
    @SerializedName("legenda") val legenda: String?,
    @SerializedName("ano") val ano: Int,
    @SerializedName("latitude") val latitutde: Double,
    @SerializedName("longitude") val longitude: Double,
    @SerializedName("imagemAntiga") val imagemAntiga: String
)