public class Box{
    int width, height, depth;
    Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Width: "+width+"\n"+"Height: "+height+"\n"+"Depth: "+depth);
    }
    int volume(){
        int vol = width*depth*height;
        return vol;
    }
    public static void main(String[] args){
        Box obj = new Box(2, 3, 2);
        System.out.println("Volume of the Box -> "+obj.volume());
    }
}