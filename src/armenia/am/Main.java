package armenia.am;

public class Main {

    public static void main(String[] args) {

        /*

            \\d - one digit
            + - one and more
            * - null ore more
            ? - իրենից առաջ կարող է մեկ սիմվոլ լինել կամ չլինել
            | - կամ
            \\ they make common symbol into special, and the opposite special to common

        */
        System.out.println("a".matches("\\d")); // false
        System.out.println("11".matches("\\d")); // false
        System.out.println("-7".matches("\\d")); // false
        System.out.println("7".matches("\\d")); // true


        System.out.println(" === '*' and '+' === ");
        System.out.println("".matches("\\d*")); // true
        System.out.println("".matches("\\d+")); // false
        System.out.println(
                "414".matches("\\d+") && "414".matches("\\d*")
        ); // true

        System.out.println("trying aaaab and acccb");
        System.out.println("aaaab".matches("a*b")); // true
        System.out.println("acccb".matches("a*b")); // true

        System.out.println("-444".matches("-\\d+")); // true

        System.out.println("How made regex which will math symbols with '+' or '-' ");
        System.out.println("458".matches("(-|\\+)?\\d+")); // true
        System.out.println("-458".matches("(-|\\+)?\\d+")); // true
        System.out.println("+458".matches("(-|\\+)?\\d+")); // true
        System.out.println("@458".matches("(-|\\+)?\\d+")); // false
     /*
            \\d = [0-9]
            [A-Za-z] - English all letters
            [^abc] - բացառում է իրենից հետո եղած սիմվոլներից որևէ մեկը
            ^ - սկիզբ
            $ - վերջ
            . - any symbol
            {2} - max two symbols
            {2,} - two to infinite
            {2,4} ֊ from two to four symbols
     */
        System.out.println(" [A-Za-z] examples"); // false
        System.out.println("abDc1253".matches("[A-Za-z]+\\d+")); // true
        System.out.println("ab1Dc1253".matches("[A-Za-z]+\\d+")); // false
        System.out.println("barev".matches("[^abc]*")); // false
        System.out.println("hello".matches("[^abc]*")); // true
        System.out.println("easy main url checker");
        System.out.println("https://google.am".matches("https?://.*\\..{2,}")); // true

    }
}
