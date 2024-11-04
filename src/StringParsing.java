public class StringParsing {

    public static void main(String[] args) {
        StringParsing p = new StringParsing();
    }

    public StringParsing(){
        String s = "Good morning! The weather is 65 degrees and sunny.";
        System.out.println(s.indexOf("degrees"));
        System.out.println(s.indexOf('i', 10));
        System.out.println(s.contains("sunny"));
        System.out.println(s.substring(14));
    }

}
