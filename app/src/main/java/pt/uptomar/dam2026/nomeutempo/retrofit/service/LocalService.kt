package pt.uptomar.dam2026.nomeutempo.retrofit.service

import pt.uptomar.dam2026.nomeutempo.modelo.Local
import pt.uptomar.dam2026.nomeutempo.modelo.Fotografia
import pt.uptomar.dam2026.nomeutempo.modelo.TokenJWT
import pt.uptomar.dam2026.nomeutempo.modelo.APIResult
import retrofit2.Call
import retrofit2.http.*

interface LocalService {

    @FormUrlEncoded
    @POST("API/loginJWT.php")
    fun loginJWT(
        @Field("username") username: String?,
        @Field("password") password: String?
    ): Call<TokenJWT>

    @GET("API/getLocais.php")
    fun listLocais(@Header("Authorization") token: String): Call<List<Local>>

    @FormUrlEncoded
    @POST("API/addFotografia.php")
    fun addFotografia(
        @Field("local_id") localId: Int,
        @Field("imagem") imagem: String,
        @Field("comentario") comentario: String?
    ): Call<APIResult>
}