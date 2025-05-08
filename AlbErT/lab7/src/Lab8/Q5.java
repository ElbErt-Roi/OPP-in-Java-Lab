package Lab8;

class MultiThread extends Thread{
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName()+" and priority: "+Thread.currentThread().getPriority());
    }
}

public class Q5 {
    public static void main(String[] args) {
        MultiThread ft = new MultiThread();
        MultiThread st = new MultiThread();
        ft.setName("First");
        st.setName("Second");
        ft.setPriority(1);
        st.setPriority(10);
        ft.start();
        st.start();
    }
}
