package com.example



class ListaCompras (var nomeLista: String){

    private val itens : MutableList<String> = mutableListOf()
    private var finalizado : Boolean = false;

    fun adicionarItem(item : String){
        itens.add(item)
    }
    fun finalizar(){
        finalizado = true;
    }

    fun estaFinalizada() : Boolean{
        return finalizado
    }

    fun listarItens() : List<String>{
        return itens
    }


}