// fat interface
public interface Worker {
    void work();
    void eat();
    void sleep();
    void attendMeetings();
}

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot doesn't sleep");
    }

    @Override
    public void attendMeetings() {
        throw new UnsupportedOperationException("Robot doesn't attend meetings");
    }
}
