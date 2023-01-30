
public class StringBuffer_program {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println("sb capacity : "+ sb.capacity());
        System.out.println("sb-length : " + sb.length() );
        System.out.println("sb-append : "+ sb.append(" Reddy"));
        System.out.println("sb-insert : "+ sb.insert(0, "Hello "));
        System.out.println("sb-insert after speficed chars index : "+ sb.insert(6, " Java "));
        sb.setLength(30);
        System.out.println("sb_after set_length_30 : "+ sb.length());
        System.out.println("sb-delete by index : "+ sb.deleteCharAt(2));

    }
}
