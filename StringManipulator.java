public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        String output = a.trim() + b.trim();
        return output;
    }

    public Integer getIndexOrNull(String str, char a) {
        Integer result = str.indexOf(a);
        if(result == -1) {
            return null;
        }
        return result;
    }

    public Integer getIndexOrNull(String a, String b) {
        Integer result = a.indexOf(b);
        if(result == -1) {
            return null;
        }
        return result;
    }

    public String concatSubstring(String str, int start, int end, String str2) {
        String substr = str.substring(start, end);
        String output = substr.concat(str2);
        return output;
    }
}