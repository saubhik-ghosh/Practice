
public class stringBuffer {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1 += "This program is an example of StringBuffer class functions.";
        StringBuffer strbuf1 = new StringBuffer();
        System.out.print(strbuf1.length() + "\n");
        strbuf1.append(str1);
        System.out.println(strbuf1);
        strbuf1.delete(0, str1.length());
        strbuf1.append("Hello");
        strbuf1.append("World");
        System.out.println(strbuf1);
        // insert()
        strbuf1.insert(3, 6);
        //CharAt()
        System.out.println(strbuf1.charAt(6));
        //Sub String()
        System.out.print("Substring from position 3 to 6: ");
        System.out.println(strbuf1.substring(3, 7));
        //deleteCharAt()
        strbuf1.deleteCharAt(3);
        System.out.println(strbuf1);
        //capacity()
        System.out.println("Capacity of String buffer is"+ strbuf1.capacity());
    }
}
