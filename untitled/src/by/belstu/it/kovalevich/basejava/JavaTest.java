package by.belstu.it.kovalevich.basejava;

import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Objects;

/**
 * Тестировка
 * @author Dmitry Bonchichy
 * @version 1.0
 */
public abstract class JavaTest {
    /**
     * Просто помойка
     *
     */
    private String forReplace = "qwertq";
    public final int five = 5;
    public static final int four = 4;
    private int nine = 9;

    public void replace(char oldchar, char newchar){
        /**
         * @return void
         * @param oldchar newchar
         * @throw -
         */
        StringBuilder buf = new  StringBuilder();
        for (int i = 0; i < this.forReplace.length(); i++) {
            if(oldchar == this.forReplace.toCharArray()[i]){
                buf.append(newchar);
            }else{
                buf.append(this.forReplace.toCharArray()[i]);
            }
        }
        this.forReplace=buf.toString();
        System.out.println(forReplace);
    }

    public int getNine() {
        return nine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaTest javaTest = (JavaTest) o;
        return five == javaTest.five && nine == javaTest.nine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(five, nine);
    }

    @Override
    public String toString() {
        return "JavaTest{" +
                "five=" + five +
                ", nine=" + nine +
                '}';
    }

    public void setNine(int nine) {
        this.nine = nine;
    }

    public JavaTest() {
    }


    public static void main(String[] args) {
        char b = 'a';
        int x = 5;
        short s = 10;
        byte by = 12;
        long l = 123;
        boolean bool = true;
        double d = 1.23;
        boolean bool2 = false;
        String str1 = new String("");
        str1 += x;
        str1 += b;
        str1 += d;
        by += x;
        x += d + l;
        l = x + 2147483647;
        //static int sint;
        //System.out.println(sint);;
        bool = bool && bool2;
        bool = bool2 ^ bool;
        //x = bool+bool2;
        //long max = 9223372036854775807;
        //long maxx = 0x7fff_ffff_fff;
        char a1 = '\u0061';
        char a2 = 'a';
        char a3 = 97;
        char a4 = (char) (a1 + a2 + a3);
        double ddd = 3.45 % 2.4;
        double divide = 0.0 / 0.0;
        double divide1 = 1.0 / 0.0;
        double logg = log(-345);
        float fl = Float.intBitsToFloat(0x7F800000);
        float fl2 = Float.intBitsToFloat(0xFF800000);
        int p = (int) round(PI);
        int e = (int) round(E);
        System.out.println(Math.min(p, e));
        double rnd = Math.random();
        Boolean bool1 = Boolean.valueOf("Some String");
        Character ch = 'c';
        Integer int1 = 1234 >>> 1;
        Short short1 = 234 >> 1;
        Long long1 = ~1234L;
        Double doubleMin = Double.MIN_VALUE;
        Double doubleMax = Double.MAX_VALUE;
        Long longMin = Long.MIN_VALUE;
        Long longMax = Long.MAX_VALUE;
        int xxxx = 5;
        Integer bbbb = 10;
        xxxx = bbbb;             // OK, атораспаковка
        bbbb = xxxx * 123;       // OK, автоупаковка
        String str5 = "12314";
        int int12 = Integer.parseInt(str5);
        //toHexString ; compare ;
        //toString ; bitCount ; isNaN
        bbbb = Integer.valueOf(Integer.toHexString(12356));
        bbbb = Integer.compare(12, 16);
        bbbb = Integer.bitCount(1234);
        byte[] byteArray = str5.getBytes();
        System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));
        String string = new String(byteArray);
        System.out.println("байты в строку : " + string);
        //преобразуйте строку в логический тип 2-мя способами
        String str6 = "True";
        boolean bool6, bool7;
        bool6 = Boolean.parseBoolean(str6);
        bool6 = Boolean.valueOf(str6);
        String str7 = "asd";
        String str8 = "asd";
        String str9 = null;

        if (str7.equals(str8)) {
            System.out.println("Равно");
        }
        if (str7 == str8) {
            System.out.println("Равно");
        }
        if (str7.compareTo(str8) > 0) {
            System.out.println("Равно");
        }
        if (str7.equals(str9)) {
            System.out.println("Равно");
        }
        if (str7 == str9) {
            System.out.println("Равно");
        }
        //if (str7.compareTo(str9.) > 0) {
        //    System.out.println("Равно");
        //}
        String str10 = "abc qwe";
        String[] ch11 = str10.split(" ");
        if (str10.contains("c")) {
            System.out.println("str10 contains c");
        }
        if (str7.hashCode() == str8.hashCode()) {
            System.out.println("hashCode true");

        }
        System.out.println(str10.indexOf(" "));
        System.out.println(str10.length());
        String str10Replaced = str10.replace(' ', '&');
        char[] chsad = new char[0];
        char[][] c1 = new char[3][];
        for (int i = 0; i < 3; i++) {
            c1[i] = new char[i];
            for (int j = 0; j < i; j++) {
                c1[i][j] = (char) j;
            }

            System.out.println(c1[i].length);
        }
        for(char ccc :c1[2]){
            System.out.println(ccc);
        }

    }

    public abstract void delete(char newchar);
}
