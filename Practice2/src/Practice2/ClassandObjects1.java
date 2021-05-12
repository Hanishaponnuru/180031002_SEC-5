package Practice2;

public class ClassandObjects1{

    double h,w,d;

     ClassandObjects1(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
   ClassandObjects1 bc = new ClassandObjects1(8.5,80.3,9.6);
    System.out.println(bc.volume());

    }

}