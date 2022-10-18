package stringpool;

public class StringPool {

    public static void main(String[] args) {

        //ex1
        String str1 = "ABC";
        String str2 = "ABC";
        //서로 다른 객체니까 == 연산의 결과는 false 여야 하지 않을까?
        System.out.println(str1 == str2);

        //ex2
        String str3 = new String("ABC");
        String str4 = new String("ABC");
        //new 생성자로 String 객체를 만들면 차이가 있나?
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);

        //ex3
        long beforeTime = System.currentTimeMillis();
        String s = "";
        int n = 1000000;
        for (int i = 0; i < n; i++) {
            s += "O";
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(s) : " + secDiffTime);

        long beforeTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        int n2 = 1000000;
        for (int i = 0; i < n; i++) {
            sb.append("A");
        }
        long afterTime2 = System.currentTimeMillis();
        long secDiffTime2 = (afterTime2 - beforeTime2)/1000;
        System.out.println("시간차이2(s) : " + secDiffTime2);


    }
}
