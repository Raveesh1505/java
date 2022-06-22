import java.util.Scanner;

class Box {
    float width;
    float height;
    float depth;
Box(){
    width=0;
    height=0;
    depth=0;
}
Box(float w, float h, float d){
    this.width=w;
    this.height=h;
    this.depth=d;
}
Box(Box ob1){
this.width = ob1.width;
this.height = ob1.height;
this.depth = ob1.depth;
}

public float getwidth(){ return width; }
public float getheight(){ return height; }
public float getdepth(){ return depth; }

public void displayVolume() {
    System.out.println("The Volume of the Box is : " + (width*depth*height)); 
}
}


class BoxWeight extends Box{
    float weight;
    BoxWeight() { weight = 0; }
    BoxWeight(float w, float h, float d, float wt){
        super(w,h,d);
        this.weight = wt;
    }
    BoxWeight(BoxWeight ob2){
       super(ob2.width, ob2.height, ob2.depth);
       this.weight = ob2.weight;
    }
    public float getWeight() { 
        return weight; 
    }
    public void displayWeight() {
        System.out.println("The Weight of the Box is: " +weight);
    }
}

public class BoxWeightDemo{
    public static void main(String[] args){
           BoxWeight bw1= new BoxWeight(5, 6,7, 8);
            BoxWeight bw2= new BoxWeight(bw1);
           bw2.displayVolume();
           bw2.displayWeight();
    }
}