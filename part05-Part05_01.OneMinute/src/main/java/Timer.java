public class Timer {
    int seconds;
    int hundreds;
    public Timer(){
        this.seconds=seconds;
        this.hundreds=hundreds;
    }

    public void advance(){
        this.hundreds++;
        if(this.hundreds>=100){
            this.hundreds=0;
            this.seconds++;
        }
        if(this.seconds>=60){
            this.seconds=0;
        }
    }

    public String toString(){
        if(this.seconds<10&&this.hundreds<10){
        return "0"+this.seconds+":0"+this.hundreds;
        } else if(this.hundreds<10){
            return this.seconds+":0"+this.hundreds;
        } else if(this.seconds<10){
            return "0"+this.seconds+":"+this.hundreds;
        }
        else {
            return this.seconds+":"+this.hundreds;
        }
    }
}
