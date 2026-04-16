public class array {
    private int[] numeros;
    public array() {
        this.numeros = new int[10];
    }
    public void rellenararray(){
        for (int i = 0; i < this.numeros.length; i++){
            numeros[i] = (int) (Math.random()*20+1);
        }

    }
    

}
