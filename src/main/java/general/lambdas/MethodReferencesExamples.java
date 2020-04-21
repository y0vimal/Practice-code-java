package general.lambdas;

public class MethodReferencesExamples {

    public static void main(String[] args) {
        int i = 10;
        //doProcess(i, a -> System.out.println(a));
        /*
        * using method references
        * when p -> method(p) it can be replace by the method reference
        * */

        doProcess(i, MethodReferencesExamples::display );

        MethodReferencesExamples methodReferencesExamples = new MethodReferencesExamples();
        methodReferencesExamples.execute(20);
    }
    public void execute(int a){
        doProcessNonStatic(a, v -> displayNonStatic(v));
        doProcessNonStatic(a, new MethodReferencesExamples() :: displayNonStatic);
    }
    public void displayNonStatic(int a){
        System.out.println(a);
    }
    public static void display(int a){
        System.out.println(a);
    }
    public static void doProcess(int i, Process p){
        p.print(i);
    }
    public  void doProcessNonStatic(int i, Process p){
        p.print(i);
    }
    interface Process{
        void print(int i);
    }
}
