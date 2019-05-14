public class Leafy extends Tree {
    private String type;

    public Leafy(Branch trunk){
        super(trunk);
        type = "Leafy";
    }

    @Override
    public void grow(int years) {
        for(int i = 0; i < years; i++){
            for(int j = 0; j < trunk.getNumbersOfBranches(); j++){
                trunk.getBranch(j).grow("leaf");
            }
            trunk.grow("leaf");
        }
    }

    @Override
    public String toString() {
        return "I am leafy tree and I am " + trunk.getAge() + " years old";
    }
}
