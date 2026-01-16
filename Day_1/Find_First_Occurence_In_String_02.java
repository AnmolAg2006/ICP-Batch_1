public class Find_First_Occurence_In_String_02 {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        // indexOf() returns the index of the first occurrence of needle in haystack
        // If needle is not found, it returns -1
        System.out.print(haystack.indexOf(needle));
    }
}