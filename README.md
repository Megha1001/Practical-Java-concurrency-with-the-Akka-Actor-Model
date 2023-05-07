# Practical-Java-concurrency-with-the-Akka-Actor-Model

# Concurrent Programming and Actor Model

This readme file explains the challenges of concurrent programming and how the actor model can help mitigate these challenges.

## Why Concurrent Programming is Difficult

Concurrent programming involves executing multiple threads simultaneously. This can lead to a number of challenges, including:

- **InterruptedException:** This is thrown when the `join()` or `sleep()` methods are called on a thread.
- **ConcurrentModificationException:** This occurs when two or more threads try to access the same variable that is not thread-safe.
- **Thread Blocking:** A thread may get blocked while waiting for a resource, causing other threads to wait as well.

## The Actor Model

One way to address the challenges of concurrent programming is to use the actor model. In the actor model, each actor is an object that has a number of key features, including a name and a path.

The path allows an actor to be uniquely identified, while the message queue is where messages that are sent to an actor are stored. An actor's behavior is defined by a set of rules that dictate what it should do when it receives a message. An actor can either ignore the message, respond to it, or run some code.

Messages can be any class that is serializable, and they are processed one at a time. Since each actor has its own thread and its own state, there is no sharing of data across threads. This eliminates issues related to thread safety.

In the actor model, messages must be immutable, which means that they cannot be modified once they are created. This further ensures that actors do not share data, preventing issues related to concurrent access.

## Example: Getting the Next Probable Prime Number

To demonstrate the actor model in action, consider the problem of getting the next probable prime number. The following diagram illustrates the actor model for this problem:

In this model, the `PrimeNumberActor` receives a message containing a number. It then calculates the next probable prime number and sends it to the `PrinterActor`, which prints the number to the console.

Since each actor has its own thread and its own state, there is no sharing of data between the `PrimeNumberActor` and the `PrinterActor`. This eliminates issues related to thread safety and concurrent access.

## Conclusion

The actor model provides a powerful tool for addressing the challenges of concurrent programming. By ensuring that each actor has its own thread and its own state, and that messages are immutable, the actor model eliminates many of the issues related to thread safety and concurrent access.
