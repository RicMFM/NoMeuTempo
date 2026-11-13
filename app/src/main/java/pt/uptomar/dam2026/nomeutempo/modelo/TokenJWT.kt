package pt.uptomar.dam2026.nomeutempo.modelo

import com.google.gson.annotations.SerializedName

data class TokenJWT(
    @SerializedName("token") val token: String?
)