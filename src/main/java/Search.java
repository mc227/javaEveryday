public class Search {
    public int search(String strToMatch, String[] strArray){
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(strToMatch)) {
                return i;
            }
        }
        return -1;
    }
}
