package com.example

//Projeto lista de compras
/*

Deve criar uma lista de compras, solicitando o nome da lista
Deve solicitar x itens para serem adicionados na lista
Deve conter um comando para finalizar a lista
Após finalizar, o usuário pode adicionar editar a lista adicionando items novos
E depois, pode listar a lista de compras
*/


fun main() {
    val listaComprasManager = ListaComprasManager()
    listaComprasManager.iniciar()
}
