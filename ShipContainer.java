
public abstract class ShipContainer {

    protected int containerID;

    /**
     * @default constructor which sets the containerID's default value to 100(starting)
     */
    public ShipContainer() {
        this.containerID = 100;


    }

    /**
     * @getter method which returns the containerID when called
     */

    public int getContainerID() {
        return containerID;
    }

    /**
     * @param containerID
     * @void method which sets the containerID
     */

    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    /**
     * @param contents
     * @void method which sets the contents
     */

    public void setContents(String contents) {


    }

    /**
     * @method returns an empty String as the default value
     */

    public String containerContentList() {
        return "";
    }

    /**
     * @void method which prints the contents that are stored in container ID
     */

    public void printContent() {
        System.out.print(containerID);

    }
}
