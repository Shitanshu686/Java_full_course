public class RoundRobin {

    public static void main(String[] args) {

        int[] process = { 1, 2, 3, 4, 5 };

        int[] arrivalTime = { 0, 1, 2, 3, 4 };

        int[] burstTime = { 5, 3, 4, 2, 3 };

        int[] remainingTime = { 5, 3, 4, 2, 3 };

        int[] completionTime = { 0, 0, 0, 0, 0 };

        int[] turnaroundTime = { 0, 0, 0, 0, 0 };

        int[] waitingTime = { 0, 0, 0, 0, 0 };

        // --------------------------------
        // MANUAL READY QUEUE
        // --------------------------------

        int[] queue = new int[100];

        int front = 0;

        int rear = 0;

        // Process already queue me add hua ya nahi
        int[] added = { 0, 0, 0, 0, 0 };

        int timeQuantum = 2;

        int currentTime = 0;

        int completed = 0;

        // --------------------------------
        // P1 initially ready
        // --------------------------------

        queue[rear] = 0;

        rear++;

        added[0] = 1;

        // --------------------------------
        // MAIN LOOP
        // --------------------------------

        while (completed < 5) {

            // --------------------------------
            // FRONT se manually process nikalo
            // --------------------------------

            int currentProcess = queue[front];

            front++;

            System.out.println();

            System.out.println(
                    "P" + process[currentProcess]
                            + " is running");

            // --------------------------------
            // Decide execution time
            // --------------------------------

            int runTime;

            if (remainingTime[currentProcess] > timeQuantum) {

                runTime = timeQuantum;

            } else {

                runTime = remainingTime[currentProcess];
            }

            // --------------------------------
            // CPU execution
            // --------------------------------

            System.out.println(
                    currentTime
                            + " -> "
                            + (currentTime + runTime));

            currentTime = currentTime + runTime;

            // --------------------------------
            // Remaining burst time
            // --------------------------------

            remainingTime[currentProcess] = remainingTime[currentProcess]
                    - runTime;

            // --------------------------------
            // NEW ARRIVALS
            // --------------------------------

            for (int i = 0; i < 5; i++) {

                if (arrivalTime[i] <= currentTime) {

                    if (added[i] == 0) {

                        queue[rear] = i;

                        rear++;

                        added[i] = 1;

                        System.out.println(
                                "P" + process[i]
                                        + " added to queue");
                    }
                }
            }

            // --------------------------------
            // CURRENT PROCESS
            // --------------------------------

            if (remainingTime[currentProcess] == 0) {

                completionTime[currentProcess] = currentTime;

                completed++;

                System.out.println(
                        "P" + process[currentProcess]
                                + " COMPLETED");

            } else {

                // Process complete nahi hua
                // queue ke END me jayega

                queue[rear] = currentProcess;

                rear++;

                System.out.println(
                        "P" + process[currentProcess]
                                + " goes to END of queue");
            }

            // --------------------------------
            // QUEUE DISPLAY
            // --------------------------------

            System.out.print("Queue: ");

            for (int i = front; i < rear; i++) {

                System.out.print(
                        "P" + process[queue[i]]
                                + " ");
            }

            System.out.println();
        }

        // --------------------------------
        // TAT and WT
        // --------------------------------

        for (int i = 0; i < 5; i++) {

            turnaroundTime[i] = completionTime[i]
                    - arrivalTime[i];

            waitingTime[i] = turnaroundTime[i]
                    - burstTime[i];
        }

        // --------------------------------
        // FINAL TABLE
        // --------------------------------

        System.out.println();

        System.out.println(
                "Process\tAT\tBT\tCT\tTAT\tWT");

        for (int i = 0; i < 5; i++) {

            System.out.println(
                    "P" + process[i]
                            + "\t"
                            + arrivalTime[i]
                            + "\t"
                            + burstTime[i]
                            + "\t"
                            + completionTime[i]
                            + "\t"
                            + turnaroundTime[i]
                            + "\t"
                            + waitingTime[i]);
        }
    }
}