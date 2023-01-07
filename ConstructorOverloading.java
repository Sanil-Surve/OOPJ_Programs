public class Box {
    int height,depth,length;
    Box(){
        height=depth=length=10;
    }
    Box(int x,int y){
        height=x;
        depth=y;
    }
    Box(int x,int y,int z){
        height=x;
        depth=y;
        length=z;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Box a=new Box();
        System.out.println("Depth of a: "+a.depth);
       Box b=new Box(12,13);
        System.out.println("Depth of b: "+b.depth);
        Box c=new Box(99,84,36);
        System.out.println("Depth of c:"+c.depth);
    }
}
