public class Leaf {
    private Branch parent;
    private int size;
    private String type;

    public Leaf(Branch parent, String type){
        this.parent = parent;
        this.size = 5;
        this.type = type;
    }

    public Branch getParent(){
        return parent;
    }

    public int getSize(){
        return size;
    }
    public String getType(){
        return type;
    }

    public void setSize(int size){
        this.size += size;
    }
}
