package com.example

class ListaComprasManager {

    //instanciando o listaCompras com lateinit para usar depois
    private lateinit var listaCompras: ListaCompras;

    fun iniciar(){
        println("Iniciando a Lista de Compras")
        criarLista()

        while(true){
            System.out.flush();
            println("Escolha uma opção: ")
            println("1 - Adicionar Item")
            println("2 - Finalizar Lista")
            println("3 - Editar lista adicionando novos items")
            println("4 - Listar Items adicionados")
            println("5 - Sair.")
            when(readln().toInt()){
                1 -> adicionarItem()
                2 -> finalizarLista()
                3 -> editarLista()
                4 -> listarItens()
                5 -> {
                    println("Saindo")
                    break
                }
                else -> println("Opção inválida")
            }
        }
    }

    private fun criarLista(){
        println("Crie um nome para sua lista:")
        val nome = readln()
        listaCompras = ListaCompras(nome);
        println("Lista criada com o nome: $nome")
    }

    private fun adicionarItem(){
        println("Digite o nome do item para adicionar na lista: ")
        val item = readln()
        listaCompras.adicionarItem(item)
        print("Item $item adicionado!")
    }


    private fun finalizarLista(){
        listaCompras.finalizar()
        println("Lista finalizada")
    }

    private fun editarLista(){
        if(!listaCompras.estaFinalizada()){
            println("A lista ainda não foi finalizada, finalize para editar")
            return
        }
        println("Digite o nome do novo item:")
        val item = readln();
        listaCompras.adicionarItem(item)
    }

    private fun listarItens(){
        println("Itens da lista: '${listaCompras.nomeLista}': ")
        listaCompras.listarItens().forEach{println(it)}
    }
}