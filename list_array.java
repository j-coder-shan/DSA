public class list_array {
    int[] list;
    int size, count;
    list_array(int maxSize){
        size = maxSize;
        list = new int[size];
        count = 0;
    }
    public boolean isListEmpty(){
        return count == 0;
    }
    public boolean isListFull(){
        return count == size;
    }
    public void insertLast(int value){
        if(isListFull()){
            System.out.println("List is full!");
        }
        else {
            System.out.println(STR."Inserting last: \{value}");
            list[count++] = value;
        }
    }
    public void insertList(int position, int value){
        if(isListFull()){
            System.out.println("List is full!");
        } else if (0 > position || position >= size) {
            System.out.println("Entered position is out of bound!");
        }else {
            System.out.println(STR."Inserting value \{value} at index \{position}.");
            for (int i = count - 1; i >= position ; i--) {
                list[i + 1] = list[i];
            }
            list[position] = value;
            count++;
        }
    }
    public void deleteList(int position){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else if (0 > position || position >= size) {
            System.out.println("Entered position is out of bound!");
        } else {
            System.out.println(STR."Deleting value \{list[position]} at index \{position}.");
            for (int i = position; i < count - 1 ; i++) {
                list[i] = list[i +1];
            }
            count--;
        }
    }
    public void retrieveList(int position){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else if (0 > position || position >= size) {
            System.out.println("Entered position is out of bound!");
        } else {
            System.out.println(STR."Retriving value \{list[position]} at index \{position}.");
        }
    }
    public void replaceList(int position, int value){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else if (0 > position || position >= size) {
            System.out.println("Entered position is out of bound!");
        } else {
            System.out.println(STR."value (\{list[position]}) at index \{position} is replaced with \{value}.");
            list[position] = value;
        }
    }
    public void traverseList(){
        if(isListEmpty()){
            System.out.println("List is empty!");
        }else {
            System.out.println("Displaying list:");
            for (int i = 0; i < count; i++) {
                System.out.print(STR."\{list[i]} ");
            }
            System.out.println(" ");
        }
    }
}
