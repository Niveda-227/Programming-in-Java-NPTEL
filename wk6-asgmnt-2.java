public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }

public static void main(String[] args) {  
        Question62 ex = new Question62();  
        Thread t1= new Thread(ex);  
        t1.setName("Main Thread");
        t1.start();  
        System.out.println("Welcome to Java Week 6 New Question.");  
        t1.setName("Main Thread");
    }

}
