// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO } 

data class ConteudoEducacional(val nome: String, var duracao: Int, val nivel: Nivel)

data class Usuario(val nome: String, val id: Int) 

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(novoUsuario: Usuario) {
        inscritos.add(novoUsuario)    
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
    
}


fun main() {
    
    val conteudoKotlin = listOf(
        ConteudoEducacional("funcoes", 30, Nivel.BASICO), 
        ConteudoEducacional("classes", 60, Nivel.INTERMEDIARIO),
        ConteudoEducacional("colecoes", 90, Nivel.AVANCADO),
    )
    
    val formacao = Formacao("kotlin", conteudoKotlin)
    
    println("O curso de formação ${formacao.nome}, possui os seguintes conteudos educacionais:")
    conteudoKotlin.forEach {
          println("${it.nome} com duração de ${it.duracao} minutos")
      }
   
    
    val aluno1 = Usuario("Bruna", 1)
    val aluno2 = Usuario("Amanda", 2)
    val aluno3 = Usuario("Nicolas", 3)
    
    formacao.matricular(aluno1)
    formacao.matricular(aluno2)
    formacao.matricular(aluno3)

   
    println("Lista de alunos matriculados:")
	formacao.inscritos.forEach {
        println("${it.nome}")
    }
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
