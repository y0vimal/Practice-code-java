package general.lambdas;


public class RunnableExample {
    public static void main(String[] args){

        Thread thread = new Thread(new general.lambdas.RunnableImpl());
        thread.run();

        /*Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("running the main thread");
            }
        });
        thread.run();;*/

    Thread lambdaThread = new Thread( () ->{
        System.out.println("running the main thread");
    } );
    lambdaThread.run();


    }
}
