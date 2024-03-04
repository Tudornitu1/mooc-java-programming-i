public class Archive {
    String name;
    String identifier;
    
    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    @Override
    public boolean equals(Object compared){
        if(this==compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive comparedArchive=(Archive) compared;

        return this.identifier.equals(comparedArchive.identifier);
        
    }
    
    public String toString(){
        return "\n" + this.identifier+": "+this.name;
    }

    
}
