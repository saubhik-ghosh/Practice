public class String_buffer_capacity {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println("s.capacity() "+s.capacity());
        s.append("abcdefgh"); //8
        System.out.println("s.capacity() "+s.capacity()); //16
        s.append("ijklmnop"); //8+8=16
        System.out.println("s.capacity() "+s.capacity()); //16
        s.append("qrst"); //16*2+2
        System.out.println("s.capacity() "+s.capacity()); //34
    }
}
