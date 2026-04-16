public class copia2 {
    private int[] numeros;
    public copia2() {this.numeros = new int[10];}
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
    public void sumararray() {
        int suma = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            suma += this.numeros[i];
        }
        System.out.println("La suma del array es: " + suma);
    }
}
