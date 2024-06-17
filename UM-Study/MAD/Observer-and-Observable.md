# Observer and Observable

If you've read the [Observable](https://developer.android.com/reference/android/database/Observable) article on the official Android website, you might find it confusing.

> Observer provides methods to register or unregister various observers in an ArrayList. This abstract class is designed to be subclassed and specialized to maintain a registry of specific observer types and dispatch notifications to them.

You might wonder: What exactly is an observer? What does observable mean? What is registration? Don't worry; this article aims to demystify these terms and provide a clear explanation of observers and observables.

## Observer pattern

The observer is a design pattern. For more information, please refer to [Observer pattern](https://refactoring.guru/design-patterns/observer). In essence, the observer pattern consists of two main classes: the subscriber and the publisher. Think of it like a YouTube subscription: you receive notifications when a YouTuber you've subscribed to uploads a new video. Similarly, the publisher will notify the subscriber when there's something new.

In this context, the observer acts as the subscriber, while the observable is the publisher. The observable notifies the observer about any updates to the data it holds.

Refer to the following code:

**`Publisher.java`**

```java
public class Publisher {
    private ArrayList<Subscriber> subscriberList;

    public void addSubscriber(Subscriber subscriber) {
        // Implementation of the logic
    };

    public void removeSubscriber(Subscriber subscriber) {
        // Implementation of the logic
    };

    public void notifySubscribers() {
        for(Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    };
}
```

**`Subscriber.java`**

```java
public interface Subscriber {
    public void update();
}
```

**`MySubscriber.java`**

```java
public class MySubscriber implements Subscriber {
    @Override
    public void update() {
        // Implementation of the logic
    }
}
```

The code snippets are respectively belonged to `Publisher.java`, `Subscriber.java` and `MySubscriber.java`. As you can see, when the `Publisher` sends a notification, every `Subscriber` will be updated.

For an analogy, consider the observable as the YouTube system and the observer as the users. The YouTube system notifies users when their favorite YouTubers post new videos. Similarly, you can think of the observable as a company CEO and the observer as the stakeholders. The CEO informs the stakeholders whenever there's a significant change in the company's value.

For a more detailed analogy of stakeholders and the company CEO, consider the following explanation:

> **Observable as the CEO:** Just like a CEO manages and oversees the company's operations and informs stakeholders about significant changes, the observable manages the data. It monitors the data and, whenever there's a change, it takes responsibility for notifying all interested parties, the observers.
>
> **Observer as the Stakeholder:** Stakeholders are interested in the company's performance and rely on the CEO for updates. Similarly, observers are interested in the data (the company's value) and rely on the observable to inform them of any changes. They don't need to constantly check the data themselves; they simply wait for the observable to notify them.
>
> **Data as Company Value:** The data represents the company's value or status. Just as the value of a company can change due to various factors, the data can change for various reasons. Observers are interested in the data's current state and any changes over time, much like stakeholders are interested in the company's performance and growth.
>
> In short, the observable acts like a manager or mediator between the data and the observer. It detects changes in the data and is responsible for notifying the observers about these changes, ensuring that they are always up-to-date with the latest information without having to monitor the data themselves constantly. This system allows for a clean and efficient flow of information, making it easier to manage complex interactions in software, especially in user interfaces.

## Definition

**Observable**: This is something that holds data and allows others to be notified when that data changes. In the case of LiveData, the observable is the LiveData itself because it holds data and notifies observers when the data changes.

**Observer**: This is something that wants to be informed when the data in the observable changes. It "observes" the observable. In an Android app, this might be a UI component that needs to update what it shows on the screen when the data changes.
