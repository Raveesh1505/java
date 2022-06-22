class box{
    float width, height, depth;
    box(int h, int w, int d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
}

class boxWeight extends box{
    float h, w, d;
    boxWeight(){
        h = super.height;
        w = super.width;
        d = super.depth;
    }
    float showWeight(){
        return h*w*d;
    }
}

public class boxTest {
    public static void main(String[] args){
        
    }
}
