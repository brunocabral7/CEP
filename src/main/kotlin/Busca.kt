package br.unisanta.projeto

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


class Busca {

    fun BuscaEndereco(cep:String): String{

        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create("https://viacep.com.br/ws/$cep/json/"))
            .build()
        val response = client
            .send(request, BodyHandlers.ofString())

        return response.body()

    }
}