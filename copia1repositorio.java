public class copia1 {
    private int[] numeros;
    public copia1() {this.numeros = new int[10];}
    public void rellenararray(){
        for (int i = 0; i < this.numeros.length; i++){
            numeros[i] = (int) (Math.random()*20+1);
        }

    }
    public void imprimirarray(){
        for (int i = 0; i < this.numeros.length; i++){
            System.out.print(this.numeros[i] + " ");
        }
    }
}
