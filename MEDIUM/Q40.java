import java.util.HashSet;

class TilePossibilities {

    static HashSet<String> set =
            new HashSet<>();

    static void backtrack(
            String prefix,
            String remaining) {

        if(prefix.length() > 0)
            set.add(prefix);

        for(int i = 0;
            i < remaining.length();
            i++) {

            backtrack(
                    prefix +
                            remaining.charAt(i),

                    remaining.substring(0, i)
                            +
                            remaining.substring(i + 1));
        }
    }

    public static void main(String[] args) {

        String tiles = "AAB";

        backtrack("", tiles);

        System.out.println(
                "Possible Sequences = "
                        + set.size());

        System.out.println(set);
    }
}