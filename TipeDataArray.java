public class TipeDataArray {
    public static void main(String[] args) {
        //Array adalah sekumpulan data yang memiliki tipe data yang sama

        //cara 1
        Object[] kumpulanNumber; //deklarasi
        kumpulanNumber = new Object[3];

        //cara 2
 //       int[] kumpulanNumber2 = new int[3];

        //cara 3
 //       int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};

        //cara memasukkan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "Daniel";
        kumpulanNumber[2] = 30L;

        //cara mengakses
        System.out.println(kumpulanNumber[1]);


        //length
        System.out.println(kumpulanNumber[0]);
    }
}
