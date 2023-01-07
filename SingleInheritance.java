class Rectangle{
    int l,b;
    void Setval(int x,int y){
        l=x;
        b=y;}
    int GetRect(){
        return l*b;}}
class Triangle extends Rectangle{
    int b,h;
    float a;
    void SetData(int v,int u){
        b=u;
        h=v; }
    float GetTri(){
        a=(float)1/2*b*h;
        return(a);}}
public class SingleInheritance {
    public static void main(String args[]){
        Triangle Tri=new Triangle();
        Tri.Setval(50,8);
        Tri.SetData(17,7);
        System.out.println("Area of Rectangle: "+Tri.GetRect());
        System.out.println("Area of Triangle is: "+Tri.GetTri());
    }
}
