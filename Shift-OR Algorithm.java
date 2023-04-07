import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class shiftorexample {
    public static void main(String[] args) {
        String filename = "alice_in_wonderland.txt"; // okunacak dosyanın adı
        String[] keywords = {"upon", "sigh", "Dormouse","jury-box","swim"}; // sayılacak anahtar kelimeler

        // Anahtar kelimelerin bit maskelemesi
        Map<Character, Integer> mask = new HashMap<>();
        int m = keywords.length;
        for (int i = 0; i < m; i++) {
            String keyword = keywords[i];
            int n = keyword.length();
            int bitMask = 1 << i;
            for (int j = 0; j < n; j++) {
                char c = keyword.charAt(j);
                if (!mask.containsKey(c)) {
                    mask.put(c, 0);
                }
                mask.put(c, mask.get(c) | bitMask);
            }
        }

        // Dosyayı oku ve Shift-Or algoritması uygula
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int[] state = new int[m];
            while ((line = reader.readLine()) != null) {
                int n = line.length();
                for (int i = 0; i < n; i++) {
                    char c = line.charAt(i);
                    if (mask.containsKey(c)) {
                        int bitMask = mask.get(c);
                        int oldState = state[m - 1];
                        int newState = ((oldState << 1) | 1) & bitMask;
                        state[m - 1] = newState;
                        for (int j = m - 2; j >= 0; j--) {
                            oldState = state[j];
                            newState = ((oldState << 1) | 1) & bitMask;
                            state[j] = (state[j + 1] | newState) ^ newState;
                        }
                        if ((state[0] & 1) != 0) {
                            System.out.println("Anahtar kelime bulundu: " + line.substring(i - m + 1, i + 1));
                            state[0] = 0;
                        }
                    } else {
                        state = new int[m];
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


