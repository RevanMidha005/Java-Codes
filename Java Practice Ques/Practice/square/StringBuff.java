package Practice.square;

public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("01234567891111111111");
        //System.out.println(sb.capacity());
        //System.out.println(sb.length());
        //sb.append("def");
        System.out.println(sb);
        String str = sb.toString();

        //sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(10, "ghi");
        System.out.println(sb + " " + sb.length());
    }
}
