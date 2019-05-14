public abstract class Tree {
    protected Branch trunk;

    public Tree(){
        trunk = null;
    }

    public Tree(Branch trunk){
        this.trunk = trunk;
    }

    public abstract void grow(int years);

    public void cut(Branch branch){
        if(branch.getNumbersOfBranches() != 0){
            for(int i = 0; i < branch.getNumbersOfBranches(); i++){
                cut(branch.getBranch(i));
            }
            branch.removeLeafs();
            branch.removeBranches();
        } else {
            branch.removeLeafs();
        }
        trunk.resetSize();
    }

    @Override
    public String toString() {
        return "I am tree and I am " + trunk.getAge() + " years old";
    }
}
