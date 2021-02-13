package Advanced.classes.anonimous_classes;

public class AnonimusMainExample {
    public static void main(String[] args) {


        HttpExecuater executor = new HttpExecuater() {
            public String executeRequest() {
                return "Siandien sviecia saule";
            }

        };
        System.out.println(executor.executeRequest());
    }
}

