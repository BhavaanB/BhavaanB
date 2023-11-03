public class ManualContentList extends ShipContainer {
    private String contents;

    /**
     * @the constructor calls super and sets contents to a default value
     */

    ManualContentList() {
        super();
        this.contents = "";

    }

    /**
     * @param newID
     * @the constructor takes newID and passes it in setContainerID by calling the superclass
     */

    ManualContentList(int newID) {
        super.setContainerID(newID);

    }

    /**
     * @param contents
     * @the void method takes a String and sets the value
     */
    public void setContents(String contents) {
        this.contents = contents;

    }

    /**
     * @the constructor returns the contents which is a String
     */
    public String containerContentList() {
        return contents;
    }

}
