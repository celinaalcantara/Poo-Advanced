package encap
class Cliente constructor(val nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(
        nome: String, endereco: String, telefone: String
    ) : this(nome, endereco) {
        this.telefone = telefone
    }

    init{
        if (nome.isEmpty()){
            throw Exception("Ação inválida")
        }
    }

    fun adicionar(valor: String) {
        if (valor.isEmpty()) {
            println("Ação inválida.")
            throw Exception
        }else{
            listaDeCompras.add(valor)
            println("Item $valor adicionado a lista.")
        }
    }

    fun remover(valor: String){
        if (valor.isEmpty()){
            println("Ação inválido.")
        }else if (listaDeCompras.contains(valor)){
            listaDeCompras.remove(valor)
            println("Item $valor removido da lista.")
        }else{
            println("Item $valor não encontrado.")
        }
    }

    fun listarItens(){
        println("Lista de Compra")

        listaDeCompras.forEach{
            println(it)
        }
    }

}
