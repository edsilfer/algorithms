package br.com.edsilfer.algorithms.exercises;

import br.com.edsilfer.algorithms.util.datastructure.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * We're going to make our own Contacts application! The application must perform two types of operations:
 * <p>
 * add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
 * find partial, where  is a string denoting a partial name to search the application for. It must count the number of contacts starting with  and print the count on a new line.
 * Given  sequential add and find operations, perform each operation in order.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of operations to perform.
 * Each line  of the  subsequent lines contains an operation in one of the two forms defined above.
 * <p>
 * Constraints
 * <p>
 * It is guaranteed that  and  contain lowercase English letters only.
 * The input doesn't have any duplicate  for the  operation.
 * Output Format
 * <p>
 * For each find partial operation, print the number of contact names starting with  on a new line.
 * <p>
 * Sample Input
 * <p>
 * 4
 * add hack
 * add hackerrank
 * find hac
 * find hak
 * Sample Output
 * <p>
 * 2
 * 0
 * Explanation
 * <p>
 * We perform the following sequence of operations:
 * <p>
 * Add a contact named hack.
 * Add a contact named hackerrank.
 * Find and print the number of contact names beginning with hac. There are currently two contact names in the application and both of them start with hac, so we print  on a new line.
 * Find and print the number of contact names beginning with hak. There are currently two contact names in the application but neither of them start with hak, so we print  on a new line.
 */
public class Exercise004 {

    private static Trie root = new Trie();

    public static void main(String argv[]) {
        List<String> commands = new ArrayList<>();

        commands.add("add hack");
        commands.add("add hackerrank");
        commands.add("add hacp");
        commands.add("find hac");
        commands.add("find hak");

        for (String command : commands) {
            String[] parts = command.split(" ");
            parseCommand(parts[0], parts[1]);
        }
    }

    private static void parseCommand(String command, String value) {
        switch (command) {
            case "add":
                root.insert(value);
                break;
            case "find":
                System.out.println(root.count(value));
                break;
            default:
                throw new IllegalArgumentException("Command not found!");
        }
    }

}
