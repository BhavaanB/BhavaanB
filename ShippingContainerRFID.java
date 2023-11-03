import java.util.LinkedList;

public class ShippingContainerRFID extends ShipContainer {
    LinkedList<Integer> count;
    LinkedList<String> contents;

    /**
     * @param newID
     * @the constructor takes newID and stored it and passes it in setContainerID
     */

    ShippingContainerRFID(int newID) {
        super.setContainerID(newID);
        count = new LinkedList<Integer>();
        contents = new LinkedList<String>();


    }

    /**
     * @param s
     * @the constructor takes a String and will return at which index is the string in the given linkedlist
     */
    private int searchItem(String s) {
        return contents.indexOf(s);

    }

    /**
     * @param s
     * @the constructor will set the contents by adding items into the contents and increment count by 1 when called
     */
    public void setContents(String s) {
        if (contents.contains(s)) {
            int position = searchItem(s);
            int currentAmount = count.get(position);
            count.set(position, currentAmount += 1);
        } else {
            contents.add(s);
            count.add(1);


        }

    }

    /**
     * @the method will return a String of all the items that were added
     */
    public String containerContentList() {
        String final_output = "";
        for (int counter = 0; counter < contents.size(); counter += 1) {
            String quantity = String.valueOf(count.get(counter));
            String name = contents.get(counter);
            final_output += quantity + " " + name + ". ";

        }
        return final_output;
    }


}
