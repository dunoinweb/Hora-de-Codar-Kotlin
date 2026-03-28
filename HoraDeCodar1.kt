fun main () {
    questao1()
}
    fun questao1 () {

        println("--- FUSCA VRUM VRUM ---")
        val nome_do_carro = "Fusca"
        println(nome_do_carro)
        questão2()
    }

    fun questão2 () {
        var nome_do_usuario: String

        println("--- NOME DO USUÁRIO ---")
        println("Olá, qual seu nome?")
        nome_do_usuario = readln()
        println("Olá, $nome_do_usuario" )
        questão3()
    }

    fun questão3 () {
        var nome_do_usuario: String

        println("--- NOME E IDADE ---")
        println("Olá, qual seu nome?")
        nome_do_usuario = readln()
        println("E qual sua idade?")
        var idade = readln().toInt()
        println("Olá, $nome_do_usuario. Sua idade é $idade anos." )
        questao4()
    }

    fun questao4 () {

        println("--- CÁLCULOS DE ÁREAS ---")

        // Retângulo

        println("Para a área do retângulo o valor da altura")
        var a = readln().toDouble()
        println("Agora informe o valor da base")
        var b = readln().toDouble()
        var area_retangulo = a * b
        println("A base do retângulo é $area_retangulo")

        // Quadrado

        println("Para a área do quadrado o valor dos lados do quadrado.")
        var l = readln().toDouble()
        var area_quadrado = l * l
        println("A área do quadrado é $area_quadrado")

        // Trapézio

        println("Para a área do trapézio, fale o valor da base maior")
        var bMaior = readln().toDouble()
        println("Fale o valor da base menor")
        var bMenor = readln().toDouble()
            while (bMenor >= bMaior) {
                println("Escreva um valor menor que o valor da base maior")
                bMenor = readln().toDouble()
            }
        println("Informe o valor da altura")
        var altura_do_trapezio = readln().toDouble()
        var area_do_trapezio = (bMaior + bMenor) * altura_do_trapezio / 2
        println("A área do trapézio é $area_do_trapezio")

        // Paralelogramo

        println("Para o cálculo da área do paralelogramo fale o valor da altura")
        var altura_do_paralelogramo = readln().toDouble()
        println("Agora, diga o valor da base")
        var base_do_paralelogramo = readln().toDouble()
        var area_do_paralelogramo = base_do_paralelogramo * altura_do_paralelogramo
        println("A área do paralelogramo é $area_do_paralelogramo")

        // Triângulo

        println("Para o cálculo da área do triângulo fale o valor da altura")
        var altura_do_triangulo = readln().toDouble()
        println("Agora, diga o valor da base")
        var base_do_triangulo = readln().toDouble()
        var area_do_triangulo = (altura_do_triangulo * base_do_triangulo) / 2
        println("A área do triângulo é $area_do_triangulo")

        // Círculo

        println("Para o cálculo da área do círculo fale o valor do raio")
        var raio_do_circulo = readln().toDouble()
        var area_do_circulo = 3.14159 * (raio_do_circulo * raio_do_circulo)
        println("A área do círculo é $area_do_circulo")
        println("--- Obrigado por ter usado meu programa :D ---")
    }