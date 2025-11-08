public class Ques4 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);//returns true beacuse value lie in range 127 to -128 in Integer cache
        System.out.println(c == d);//returns false beacuse value dosent lie in range 127 to -128 in Integer cache
        System.out.println(a.equals(b));//returns true beacuse it compares actual value not object references
    }
}
