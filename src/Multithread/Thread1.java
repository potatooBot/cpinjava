package Multithread;


    public class Thread1 extends Thread{
        public Thread1(String setName){
            super(setName);
        }
        @Override
        public void run(){
            for (int i = 0; i <5 ; i++) {
                System.out.println("Thread1 Running "+Thread1.currentThread()+" "+i);
            }
        }

    }

