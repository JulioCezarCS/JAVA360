package br.com.romulo.curso.arquivos;

public class Algoritmo50 {
    public static void main(String[] args) {

        try{ //tentar
            int idade = Integer.parseInt(IO.readln("Qual a sua idade?"));
            String resultado = (idade >= 18) ? "maior" : "Menor";
            IO.print(resultado);

        }catch(NumberFormatException e){
            //erro
            //e.getMessage() - quando estiver na web use print( ) console( )
            IO.println("😜"+e.getMessage()+"valor inválido. Digite um número");
        }finally{
            //conclusão (independe se deu certo ou errado)
            //Janelinha emojis Windows "."
            IO.println("😊- Encerrando SystemSys!");
        }
        
    }
}
