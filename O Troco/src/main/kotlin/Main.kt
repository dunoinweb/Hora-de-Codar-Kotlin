var saldo = 100.5 // Float
var opcao: Int = 0

fun main() {
    println("Informe seu nome de usuário")
    val name = readln().toString()
    println("Olá $name, bem vindo ao Duh Cash!")
    opcoes()
}

fun opcoes() {

    println("--- Duh Cash ----")
    println("")
    println("Escolha uma opção:")
    println("")
    println("1. Ver saldo")
    println("2. Extrato")
    println("3. Fazer saque")
    println("4. Fazer depósito")
    println("5. Transferência")
    println("6. Sair")
    opcao = readln().toInt()
    println("A opção selecionada foi: $opcao")

    when (opcao) {
        1 -> verificarSenha()
        2 -> verificarSenha()
        3 -> verificarSenha()
        4 -> verificarSenha()
        5 -> verificarSenha()
        6 -> sair()
        else -> erro()
    }
}

fun verificarSenha() {
    println("Informe sua senha (3589): ")
    var senhaInformada = readln().toInt()


    if (senhaInformada == 3589) {
        when (opcao) {
            1 -> verSaldo()
            2 -> extrato()
            3 -> fazerSaque()
            4 -> fazerDeposito()
            5 -> transferencia()
        }
    } else {
        println("Senha incorreta! Tente novamente.\n")
        verificarSenha()
    }
}

    fun verSaldo() {
        println("Seu saldo atual é: $saldo")
        opcoes()
    }

    fun extrato(){
        println("---- EXTRATO ----")
        println("- ABRIL -")
        println("- 06/04/2026 -")
        println("Ghoul's Coffee - R$11,90")
        println("- 01/04/2026 -")
        println("Blitz - R$33,00")
        println("Banquinha Augusta - R$12,90")
        println("")
        verSaldo()
    }

    fun fazerDeposito() {
        println("Qual o valor para depósito? ")
        val deposito = readlnOrNull()?.toFloatOrNull()

        if (deposito == null) {
            println("Por favor, informe um valor válido.")
            fazerDeposito()
        } else {
            saldo += deposito
            verSaldo()
        }
    }

    fun fazerSaque() {
        print("Qual o valor para saque? ")
        val saque = readLine()?.toFloatOrNull()

        if (saque == null) {
            println("Por favor, informe um número válido.")
            fazerSaque()
        } else if(saque > saldo) {
            println("Você não possui saldo suficiente para realizar esse saque. Tente novamente.")
            fazerSaque()
        } else {
            saldo -= saque
            verSaldo()
        }
    }
    fun transferencia(){
        var valorTransferencia: Double

                println("--- TRANSFERENCIA ---")
        println("Informe o número da conta que irá receber o valor:")
        var contaDestino = readln().toInt()

        if (contaDestino <= 0) {
            println("Número de conta inválido.")
            transferencia()
        } else {
            println("Informe o valor da transferência:")
            var valorTransferencia = readln().toDouble()

            while (valorTransferencia <= 0 || valorTransferencia > saldo) {
                println("Operacao não autorizada. Valor de transferência inválido.")
                valorTransferencia = readln().toDouble()
            }
            saldo -= valorTransferencia
            println("Transferência de R$$valorTransferencia para a conta '$contaDestino' realizada com sucesso!")
            verSaldo()
        }
    }

    fun erro() {
        println("Por favor, informe um número entre 1 a 6")
        main()
    }

    fun sair() {
        println("Você deseja sair?")
        println("1 - Sim")
        println("2 - Não")
        var opcaoSair = readln().toInt()
        if (opcaoSair == 1) {
            main()
        } else {
            println("Obrigado por usar meu programa")
        }
    }