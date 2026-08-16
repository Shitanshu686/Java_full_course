# Round Robin CPU Scheduling

Round Robin is a **preemptive CPU scheduling algorithm** used in operating systems.

Each process is assigned a fixed time interval called a **Time Quantum** or **Time Slice**. The CPU executes each process for one time quantum and then moves to the next process in the ready queue.

## How It Works

1. Processes are placed in the Ready Queue.
2. The first process gets the CPU.
3. It executes for the given Time Quantum.
4. If the process is not completed, it is moved to the end of the queue.
5. The next process gets the CPU.
6. This continues until all processes are completed.

## Example

Processes:

| Process | Burst Time |
|---------|------------|
| P1      | 5          |
| P2      | 4          |
| P3      | 2          |

Time Quantum:

```text
2
