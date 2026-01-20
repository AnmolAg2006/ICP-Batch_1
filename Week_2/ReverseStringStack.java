import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {

        String s = "Anmol";                 // Original string
        Stack<Character> st = new Stack<>();

        // Step 1: String ke har character ko stack me push karo
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));           
        }

        String rev = "";                    
        // Step 2: Stack se characters pop karke reverse string banao
        while (!st.isEmpty()) {
            rev += st.pop();                // Last element niklega → reverse order
        }

        System.out.println("Reversed String: " + rev);
    }
}
