package OOPs.Polymorphism;

public class Polymorphism1 {
    public static void main(String[] args) {
        Message msg;     //One reference var referring to 3 obj
        msg = new TextMessage();
        msg.send();
        msg = new VoiceMessage();
        msg.send();
        msg = new VideoMessage();
        msg.send();
    }
}
class Message {
    void send() {
        System.out.println("Message sent!") ;
    }
}
class TextMessage extends Message {
    void send() {
        System.out.println("Text Message sent!");
    }
}
class VoiceMessage extends Message {
    void send() {
        System.out.println("Voice Message sent!");
    }
}
class VideoMessage extends Message {
    void send() {
        System.out.println("Video Message sent!");
    }
}
/*
1. OOPs.Polymorphism can be defined as pillar of object-oriented programming, which enables a single entity of a class of exist in
multiple forms, or behave in multiple ways.
2. In our program we created one reference variable (msg) for Message class which can refer to 3 objects of subclasses. or
It acts as a one to many relation(1:3 in our case).
3. So OOPs.Polymorphism is nothing but more than one form.
4. But this is not the actual implementation of OOPs.Polymorphism we'll see that in our next code.
*/