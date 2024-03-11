public class Container {
    private int first;
    public Container(){
        this.first=0;
    }
    public int contains(){
        return first;
    }
    public void add(int a){
        if(a>0&&a+first<=100){
            first+=a;
        } else if(a>0){
            first=100;
        }
        
    }
    public void remove(int r){
        if(r>0){
            first-=r;
        }
        if(first<0){
            first =0;
        }
    }
    public String toString(){
        return first+"/100";
    }
    
}
