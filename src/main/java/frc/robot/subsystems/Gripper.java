package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gripper extends SubsystemBase {

    private SpeedController speedController;
    private DigitalInput digitalInput;


    public Gripper(SpeedController speedController, DigitalInput digitalInput) {
        this.speedController = speedController;
        this.digitalInput = digitalInput;

    }
    public void grip(){
        speedController.set(0.5);
    }

    public void release(){
        speedController.set(-0.5);
    }

    public void stopGripper(){
        speedController.stopMotor();
    }

    public boolean hasBall(){
        return digitalInput.get();
    }

}
