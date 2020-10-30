package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {

    private SpeedController speedController;
    private int currentBalls;
    private static final int MAX_BALLS_CAPACITY=5;

    public Feeder(SpeedController speedController) {
        this.speedController = speedController;
        this.currentBalls = 0;
    }

    public void addBall() {
        currentBalls++;
    }

    public void removeBall(){
        currentBalls--;
    }

    public boolean checkIfLessThanMax(){
        return currentBalls<MAX_BALLS_CAPACITY;
    }
    
    public void feed(){
        speedController.set(0.5);
    }

    public void stopFeeder(){
        speedController.stopMotor();
    }


}
