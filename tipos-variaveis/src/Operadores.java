public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);
	
//qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";

        
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;

        
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";

        
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;

        
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);

        
        System.out.println(concatenacao);

        //Operador Ternario
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/ 
    }
    
}
