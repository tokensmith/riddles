package org.rootservices;

/**
 * In a party of N people, only one person is known to everyone. Such a person may be present in the party,
 * if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
 * Find the stranger (celebrity) in minimum number of questions.
 */
public class Celebrity {

    // Person with 2 is celebrity
    private static int MATRIX[][] = { { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };

    // Returns true if a knows b, false otherwise
    public boolean knows(int a, int b)
    {
        boolean res = (MATRIX[a][b] == 1) ? true : false;
        return res;
    }

    // Returns -1 if celebrity is not present.
    // If present, returns id (value from 0 to n-1).
    public int findCelebrity(int n)
    {
        // Initialize two pointers as two corners
        int a = 0;
        int b = n - 1;

        // Keep moving while the two pointers
        // don't become same.
        while (a < b)
        {
            if (knows(a, b))
                a++;
            else
                b--;
        }

        // Check if a is actually a celebrity or not
        for (int i = 0; i < n; i++)
        {
            // If any person doesn't know 'a' or 'a'
            // doesn't know any person, return -1
            if (i != a && (knows(a, i) || !knows(i, a)))
                return -1;
        }
        return a;
    }
}
