package Thread;

public class TestThread implements Runnable{
    public int tong;

    public TestThread(){
        this.tong = 1000;
    }

    public void rutTien() throws InterruptedException {
        if(tong > 0){
            Thread.sleep(1000);
            this.tong -= 1000;
            System.out.println(tong);
        }
        else
            System.out.println("het tien");
    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TestThread t = new TestThread();
        TestThread t3 = new TestThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.run();
        t2.run();
    }
}
