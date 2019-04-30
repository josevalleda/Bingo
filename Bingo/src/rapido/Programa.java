
package rapido;


public class Programa {
    public static void main(String[] args) {
        
        Bingo bingo = new Bingo();
        
        Carton carton1 = bingo.Generar_un_cartón();
        Carton carton2 = bingo.Generar_un_cartón();
        Carton carton3 = bingo.Generar_un_cartón();
        System.out.println("los numeros son" + carton1.getNumero());
        System.out.println("los numeros son" + carton2.getNumero());
        System.out.println("los numeros son" + carton3.getNumero());

               
        while(bingo.isFinalizado()==false){
            
             int ball = bingo.Extraer_una_bola();
            System.out.println("bola: "+ball);
        }
        for(Carton to: bingo.getCartones_ganadores()){
            System.out.println("carton ganador: "+to.getNumero());
        }
    }
}
