public abstract class NamedThing {
    private String name;
    private String description;
    public NamedThing(String n, String d){
        name = n;
        description = d;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public String toString(){
        return "Name: " + name +
                "\nDescription: " + description;
    }
    public void doThing(){
        System.out.println(description);
    }
}
