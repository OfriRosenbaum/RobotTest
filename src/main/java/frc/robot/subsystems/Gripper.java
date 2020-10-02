package frc.robot.subsystems;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gripper extends SubsystemBase {
    private SpeedController speedController;


    public Gripper(SpeedController speedController) {
        this.speedController = speedController;

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


}
