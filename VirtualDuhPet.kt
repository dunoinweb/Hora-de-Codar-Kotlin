class VirtualPet(val nome: String) {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelCansaco = 0
    var nivelIdade = 0

    fun alimentar() {
        nivelDeFome -= 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        println("$nome está brincando e se sentindo mais feliz.")
        cansaco()
    }

    fun descansar() {
        nivelCansaco -= 10
        println("$nome descansou um pouco")
    }

    fun cansaco() {
        nivelCansaco += 5
        println("$nome ficou mais cansado.")
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Idade de $nome: $nivelIdade")
    }

    fun passarTempo() {
        nivelDeFome += 3
        nivelFelicidade -= 3
        nivelCansaco += 10
        nivelIdade += 1
        println("$nome está ficando mais faminto com o passar do tempo.")
        println("$nome também ficou mais velho! Que legal.")
        if (nivelDeFome == 100 || nivelFelicidade == 0 || nivelCansaco == 100) {
            morte()
        }
    }

    fun morte() {
        if(nivelDeFome == 100){
            println("Poxa... $nome morreu de fome")
        } else if(nivelCansaco == 100) {
            println("$nome ficou muito cansado e preferiu dormir pra sempre")
        } else if(nivelFelicidade == 0) {
            println("Morreu de tristeza. Da próxima vez não deixe ele depressivo")
        }
    }
}

fun main() {
    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readLine() ?: "Baltazar Guilherme Tenório"
    val pet = VirtualPet(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Levar $nomePet para descansar")
        println("4. Verificar o status de $nomePet")
        println("5. Sair")

        val escolha = readLine()?.toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.descansar()
            4 -> pet.verificarStatus()
            5 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha inválida. Tente novamente.")
        }
        pet.passarTempo() // Simula o tempo que passa após cada ação
    }
}