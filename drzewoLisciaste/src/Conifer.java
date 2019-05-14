public class Conifer extends Tree {
    private String type;

    public Conifer(Branch trunk){
        super(trunk);
        type = "Conifer";
    }

    @Override
    public void grow(int years) {
        for(int i = 0; i < years; i++){
            for(int j = 0; j < trunk.getNumbersOfBranches(); j++){
                trunk.getBranch(j).grow("needle");
            }
            trunk.grow( "needle");
        }
    }

    @Override
    public String toString() {
        return "I am conifer and I am " + trunk.getAge() + " years old";
    }
}