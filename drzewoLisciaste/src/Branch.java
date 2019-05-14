import java.util.ArrayList;

public class Branch {
    private Branch parent;
    private int size;
    private int age;
    private ArrayList<Leaf> leafs;
    private ArrayList<Branch> branches;

    public Branch(){
        parent = null;
        size = 1;
        age = 0;
        leafs = new ArrayList<Leaf>();
        branches = new ArrayList<Branch>();
    }
    public Branch(Branch parent){
        this();
        this.parent = parent;
    }

    public Branch getParent(){
        return parent;
    }

    public int getSize(){
        return size;
    }

    public int getAge(){
        return age;
    }

    public void setSize(int size){
        this.size += size;
    }

    public void setAge(int age){
        this.age += age;
    }

    public void resetSize(){
        this.size = 1;
    }

    public int getNumbersOfLeafs(){
        return leafs.size();
    }

    public int getNumbersOfBranches(){
        return branches.size();
    }

    public Leaf addLeaf(String type){
        Leaf leaf = new Leaf(this, type);
        leafs.add(leaf);
        return leaf;
    }

    public Branch addBranch(){
        Branch branch = new Branch(this);
        branches.add(branch);
        return branch;
    }

    public Leaf getLeaf(int i){
        return leafs.get(i);
    }

    public Branch getBranch(int i){
        return branches.get(i);
    }

    public void grow( String type){
        for(int i = 0; i < 5; i++){
            addLeaf(type);
        }
        for (int i = 0; i < branches.size(); i++) {
            branches.get(i).grow(type);
        }
        setAge(1);
        setSize(5);
        addBranch();
    }

    public Leaf removeLeaf(int i){
        return leafs.remove(i);
    }

    public Branch removeBranch(int i){
        return branches.remove(i);
    }

    public void removeLeafs(){
        leafs.clear();
    }

    public void removeBranches(){
        branches.clear();
    }
}
