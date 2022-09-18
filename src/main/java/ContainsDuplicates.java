public class ContainsDuplicates {
    public boolean containsDuplicates(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) return true;
            }
        }
        return false;
    }
}
