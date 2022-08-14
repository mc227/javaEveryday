import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<LineItem> lines = new ArrayList<>();
        List<String> file1Content = new ArrayList<>(Arrays.asList("line1", "line2"));
        List<String> file2Content = new ArrayList<>(Arrays.asList("line1",         "line3"));
        int index1 = 0, index2 = 0;
        String file1Line = null;
        String file2Line = null;
        while (index1<file1Content.size() && index2<file2Content.size()){
            file1Line=file1Content.get(index1);
            file2Line=file2Content.get(index2);

            if (file1Line.equals(file2Line)) {
                lines.add(new LineItem(Type.SAME, file2Line));
                index1++; index2++;
            }
            else {
                if (index1 + 1 < file1Content.size() && file2Line.equals(file1Content.get(index1 + 1))) {
                    lines.add(new LineItem(Type.REMOVED, file1Content.get(index1)));
                    index1++;
                } else {
                    lines.add(new LineItem(Type.REMOVED, file1Line));
                    lines.add(new LineItem(Type.ADDED, file2Line));
                    index2++;
                }
            }
        }
        if (file1Content.size()>file2Content.size()){
            for (int i=index1++;i<file1Content.size();i++){
                file1Line=file1Content.get(i);
                lines.add(new LineItem(Type.REMOVED,file1Line));
            }
        }
        if (file2Content.size()>file1Content.size()){
            for (int i=index2++;i<file2Content.size();i++){
                file2Line=file2Content.get(i);
                lines.add(new LineItem(Type.ADDED,file2Line));
            }
        }
        for(int i=0;i<lines.size();i++){
            System.out.println(lines.get(i).type + " " + lines.get(i).line);
        }
    }
    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
