package m18_string_class_part2;

public class MutableSequenceCharacters {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");

        stringBuilder.append("17");

        System.out.println(stringBuilder);

        stringBuilder.reverse();

        System.out.println(stringBuilder);

        String result = stringBuilder.toString();

        System.out.println(result);

        StringBuffer stringBuffer = new StringBuffer("Python");

        stringBuffer.append(" Programming");
        stringBuffer.reverse();
        stringBuffer.toString();
        String result2 = stringBuffer.toString();
        System.out.println(result2);
    }
}
