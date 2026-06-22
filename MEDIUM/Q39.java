import java.util.TreeSet;

class ExamRoom {

    private int n;

    private TreeSet<Integer> seats;

    public ExamRoom(int n) {

        this.n = n;

        seats = new TreeSet<>();
    }

    public int seat() {

        if(seats.isEmpty()) {

            seats.add(0);

            return 0;
        }

        int prev = -1;

        int student = 0;

        int distance = seats.first();

        for(int s : seats) {

            if(prev != -1) {

                int d = (s - prev) / 2;

                if(d > distance) {

                    distance = d;

                    student = prev + d;
                }
            }

            prev = s;
        }

        if(n - 1 - seats.last() > distance) {

            student = n - 1;
        }

        seats.add(student);

        return student;
    }

    public void leave(int p) {

        seats.remove(p);
    }
}
 class ExamRoomDemo {

    public static void main(String[] args) {

        ExamRoom room =
                new ExamRoom(10);

        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());

        room.leave(4);

        System.out.println(room.seat());
    }
}