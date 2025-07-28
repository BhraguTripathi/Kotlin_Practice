public class KotlinFromJava {
    public static void main(String[] args) {
        Utils utils=new Utils();
        String greetings= utils.greet("Bhragu");
        System.out.println(greetings);

        String message=Utils.Companion.sayHello();
        System.out.println(message);
    }
}
