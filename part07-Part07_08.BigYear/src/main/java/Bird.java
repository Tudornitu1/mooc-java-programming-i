public class Bird {
    private String name;
    private String latin;
    private int observations;
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations=0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLatin() {
        return latin;
    }
    public void setLatin(String latin) {
        this.latin = latin;
    }
    public void observation(){
        this.observations++;
    }
    public String toString(){
        return this.name+" ("+this.latin+"): "+this.observations+" observations";
    }
}
