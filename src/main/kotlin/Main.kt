package br.unisanta.projeto

import com.google.gson.Gson

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    System.out.println("Digite um cep: ")
    val cep = readLine()

    cep?.let {
        val consomeAPI = Busca()
        val json = consomeAPI.BuscaEndereco(it)
        val endereco = Gson().fromJson(json, Endereco::class.java)
        System.out.println(
            endereco
        )
    }

}