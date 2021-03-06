public class Container {

    private TrashType trashType;
    private String name;

    public Container(String containerName, TrashType trashType) {
        this.trashType = trashType;
        name = containerName;
    }
    public int checkRecycling(Trash trash) {
        if (trash != null) {
            if (trashType == trash.getTrashType()) {
                System.out.println("You sorted correctly");
                System.out.println("You get a point!");
                return 1;
            } else {
                System.out.println("Sorting incorrect!");
                System.out.println("I'll take one of your points!");
                return -1;
            }
        }
        return 0;

    }
}
