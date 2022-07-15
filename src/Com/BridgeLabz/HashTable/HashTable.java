package Com.BridgeLabz.HashTable;

public class HashTable {
    public static void main(String[] args) {

            HashTableImplementation<String, Integer> hashImpl = new HashTableImplementation<String, Integer>();
            String message = "Paranoids are not\r\n" + "paranoid because they are paranoid but\r\n"
                    + "because they keep putting themselves\r\n" + "deliberately into paranoid avoidable\r\n"
                    + "situations";

            /*
             * Split the words when a white space comes up and Convert all the words in
             * lowercase
             */
            String[] messageArray = message.toLowerCase().split(" ");

            for (String word : messageArray) {
                /*
                 * Search for the word in the linked list
                 */
                Integer value = hashImpl.get(word);
                /*
                 * If not found, frequency of the word StayWith 1
                 */
                if (value == null)
                    value = 1;
                else
                    /*
                     * If found, frequency of the word increases by 1
                     */
                    value = value + 1;
                hashImpl.add(word, value);
            }
            System.out.println(hashImpl);
        }
    }

