# Java
Exercícios dos cursos da formação Java do Alura


Javadoc - lista completa:

@author (usado na classe ou interface)
@version (usado na classe ou interface)
@param (usado no método e construtor)
@return (usado apenas no método)
@exception ou @throws (no método ou construtor)
@see
@since
@serial
@deprecated


Como criar um JAR - Java Archive

File -> Project Structure -> Artifacts -> + (mais) -> JAR -> From modules with dependencies
Na opção Main Class, aponte para a classe “Main” do seu projeto
Para gerar o jar, Build -> Build Artifacts, selecionar o seu jar e a opcao build.
O arquivo será gerado na pasta out/artifacts/.
Para executar: java -jar <nome do seu projeto>





System.out.prinlt();

O que é? Qual a visibilidade? Acesso?

System 
 - classe, java.lang, acesso público (public)

out
 - atributo, acesso publico, referencia, static

println
 - metodo (pq tem parenteses), acesso publico, não static, sobrecarga, não joga excecoes do tipo checked
