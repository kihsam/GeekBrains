package ru.geekbrains.lesson12;

public class MainClass {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arrAll = new float[SIZE];
    static float[] arrOneHalf = new float[HALF];
    static float[] arrTwoHalf = new float[HALF];


    public static void main(String[] args) throws InterruptedException {

        arrayRunning();
        arrayRuningThread();


    }

    public static void arrayRunning (){

        for (int i = 0; i < arrAll.length ; i++) {
            arrAll[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arrAll.length ; i++) {
            arrAll[i] = (float)(arrAll[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("время обработки целого масива: "+ estimatedTime + " млс");

    }

    public static void arrayRuningThread() throws InterruptedException {

        for (int i = 0; i < arrAll.length ; i++) {
            arrAll[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        System.arraycopy(arrAll, 0, arrOneHalf, 0, HALF);
        System.arraycopy(arrAll, HALF, arrTwoHalf, 0, HALF);

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("время разбивки масива на две части: "+ estimatedTime + " млс");


        Thread t1 = new Thread(() -> {
            long s = System.currentTimeMillis();
            for (int i = 0; i < arrOneHalf.length; i++) {
                arrOneHalf[i] = (float)(arrOneHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            long e = System.currentTimeMillis() - s;
            System.out.println("время просчета первой половины масива: "+ e + " млс");
         });

        Thread t2 = new Thread(() -> {
            long s = System.currentTimeMillis();
            for (int i = 0; i < arrTwoHalf.length; i++) {
                arrTwoHalf[i] = (float)(arrTwoHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            long e = System.currentTimeMillis() - s;
            System.out.println("время просчета второй половины масива: "+ e + " млс");

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        startTime = System.currentTimeMillis();

        System.arraycopy(arrOneHalf, 0, arrAll, 0, HALF);
        System.arraycopy(arrTwoHalf, 0, arrAll, HALF, HALF);

        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("время склеивания двух половин масива: "+ estimatedTime + " млс");

    }


}
